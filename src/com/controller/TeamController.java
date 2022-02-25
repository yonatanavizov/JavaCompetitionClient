package com.controller;

import com.competition.dm.Team;

import com.model.TeamModel;

public class TeamController {
TeamModel model;

	public TeamController(int amount)
	{
		model=new TeamModel();
	}
	
	public Team Search(String name)
	{
		return model.getTeamByName(name);
	}
}
