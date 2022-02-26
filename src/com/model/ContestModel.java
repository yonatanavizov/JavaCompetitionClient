package com.model;

import java.util.ArrayList;
import java.util.HashMap;

import com.client.Client;
import com.client.Request;
import com.competition.dm.Contest;
import com.utility.CompetitionUtility;
import com.utility.CompetitionUtility.DataTypes;

public class ContestModel implements IModel
{
	HashMap<Integer, ArrayList<Contest>> contestMap;
	private static ContestModel contestModel;
	
	private ContestModel()
	{
		contestMap = new HashMap<Integer, ArrayList<Contest>>();
		contestMap.put(4, new ArrayList<Contest>());
		contestMap.put(16, new ArrayList<Contest>());
		contestMap.put(32, new ArrayList<Contest>());
		PopulateData();
	}
	
	public static ContestModel get_instance()
	{
		if (contestModel == null)
			contestModel = new ContestModel();
 
        return contestModel;
	}

	@Override
	public void PopulateData()
	{
		Client c = new Client(CompetitionUtility.PortForServer);
		Request con_req = new Request("get", "Contest", 0);
		c.set_request(con_req);
		
		Thread t1 = new Thread(c);
		t1.start();
	}
	
	public void Set_Data(Request re)
	{
		// called by Client
		Contest[] data = (Contest[]) re.get_data();
		System.out.println("--------\nCOntestController -- someone set my data\ngot "+ data.length+" amount");
		for(int i = 0; i < data.length; i++)
		{
			int amount = data[i].get_amountOfTeamsInContest();
			System.out.println(i + " is " + amount);
			if(amount == 4 || amount == 16 || amount == 32)
			{
				ArrayList<Contest> current = contestMap.get(amount);
				current.add(data[i]);
			}
		}
		System.out.println("\\n-----");
	}
	
	public ArrayList<Contest> get_contests_by_size(int size)
	{
		return contestMap.get(size);
	}
	
	public void Remove(Contest con)
	{
		contestMap.get(con.get_amountOfTeamsInContest()).remove(con);
	}
	
	public void Add(Contest con)
	{
		int amount = con.get_amountOfTeamsInContest();
		if(amount!= 4 || amount != 16 || amount != 32) return; // invalid size, do not add.
		contestMap.get(amount).add(con);
	}
	
	public void UpdateServer()
	{
		//call client, send request
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
