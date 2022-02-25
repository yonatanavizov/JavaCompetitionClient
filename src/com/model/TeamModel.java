package com.model;

import com.client.Client;
import com.client.Request;
import com.competition.dm.Team;
import com.competition.dm.Team.Rank;
import com.utility.CompetitionUtility;

public class TeamModel
{
	Team[] teams;
	
    private static TeamModel teamModel = null;

	public static TeamModel get_instance()
	{
		if (teamModel == null)
			teamModel = new TeamModel();
 
        return teamModel;
	}
    
	private TeamModel()
	{
		PopulateData();
	}
	
	private void PopulateData()
	{
		Client c = new Client(CompetitionUtility.PortForServer);
		Request team_req = new Request("get", "Team", 0);
		c.set_request(team_req);
		
		Thread t1 = new Thread(c);
		t1.start();
	}
	
	public void set_teams(Request re)
	{
		Team[] givenData = (Team[]) re.get_data();
		teams = new Team[givenData.length];
		
		for(int i = 0; i < givenData.length; i++)
		{
			teams[i] = new Team(givenData[i]);
		}
		System.out.println("Someone set my teams -- " + teams.length + "\n"+teams[0].toString());
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
