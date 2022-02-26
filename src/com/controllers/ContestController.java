package com.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.competition.dm.Contest;
import com.competition.dm.Team;
import com.model.ContestModel;

public class ContestController
{	
	ContestModel model;
	Contest[] contests;
	
	public ContestController()
	{
		model = ContestModel.get_instance();
		
	}
	
	public ArrayList<Contest> GetContests(int amountOfTeams)
	{
		return model.get_contests_by_size(amountOfTeams);
	}
	public Contest CreateRandomContest(int amountOfTeams)
	{
		Contest c = new Contest();
		c.set_id(c.hashCode());
		c.set_amountOfTeamsInContest(amountOfTeams);
		c.set_name("Contest " + c.get_id());
		
		TeamController tc = new TeamController();
		Team[] teams = tc.get_random_teams_by_amount(amountOfTeams);
		
		
		return c;
	}
	public Contest[] get_contests()
	{	
		HashMap<Integer, ArrayList<Contest>> db = model.get_db();
		
		int size = 0;
		for (Entry<Integer, ArrayList<Contest>> entry : db.entrySet())
		{
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	        size += entry.getValue().size();
	    }
		contests = new Contest[size];
		
		int index = 0;
		for (Entry<Integer, ArrayList<Contest>> entry : db.entrySet())
		{
			ArrayList<Contest> arr =  entry.getValue();
			for(int i = 0; i < arr.size();i++)
			{
				contests[index] = new Contest(arr.get(i));
				index++;
			}
	    }
		return contests;
	}
	
	public void Remove(Contest toRemove)
	{
		model.Remove(toRemove);
	}
	
	public void Remove(int toRemove)
	{
		model.Remove(contests[toRemove]);
	}
	
	public void Add(Contest toAdd)
	{
		model.Add(toAdd);
	}
	
	public void SaveAll()
	{
		model.UpdateServer();
	}
}

