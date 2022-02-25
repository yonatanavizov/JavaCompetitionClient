package com.main;

import java.awt.EventQueue;

import com.competition.dm.Team;
import com.controller.TeamController;
import com.model.TeamModel;
import com.view.FIrst;

public class Main
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try {
					System.out.println("Competition Program Running!");
					TeamController tc = new TeamController();
					FIrst frame = new FIrst();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
