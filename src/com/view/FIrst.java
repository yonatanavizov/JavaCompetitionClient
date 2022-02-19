package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.controller.TeamController;

import javax.swing.AbstractListModel;

public class FIrst extends JFrame {

	private JPanel contentPane;
	private JTextField SearchTeamInput;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FIrst frame = new FIrst();
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
	public FIrst() {
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
		
		JLabel lblNewLabel = new JLabel("Founded By :\r\nAsaf Dangoor \r\nYonatan Avizov\r\n");
		lblNewLabel.setForeground(new Color(255, 182, 193));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblNewLabel.setBounds(526, 408, 296, 80);
		contentPane.add(lblNewLabel);
		
		JButton Team16ContestBtn = new JButton("Start");
		Team16ContestBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			  Com16 frame16=new Com16();
			  frame16.Display();
			}
		});
		Team16ContestBtn.setBounds(643, 272, 85, 21);
		contentPane.add(Team16ContestBtn);
		
		JButton Team32ContestBtn = new JButton("Start");
		Team32ContestBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Com32 frame32=new Com32();
				 frame32.Display();
				
			}
		});
		Team32ContestBtn.setBounds(643, 365, 85, 21);
		contentPane.add(Team32ContestBtn);
		
		JButton Team4ContestBtn = new JButton("Start");
		Team4ContestBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Comp4 frame4=new Comp4();
				  frame4.Display();
			}
		});
		Team4ContestBtn.setBounds(643, 191, 85, 21);
		contentPane.add(Team4ContestBtn);
		
		JLabel lblNewLabel_3 = new JLabel("16 Teams");
		lblNewLabel_3.setForeground(new Color(250, 235, 215));
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(660, 240, 85, 17);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("32 Teams");
		lblNewLabel_4.setForeground(new Color(250, 235, 215));
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(660, 320, 68, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("4 Teams");
		lblNewLabel_5.setForeground(new Color(250, 235, 215));
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(660, 166, 68, 15);
		contentPane.add(lblNewLabel_5);
		
		JButton SearchTeamBtn = new JButton("Search");
		SearchTeamBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClickedSearchTeam();
			}
		});
		SearchTeamBtn.setBounds(293, 472, 85, 21);
		contentPane.add(SearchTeamBtn);
		
		JLabel lblNewLabel_6 = new JLabel("Team name");
		lblNewLabel_6.setForeground(new Color(255, 228, 181));
		lblNewLabel_6.setFont(new Font("Arimo", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 475, 109, 13);
		contentPane.add(lblNewLabel_6);
		
		SearchTeamInput = new JTextField();
		SearchTeamInput.setBounds(135, 473, 143, 19);
		contentPane.add(SearchTeamInput);
		SearchTeamInput.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 118, 430, 268);
		contentPane.add(panel);
		String[] columnNames = { "Name", "Roll Number", "Department" };
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 427, 268);
		panel.add(scrollPane);
		JList ContestList = new JList(columnNames);
		scrollPane.setViewportView(ContestList);
		ContestList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department", "Name", "Roll Number", "Department"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("In following page you will have 3 options:\r\n- 32 Teams competiton\r\n-16 Teams competition\r\n-4 Teams competition");
		lblNewLabel_2.setBounds(10, 73, 754, 22);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(233, 150, 122));
		lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD, 13));
		
		JButton ShowContestBtn = new JButton("Show");
		ShowContestBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		ShowContestBtn.setBounds(48, 395, 85, 21);
		contentPane.add(ShowContestBtn);
		
		JButton DeleteContestBtn = new JButton("Delete");
		DeleteContestBtn.setBounds(164, 395, 85, 21);
		contentPane.add(DeleteContestBtn);

	}
	
	
	private void OnClickedSearchTeam()
	{
		TeamController control=new TeamController();
		boolean answer=control.Search("macbi");
	}
}
