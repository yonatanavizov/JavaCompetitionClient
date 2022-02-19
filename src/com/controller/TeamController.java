package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.competition.dm.Team;
import com.competition.dm.Team.Rank;

public class TeamController {
	List <Team> teams = new ArrayList <Team>(); 

	public TeamController()
	{
		Team t1= new Team(0,"macbi","basketball",Rank.BEGINNER,5,3,0.5f,"The winner of 2010 tornoment");
		Team t2= new Team(1,"macbi haifa","basketball",Rank.PROFESSIONAL,5,2,0.2f,"The winner of 2015 tornoment");
		teams.add(t1);
		teams.add(t2);
		
	}
	public List <Team> getteams()
	{
		return teams;
	}
	
	
}
