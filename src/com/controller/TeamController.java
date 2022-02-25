package com.controller;

import com.competition.dm.Team;

import com.model.TeamModel;

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
}
