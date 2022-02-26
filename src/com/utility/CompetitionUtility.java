package com.utility;

public class CompetitionUtility {
	public static int PortForServer = 34567;
	public static String hostLocation = "127.0.0.1";
	
	public enum DataTypes
	{
		Team, Match, Contest
	}
	
	public static int getRandomNumber(int min, int max) // by index
	{
	    return (int) ((Math.random() * (max - min)) + min - 1);
	}
}
