package com.model;

import com.utility.CompetitionUtility;

public interface IModel
{
	void PopulateData();
	CompetitionUtility.DataTypes get_type();
}
