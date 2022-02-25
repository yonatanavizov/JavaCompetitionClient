package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.competition.dm.Contest;
import com.competition.dm.Team;
import com.competition.dm.Team.Rank;

public class ContestController {
	List<Contest> contests=new ArrayList<Contest>();
	
	
	
	public ContestController()
	{
		
		
	}
	
	public List<Contest> GetContests()
	{
		return contests;
	}
	
	public Contest Search (String name)
	{
		return contests.get(0);
	}
	
	public void Remove(int id)
	{
		contests.remove(id);
	}
	

}

