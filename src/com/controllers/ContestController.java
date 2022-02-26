package com.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import com.competition.dm.Contest;
import com.competition.dm.Match;
import com.competition.dm.Team;
import com.model.ContestModel;
import com.utility.CompetitionUtility;

public class ContestController
{	
	ContestModel model;
	LinkedList<Contest> contests;
	
	public ContestController()
	{
		model = ContestModel.get_instance();
		contests = new LinkedList<Contest>();
	}
	
	public ArrayList<Contest> GetContests(int amountOfTeams)
	{
		return model.get_contests_by_size(amountOfTeams);
	}
	
	public Contest CreateRandomContest(int amountOfTeams)
	{
		Contest c = new Contest();
		c.set_id(CompetitionUtility.new_contest_id());
		c.set_amountOfTeamsInContest(amountOfTeams);
		c.set_name("Contest " + c.get_id());
		
		TeamController tc = new TeamController();
		Team[] teams = tc.get_random_teams_by_amount(amountOfTeams);
		LinkedList<Team> currentWinners = CompetitionUtility.toList(teams);
		
		HashMap<String, ArrayList<Match>> matches = new HashMap<String, ArrayList<Match>>();
		
		
		int amountOfRounds = CompetitionUtility.log2(amountOfTeams);
		System.out.println("\nMaking Fake Contest:");
		for(int i = 0; i < amountOfRounds; i++)
		{
			ArrayList<Match> curRound = new ArrayList<Match>();
			ArrayList<Team> losers = new ArrayList<Team>();
			
			
			int teamIndex = 0;
			System.out.println("Round " + i + ": ");
			for(int k=0; k < currentWinners.size() / 2; k++) // 16 8 4 2 1
			{
				Match m = new Match();
				m.set_id(k);
				
				Team a = currentWinners.get(teamIndex++);
				Team b = currentWinners.get(teamIndex++);
				
				m.set_team_a(a);
				m.set_team_b(b);
				int whoWins = CompetitionUtility.getRandomNumber(0, 2);
				if(whoWins== 0)
				{
					m.set_outcome(Match.OutCome.Team_A_Won);
					losers.add(b);
				}
				else
				{
					m.set_outcome(Match.OutCome.Team_B_Won);
					losers.add(a);
				}
				curRound.add(m);
				System.out.println(m.toString());
			}
			
			// for remove losers
			int amountOfLosers = losers.size();
			for(int j = 0; j < amountOfLosers; j++)
			{
				currentWinners.remove(losers.get(j));
			}
			
			matches.put(String.valueOf(i), curRound);
		}
		
		c.set_matches(matches);
		
		Add(c);
		
		return c;
	}
	public LinkedList<Contest> get_contests()
	{	
		HashMap<Integer, ArrayList<Contest>> db = model.get_db();
		
		for (Entry<Integer, ArrayList<Contest>> entry : db.entrySet())
		{
			ArrayList<Contest> arr =  entry.getValue();
			for(int i = 0; i < arr.size();i++)
			{
				contests.add(arr.get(i));
			}
	    }
		return contests;
	}
	
	public Contest get_contest_by_JListID(int id)
	{
		return contests.get(id);
	}
	
	public void Remove(Contest toRemove)
	{
		model.Remove(toRemove);
	}
	
	public void Remove(int toRemove)
	{
		contests.remove(toRemove);
		model.Remove(contests.get(toRemove));
	}
	
	public void Add(Contest toAdd)
	{
		System.out.println("going to add " + toAdd.get_name());
		contests.add(toAdd);
		model.Add(toAdd);
	}
	
	public boolean SaveAll()
	{
		return model.UpdateServer();
	}
}

