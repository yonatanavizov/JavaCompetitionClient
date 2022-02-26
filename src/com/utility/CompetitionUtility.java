package com.utility;

import java.util.LinkedList;

import com.competition.dm.Contest;

public class CompetitionUtility {
	public static int PortForServer = 34567;
	public static String hostLocation = "127.0.0.1";
	public static int contestId = 100;
	public enum DataTypes
	{
		Team, Match, Contest
	}
	
	public static int new_contest_id()
	{
		int old = contestId;
		contestId++;
		return old;
	}
	
	public static int getRandomNumber(int min, int max) // by index
	{
	    return (int) ((Math.random() * (max - min)) + min - 1);
	}
	
	public static int log2(int N)
    {
        int result = (int)(Math.log(N) / Math.log(2));
        return result;
    }
	
	public static <T> LinkedList<T> toList(T[] obj)
	{
		LinkedList<T> toReturn = new LinkedList<T>();
		
		for(int i = 0; i < obj.length; i++)
		{
			toReturn.add(obj[i]);
		}
		return toReturn;
	}
	
	public static LinkedList<Contest> toListHardCopy(Contest[] obj)
	{
		LinkedList<Contest> toReturn = new LinkedList<Contest>();
		
		for(int i = 0; i < obj.length; i++)
		{
			toReturn.add(new Contest(obj[i]));
		}
		return toReturn;
	}
}
