package com.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.client.Client;
import com.client.Request;
import com.competition.dm.Contest;
import com.utility.CompetitionUtility;
import com.utility.CompetitionUtility.DataTypes;

public class ContestModel implements IModel
{
	private static int AmountOfModel = 0;
	HashMap<Integer, ArrayList<Contest>> contestMap;
	private static ContestModel contestModel;
	
	private ContestModel()
	{
		contestMap = new HashMap<Integer, ArrayList<Contest>>();
		contestMap.put(4, new ArrayList<Contest>());
		contestMap.put(16, new ArrayList<Contest>());
		contestMap.put(32, new ArrayList<Contest>());
		PopulateData();
		AmountOfModel++;
	}
	
	public static ContestModel get_instance()
	{
		if (contestModel == null && AmountOfModel == 0)
		{
			System.out.println("ContestModel Singleton Ready..");
			contestModel = new ContestModel();
		}
			
 
        return contestModel;
	}

	@Override
	public void PopulateData()
	{
		Client c = new Client();
		Request con_req = new Request("get", "Contest", 1);
		Contest[] fake = new Contest[1];
		fake[0] = new Contest();
		con_req.set_data(fake);
		c.set_request(con_req);
		
		Thread t1 = new Thread(c);
		t1.start();
	}
	
	public void PrintMe()
	{
		System.out.println("PRINT ME");
		for (Entry<Integer, ArrayList<Contest>> entry : contestMap.entrySet())
	    {
	        ArrayList<Contest> current = (ArrayList<Contest>) entry.getValue();
	        System.out.println(current);
	    }
	}
	
	public void Set_Data(Request re)
	{
		// called by Client
		Contest[] data = (Contest[]) re.get_data();
		System.out.println("Set data in model contest");
		for(int i = 0; i < data.length; i++)
		{
			int amount = data[i].get_amountOfTeamsInContest();
			
			if(amount == 4 || amount == 16 || amount == 32)
			{
				
				ArrayList<Contest> current = contestMap.get(amount);
				current.add(new Contest(data[i]));
				System.out.println("going to add datai at: " + contestMap.get(amount));
			}
		}
		
	}
	
	public ArrayList<Contest> get_contests_by_size(int size)
	{
		return contestMap.get(size);
	}
		
	public void Remove(Contest con)
	{
		contestMap.get(con.get_amountOfTeamsInContest()).remove(con);
		DeleteContest(con);
	}
	
	public void Add(Contest con)
	{
		int amount = con.get_amountOfTeamsInContest();
		if(amount== 4 || amount == 16 || amount == 32)
		{
			contestMap.get(amount).add(new Contest(con));
		}
	}
	
	public boolean UpdateServer()
	{
		int size = 0;
		
	    for (Entry<Integer, ArrayList<Contest>> entry : contestMap.entrySet())
	    {
	        size += entry.getValue().size();
	    }

	    Request ask = new Request("add", "Contest", size);
		Contest[] data= new Contest[size];
		String[] ss = new String[size];
		int index = 0;
	    for (Entry<Integer, ArrayList<Contest>> entry : contestMap.entrySet())
	    {
	        ArrayList<Contest> current = (ArrayList<Contest>) entry.getValue();
	        for(int i = 0; i < current.size(); i++)
	        {
	        	data[index] = new Contest(current.get(i));
	        	ss[index] = new String(current.get(i).get_name());
	        	System.out.println(current.get(i).toString() + " || "+ data[index].toString());
	        	index++;
	        }
	    }
	    
	    for(int i = 0; i < ss.length; i++)
	    {
	    	System.out.println(ss[i]);
	    }
		ask.set_data(data);
		
		Client c = new Client();
		c.set_request(ask);
		Thread th = new Thread(c);
		th.start();
		
		return true;
	}
	
	private void DeleteContest(Contest toDelete)
	{
		Contest[] toDel = new Contest[1];
		toDel[0] = toDelete;
		
		Request ask = new Request("remove", "Contest", toDel.length);
		ask.set_data(toDel);
		
		Client c = new Client();
		c.set_request(ask);
		Thread th = new Thread(c);
		th.start();
	}
	
	@Override
	public DataTypes get_type()
	{
		return CompetitionUtility.DataTypes.Contest;
	}
	
	public HashMap<Integer, ArrayList<Contest>> get_db()
	{
		return contestMap;
	}
}