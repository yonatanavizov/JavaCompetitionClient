package com.model;

import com.client.Client;
import com.client.Request;
import com.competition.ISearchAlgoFamily;
import com.competition.ISearchAlgoFamily.SearchResult;
import com.competition.NaiveSearchAlgo;
import com.competition.dm.Contest;
import com.competition.dm.Team;
import com.utility.CompetitionUtility;
import com.utility.CompetitionUtility.DataTypes;

public class TeamModel implements IModel
{
	Team[] teams;
	ISearchAlgoFamily searcher;
	private static int AmountOfModel = 0;

    private static TeamModel teamModel = null;

	public static TeamModel get_instance()
	{
		if (teamModel == null && AmountOfModel == 0)
		{
			System.out.println("TeamModel Singleton Ready..");
			teamModel = new TeamModel();
		}
 
        return teamModel;
	}
    
	private TeamModel()
	{
		AmountOfModel++;
		PopulateData();
	}
	
	@Override
	public void PopulateData()
	{
		Client c = new Client();
		Request team_req = new Request("get", "Team", 0);
		Team[] fake = new Team[1];
		fake[0] = new Team();
		team_req.set_data(fake);
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
		for(int i=0; i < teams.length; i++)
		{
			searcher = new NaiveSearchAlgo();
			SearchResult res = searcher.Search(teams[i].get_name(), name);
			if(res != SearchResult.NotFound)
			{
				return teams[i];
			}
		}
		return null;
	}
	
	public String getTeamBySummary(String text)
	{
		String results = "";
		for(int i = 0; i < teams.length;i++)
		{
			searcher = new NaiveSearchAlgo();
			SearchResult res = searcher.Search(teams[i].get_summary(), text);
			
			if(res != SearchResult.NotFound)
			{
				results += teams[i].get_name() + ", ";
			}
		}
		return results;
	}


	@Override
	public DataTypes get_type()
	{
		return CompetitionUtility.DataTypes.Team;
	}
}