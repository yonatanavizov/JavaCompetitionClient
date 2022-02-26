package com.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ScrollPaneConstants;

import com.competition.dm.Contest;
import com.competition.dm.Team;
import com.controllers.ContestController;
import com.controllers.TeamController;

import javax.swing.DefaultListModel;

import java.awt.Toolkit;

public class First extends JFrame
{
	private static final long serialVersionUID = -1592704045926813516L;
	
	private JPanel contentPane;
	private JTextField SearchTeamInput;
	JList<String> ContestList;
	ContestController contestsetup;
	TeamController control;

	public First()
	{
	    contestsetup = new ContestController ();
	    control = new TeamController();
	    
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\eclipse-workspace\\UI_Proj\\Images\\Contents-logos.jpeg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 549);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Competition  Tornument");
		lblNewLabel_1.setForeground(new Color(255, 165, 0));
		lblNewLabel_1.setFont(new Font("Footlight MT Light", Font.BOLD, 25));
		lblNewLabel_1.setBounds(247, 10, 430, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Founded By :\r\nAsaf Dangoor & \r\nYonatan Avizov\r\n");
		lblNewLabel.setForeground(new Color(255, 182, 193));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblNewLabel.setBounds(465, 422, 296, 80);
		contentPane.add(lblNewLabel);
		
		JButton Team16ContestBtn = new JButton("Start");
		Team16ContestBtn.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				CreateContest(16);
			}
		});
		Team16ContestBtn.setBounds(643, 329, 85, 21);
		contentPane.add(Team16ContestBtn);
		
		JButton Team32ContestBtn = new JButton("Start");
		Team32ContestBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CreateContest(32);
				
			}
		});
		Team32ContestBtn.setBounds(643, 391, 85, 21);
		contentPane.add(Team32ContestBtn);
		
		JButton Team4ContestBtn = new JButton("Start");
		Team4ContestBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CreateContest(4);
			}
		});
		Team4ContestBtn.setBounds(643, 271, 85, 21);
		contentPane.add(Team4ContestBtn);
		
		JLabel lblNewLabel_3 = new JLabel("16 Teams");
		lblNewLabel_3.setForeground(new Color(250, 235, 215));
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(660, 302, 85, 17);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("32 Teams");
		lblNewLabel_4.setForeground(new Color(250, 235, 215));
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(660, 360, 68, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("4 Teams");
		lblNewLabel_5.setForeground(new Color(250, 235, 215));
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(660, 246, 68, 15);
		contentPane.add(lblNewLabel_5);
		
		JButton SearchTeamBtn = new JButton("Search by Name");
		SearchTeamBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClickedSearchTeam(false);
			}
		});
		//SearchTeamInput
		SearchTeamBtn.setBounds(278, 452, 156, 21);
		contentPane.add(SearchTeamBtn);
		
		JLabel lblNewLabel_6 = new JLabel("Team name");
		lblNewLabel_6.setForeground(new Color(255, 228, 181));
		lblNewLabel_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 475, 109, 13);
		contentPane.add(lblNewLabel_6);
		
		SearchTeamInput = new JTextField();
		SearchTeamInput.setBounds(108, 472, 143, 19);
		contentPane.add(SearchTeamInput);
		SearchTeamInput.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 118, 430, 268);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 427, 268);
		panel.add(scrollPane);
		ContestList = new JList<String>();
		scrollPane.setViewportView(ContestList);
		String[] listValues = ContestListDisplay();
	    DefaultListModel<String> model = new DefaultListModel<>();
	    for (String s : listValues) {
	      model.addElement(s);
	    }
	    ContestList.setModel(model);
		
		JLabel lblNewLabel_2 = new JLabel("<html>In following page you will have 3 options:<br/>- 32 Teams competiton<br/>-16 Teams competition<br/>-4 Teams competition</html>",SwingConstants.CENTER);
		lblNewLabel_2.setBounds(488, 90, 284, 132);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(233, 150, 122));
		lblNewLabel_2.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
		
		JButton ShowContestBtn = new JButton("Show");
		ShowContestBtn.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				int index = ContestList.getSelectedIndex();
				ShowContest(index);
			}
		});
		ShowContestBtn.setBounds(48, 424, 85, 21);
		contentPane.add(ShowContestBtn);
		
		JButton DeleteContestBtn = new JButton("Delete");
		DeleteContestBtn.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				int index = ContestList.getSelectedIndex();
				DefaultListModel<String> model = (DefaultListModel<String>) ContestList.getModel();
				model.remove(index);
				ContestList.setModel(model);
				contestsetup.Remove(index);
			}
		});
		
		DeleteContestBtn.setBounds(166, 424, 85, 21);
		contentPane.add(DeleteContestBtn);
		
		JButton SearchTeamSummaryBtn = new JButton("Search by Summary");
		SearchTeamSummaryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClickedSearchTeam(true);
			}
		});
		SearchTeamSummaryBtn.setBounds(279, 479, 155, 23);
		contentPane.add(SearchTeamSummaryBtn);
		
		JButton SaveAllBtn = new JButton("Save All");
		SaveAllBtn.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				boolean ans = contestsetup.SaveAll();
				String s = "";
				if(ans)
				{
					s = "Successfully saved to server";
				}
				else
				{
					s = "Failed to save to server";
				}
				
				PopUp pu = new PopUp(s);
				pu.setVisible(true);
			}
		});
		
		SaveAllBtn.setBounds(44, 84, 89, 23);
		contentPane.add(SaveAllBtn);

	}
	
	
	private void OnClickedSearchTeam(boolean bySummary)
	{
		TeamController control=new TeamController();
		String searchText= SearchTeamInput.getText();
		Team team = null;
		
		if(bySummary)
		{
			String ans =control.SearchSummary(searchText);
			PopUp pu = new PopUp(ans);
			pu.setVisible(true);
		}
		else
		{
			team =control.Search(searchText);
			
			if(team == null)
			{
				PopUp pu = new PopUp("Team Not found.");
				pu.setVisible(true);
				return;
			}
			InfoTeam info = new InfoTeam(team);
			info.setVisible(true);
		}
		
		
		
	}
	
	
	private String [] ContestListDisplay()
	{
		LinkedList<Contest> contestToDisplay = contestsetup.get_contests();
		int len = contestToDisplay.size();
		String [] array=new String [len];
		for ( int i=0; i< len; i++)
		{
			array[i] = contestToDisplay.get(i).toString();
		}
		return array ;
	}
	
	private void CreateContest(int size)
	{
		System.out.println("Going to create a random tornument " + size);
		Contest toDisplay = contestsetup.CreateRandomContest(size);
		switch(size)
		{
			case 4:
				  Comp4 frame4=new Comp4(toDisplay);
				  frame4.Display();
				break;
			case 16:
				Comp16 frame16=new Comp16(toDisplay);
				  frame16.Display();
				break;
			case 32:
				Comp32 frame32=new Comp32(toDisplay);
				  frame32.Display();
				break;
		}
		
		UpdateJListContest(toDisplay.toString());
	}
	
	private void ShowContest(int index)
	{
		Contest toDisplay = contestsetup.get_contest_by_JListID(index);
		
		switch(toDisplay.get_amountOfTeamsInContest())
		{
			case 4:
				  Comp4 frame4=new Comp4(toDisplay);
				  frame4.Display();
				break;
			case 16:
				Comp16 frame16=new Comp16(toDisplay);
				  frame16.Display();
				break;
			case 32:
				Comp32 frame32=new Comp32(toDisplay);
				  frame32.Display();
				break;
		}
	}
	
	private void UpdateJListContest(String toAdd)
	{
	    DefaultListModel<String> model = (DefaultListModel<String>) ContestList.getModel();
	    model.addElement(toAdd);
	    ContestList.setModel(model);
	}
}