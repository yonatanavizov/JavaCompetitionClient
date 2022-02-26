package com.controllers;

import com.competition.dm.Team;

import com.model.TeamModel;
import com.utility.CompetitionUtility;

public class TeamController
{
	TeamModel model;

	public TeamController()
	{
		model = TeamModel.get_instance();
	}
	
	public Team Search(String name)
	{
		return model.getTeamByName(name);
	}
	
	public Team SearchSummary(String text)
	{
		//KMP search here
		return model.getTeamBySummary(text);
	}
	
	public Team get_random_team()
	{
		Team[] teams = model.getTeams();
		int index = CompetitionUtility.getRandomNumber(0, teams.length);
		return teams[index];
	}
	
	public Team[] get_random_teams_by_amount(int amount)
	{
		Team[] toSend = new Team[amount];
		Team[] teams = model.getTeams();
		
		if(amount > teams.length)
		{
			amount = teams.length;
		}
		else if(amount < 4)
		{
			amount = 4;
		}
		boolean[] takenTeams = new boolean[teams.length];
		
		for(int i = 0; i < amount; i++)
		{
			boolean notFound = true;
			while(notFound)
			{
				int index = CompetitionUtility.getRandomNumber(0, teams.length);
				
				if(takenTeams[index] != true) // found something.
				{
					toSend[i] = new Team(teams[index]);
					takenTeams[index] = true;
					notFound = false;
				}
			}
		}
		
		
		return toSend;
	}
}
