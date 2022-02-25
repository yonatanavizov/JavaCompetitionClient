package com.model;

import com.competition.dm.Team;
import com.competition.dm.Team.Rank;

public class TeamModel {
	Team[] teams;
	private static int amount =32;
	public TeamModel()
	{
		teams= new Team [amount];
		
		//should be from server
		for(int i =0;i<=amount-1;i++)
		{
			teams[i]=new Team(i,"T"+i,"Basketball",Rank.BEGINNER,i+10,i,0.5f+i*0.01f,"This Team position is "+i) ;
			
		}
		
	}
	
	public Team[] getTeams()
	{
		return teams;
	}
	
	public Team getTeamByName(String name)
	{
		for(int i=0;i<=teams.length-1;i++)
		{
			if(teams[i].get_name().equals(name))
			{
				return teams[i];
			}
		}
		return teams[0];
	}
	
	public Team getTeamBySummary(String text)
	{
		return teams[0];
	}
	
	

}
