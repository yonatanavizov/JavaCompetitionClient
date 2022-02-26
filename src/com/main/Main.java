package com.main;

import java.awt.EventQueue;
import com.view.First;

public class Main
{
	public static void main(String[] args)
	{
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
