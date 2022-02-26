package com.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.net.Socket;

import com.competition.dm.Contest;
import com.competition.dm.IDataModel;
import com.competition.dm.Match;
import com.competition.dm.Team;
import com.competition.server.RequestData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.model.ContestModel;
import com.model.TeamModel;
import com.utility.CompetitionUtility;


public class Client implements Runnable
{
	public String parsedRequest;
	int port;
	Socket socket;
	boolean shouldWaitForAnswer = false;
	Request toReturn;
	
	public Client(int port)
	{
		this.port = port;
	}
	
	public void set_request(Request re)
	{
		parsedRequest = parseRequestToString(re);
		if(re.get_action().equals("get"))
		{
			shouldWaitForAnswer = true;
		}
	}
	
	public Request getRequestAnswerFromServer()
	{
		return toReturn;
	}
	public String parseRequestToString(Request re)
	{
		
		JsonSerializer<Request> serializer = new JsonSerializer<Request>() {  
		    @Override
		    public JsonElement serialize(Request src, Type typeOfSrc, JsonSerializationContext context) {
		        JsonObject req = new JsonObject();

		        req.addProperty("action", src.get_action());
		        req.addProperty("objType", src.get_objType());
		        req.addProperty("amountOfObjects", src.get_data().length);
		        JsonArray dataArr = new JsonArray();
		        
		        IDataModel[] data = src.get_data();
		        if (data != null)
		        {
		        	for(int i = 0; i < data.length; i++)
		        	{
		        		dataArr.add(context.serialize(data[i]));
		        	}
		        }

		        req.add("data", dataArr);

		        return req;
		    }
		};
		
		GsonBuilder gson = new GsonBuilder();
		gson.registerTypeAdapter(RequestData.class, serializer);
		
		Gson gsonRep = gson.create();
		String answer = gsonRep.toJson(re);
		
		return answer;
	}
	
	public Request ParseRequestFromServer(String request)
	{
		
		JsonDeserializer<Request> deserializer = new JsonDeserializer<Request>()
		{  
		    @Override
		    public Request deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
		    {
		        JsonObject jsonObject = json.getAsJsonObject();
		        String action = jsonObject.get("action").getAsString();
		        String objType = jsonObject.get("objType").getAsString();
		        int amountOfObjects = jsonObject.get("amountOfObjects").getAsInt();
		        
		        Request re = new Request(action, objType, amountOfObjects);
		        Type type;
		        IDataModel[] data;
		        Gson gson = new Gson();
		        
		        switch(objType)
		        {
			        case "Team":
			        	data = new Team[amountOfObjects];
			        	type = new TypeToken<Team[]>(){}.getType();
			        	data = gson.fromJson(jsonObject.get("data"), type);
			        	
			        	re.set_data(data);
			        	break;
			        case "Match":
			        	data = new Match[amountOfObjects];
			        	type = new TypeToken<Match[]>(){}.getType();
			        	data = gson.fromJson(jsonObject.get("data"), type);
			        	
			        	re.set_data(data);
			        	break;
			        case "Contest":
			        	data = new Contest[amountOfObjects];
			        	type = new TypeToken<Contest[]>(){}.getType();
			        	data = gson.fromJson(jsonObject.get("data"), type);
			        	
			        	re.set_data(data);
			        	break;
		        	default:
		        		throw new JsonParseException("Wrong type of object");
		        }			        
		        return re;
		    }
		};
		
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Request.class, deserializer);
		Gson customGson = gsonBuilder.create();  
		Request requester = customGson.fromJson(request, Request.class);  
		System.out.println(">> Parsed request");
		return requester;
	}
	
	@Override
	public void run()
	{
		try
		{
			socket = new Socket(CompetitionUtility.hostLocation, CompetitionUtility.PortForServer);
			System.out.println("server socket: " + socket);
			
			System.out.println("going to send to server\n" + parsedRequest);
			PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			output.println(parsedRequest);
			output.flush();
			
			System.out.println("<< Client read from server");
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String answer = input.readLine();
			
			if(shouldWaitForAnswer)
			{
				toReturn = ParseRequestFromServer(answer);
				System.out.println("PARSED FROM SERVER\n"+toReturn.toString());
				
				if(toReturn.get_objType().equals("Team"))
				{
					TeamModel.get_instance().set_teams(toReturn);
				}
				else if(toReturn.get_objType().equals("Contest")){
					ContestModel.get_instance().Set_Data(toReturn);
				}
			}
			
			System.out.println("got from server\n"+answer);
			
			System.out.println("Closing Client now...");
			socket.close();
			output.close();
			input.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}