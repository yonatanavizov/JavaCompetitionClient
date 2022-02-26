package com.main;

import java.awt.EventQueue;

import com.controllers.ContestController;
import com.controllers.TeamController;
import com.view.First;

public class Main
{
	public static void main(String[] args)
	{
		TeamController tc = new TeamController();
		ContestController cc = new ContestController();
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					System.out.println("Competition Program Running!");
					First frame = new First();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
