package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.competition.dm.Team;
import com.competition.dm.Team.Rank;
import com.controller.TeamController;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class InfoTeam extends JFrame {

	private JPanel contentPane;
	private TeamController controller;
	private Team team;
	JLabel SummaryLa = new JLabel("New label");
	JLabel WinLoseLa = new JLabel("New label");
	JLabel GameTypeLa = new JLabel("New label");
	JLabel RankLa = new JLabel("New label");
	JLabel NameLa = new JLabel("New label");
	JLabel IdLa = new JLabel("New label");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamController con = new TeamController(32);
					Team ComTeam =con.Search("Put here Team name");
					InfoTeam frame = new InfoTeam(ComTeam);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
			
	}

	/**
	 * Create the frame.
	 */
	public InfoTeam(Team todisplay) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\eclipse-workspace\\UI_Proj\\Images\\Contents-logos.jpeg"));
		team=todisplay;
		controller=new TeamController (32);
		setForeground(new Color(95, 158, 160));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 770, 521);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setForeground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Team Info");
		lblNewLabel.setForeground(new Color(255, 99, 71));
		lblNewLabel.setFont(new Font("Bodoni MT", Font.BOLD, 30));
		lblNewLabel.setBounds(270, 45, 155, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setForeground(new Color(250, 128, 114));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1.setBounds(44, 99, 68, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setForeground(new Color(250, 128, 114));
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(44, 139, 68, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Rank");
		lblNewLabel_1_2.setForeground(new Color(250, 128, 114));
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(44, 179, 68, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Game Type");
		lblNewLabel_1_3.setForeground(new Color(250, 128, 114));
		lblNewLabel_1_3.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(44, 230, 115, 30);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Win/Lose Ratio");
		lblNewLabel_1_4.setForeground(new Color(250, 128, 114));
		lblNewLabel_1_4.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(44, 280, 127, 30);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Summary");
		lblNewLabel_1_5.setForeground(new Color(250, 128, 114));
		lblNewLabel_1_5.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1_5.setBounds(44, 320, 115, 30);
		contentPane.add(lblNewLabel_1_5);
		
		
		IdLa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IdLa.setForeground(new Color(250, 235, 215));
		IdLa.setBounds(79, 105, 45, 20);
		contentPane.add(IdLa);
		
		
		NameLa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NameLa.setForeground(new Color(250, 235, 215));
		NameLa.setBounds(108, 149, 115, 13);
		contentPane.add(NameLa);
		
		
		RankLa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RankLa.setForeground(new Color(250, 235, 215));
		RankLa.setBounds(93, 189, 68, 13);
		contentPane.add(RankLa);
		
		
		GameTypeLa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GameTypeLa.setForeground(new Color(250, 235, 215));
		GameTypeLa.setBounds(150, 240, 104, 13);
		contentPane.add(GameTypeLa);
		
		
		WinLoseLa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		WinLoseLa.setForeground(new Color(250, 235, 215));
		WinLoseLa.setBounds(169, 290, 68, 13);
		contentPane.add(WinLoseLa);
		
		JScrollPane SummaryScrollpane = new JScrollPane();
		SummaryScrollpane.setBounds(135, 335, 490, 54);
		contentPane.add(SummaryScrollpane);
		
		
		SummaryScrollpane.setRowHeaderView(SummaryLa);
		SummaryLa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SummaryLa.setForeground(new Color(0, 0, 0));
		display();
		
	}
	private void display()
	{
		IdLa.setText(String.valueOf(team.get_id()));
		NameLa.setText(String.valueOf(team.get_name()));
		GameTypeLa.setText(String.valueOf(team.get_game_type()));
		RankLa.setText(String.valueOf(team.get_rank()));
		WinLoseLa.setText(String.valueOf(team.get_win_loss()));
		SummaryLa.setText(String.valueOf(team.get_summary()));
		
	}
}
