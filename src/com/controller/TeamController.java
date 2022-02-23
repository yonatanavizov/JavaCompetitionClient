package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.competition.dm.Team;
import com.competition.dm.Team.Rank;

public class TeamController {
	List <Team> teams = new ArrayList <Team>(); 

	public TeamController(int amount)
	{
		
		/*Team t1= new Team(0,"macbi","basketball",Rank.BEGINNER,5,3,0.5f,"The winner of 2010 tornoment");
		Team t2= new Team(1,"macbi haifa","basketball",Rank.PROFESSIONAL,5,2,0.2f,"The winner of 2015 tornoment");
		teams.add(t1);
		teams.add(t2);*/
		for(int i =0;i<=amount-1;i++)
		{
			teams.add(new Team(i,"T"+i,"Basketball",Rank.BEGINNER,i+10,i,0.5f+i*0.01f,"This Team position is "+i)) ;
			
		}
		
	}
	
	
	/*public List <Team> getteams()
	{
		return teams;
	}*/
	
	public Team Search(String name)
	{
		for(int i=0;i<=teams.size()-1;i++)
		{
			if(teams.get(i).get_name().equals(name))
			{
				return teams.get(i);
			}
		}
		return teams.get(0);
		
		
	}
	
	
}
