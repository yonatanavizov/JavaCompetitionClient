package com.view;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.competition.dm.Contest;
import com.competition.dm.Match;
import com.competition.dm.Match.OutCome;
import com.controllers.TeamController;
import com.competition.dm.Team;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.Color;

public class Comp4 extends ComFrame {

	private static final long serialVersionUID = 4709206707675680656L;
	private JPanel contentPane;
	private JTextField IN1R3;
	private JTextField IN2R3;
	private JTextField IN1F;
	private JTextField WIN;
	private static Contest contest;
	JTextField [] Inputfield;
	private static int compSize=4;
	private Team winner ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamController ts = new TeamController();
					contest=new Contest("contest4",1,4);
					Team t1 =ts.Search("T1");
					Match m1 =new Match (t1,t1,0);
					m1.set_outcome(OutCome.Team_A_Won);
					ArrayList <Match> r1=new ArrayList<Match>();
					r1.add(m1);
					r1.add(m1);
					ArrayList <Match> r2=new ArrayList<Match>();
					r2.add(m1);
					
					HashMap<String,ArrayList<Match>> ma= new HashMap <String,ArrayList<Match>> ();
					ma.put("0", r1);
					ma.put("1", r2);
					contest.set_matches(ma);
					
					
					Comp4 frame = new Comp4(contest);
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
	public Comp4(Contest con) {
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 933, 568);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Competition  Tornument");
		lblNewLabel.setForeground(new Color(255, 165, 0));
		lblNewLabel.setFont(new Font("Footlight MT Light", Font.BOLD, 25));
		lblNewLabel.setBounds(326, 31, 430, 70);
		contentPane.add(lblNewLabel);
		
		IN1R3 = new JTextField();
		IN1R3.setText("Team 1 vs Team 2");
		IN1R3.setColumns(10);
		IN1R3.setBounds(291, 134, 96, 19);
		contentPane.add(IN1R3);
		
		IN2R3 = new JTextField();
		IN2R3.setColumns(10);
		IN2R3.setBounds(291, 157, 96, 19);
		contentPane.add(IN2R3);
		
		JLabel Match2R1_2 = new JLabel("Match 2");
		Match2R1_2.setForeground(new Color(255, 228, 196));
		Match2R1_2.setBounds(229, 160, 45, 13);
		contentPane.add(Match2R1_2);
		
		JLabel Match1R1_2 = new JLabel("match 1");
		Match1R1_2.setForeground(new Color(255, 228, 196));
		Match1R1_2.setBounds(229, 137, 45, 13);
		contentPane.add(Match1R1_2);
		
		IN1F = new JTextField();
		IN1F.setText("TEam 1 vs ream 2");
		IN1F.setColumns(10);
		IN1F.setBounds(469, 134, 96, 19);
		contentPane.add(IN1F);
		
		JLabel Match1R1_2_1 = new JLabel("match 1");
		Match1R1_2_1.setForeground(new Color(255, 228, 196));
		Match1R1_2_1.setBounds(417, 137, 45, 13);
		contentPane.add(Match1R1_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Round 3");
		lblNewLabel_2_1.setForeground(new Color(255, 192, 203));
		lblNewLabel_2_1.setBounds(315, 111, 62, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Final");
		lblNewLabel_2_2.setForeground(new Color(255, 192, 203));
		lblNewLabel_2_2.setBounds(495, 114, 70, 13);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("WInner !!!");
		lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD, 24));
		lblNewLabel_3.setBounds(723, 191, 194, 65);
		contentPane.add(lblNewLabel_3);
		
		WIN = new JTextField();
		WIN.setText("The Winner ");
		WIN.setBounds(723, 246, 96, 19);
		contentPane.add(WIN);
		WIN.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		ImageIcon img=new ImageIcon (this.getClass().getResource("/Winner.jfif"));
		lblNewLabel_5.setIcon(img);
		lblNewLabel_5.setBounds(670, 286, 214, 213);
		
		contentPane.add(lblNewLabel_5);
		
		JButton InfoBtn = new JButton("Info");
		InfoBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClickedSearchTeam();
				
				
			}
		});
		InfoBtn.setBounds(231, 286, 132, 53);
		contentPane.add(InfoBtn);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Winner Info");
		lblNewLabel_2_1_1.setForeground(new Color(255, 192, 203));
		lblNewLabel_2_1_1.setBounds(264, 254, 136, 22);
		contentPane.add(lblNewLabel_2_1_1);
		Component [] array= contentPane.getComponents();
		 Inputfield= new JTextField[compSize];
		 
		 
		 
		 for(int i=0,counter=0;i<array.length;i++)
			{
				if(array[i] instanceof JTextField)
				{
					Inputfield[counter]= (JTextField)array[i];
					counter++;
				}
			}
		 
		setTor(con);
	}
	@Override
	public void Display()
	{
		this.setVisible(true);
	}
	
	 private void setTor(Contest cont)
	{
		 int counter =0;
		 
		 HashMap<String,ArrayList<Match>> matches= cont.get_matches();
		 for(int i=0;i<matches.size();i++)
		 {
			 ArrayList<Match> round =matches.get(String.valueOf(i));
			 for( int j=0;j<round.size();j++)
			 {
				 String Dis= round.get(j).get_team_a().get_name()+" VS "+ round.get(j).get_team_b().get_name();
				 Inputfield[counter].setText(Dis);
				 counter++;

			 }
			
			 
			 
		 }
		 int len=matches.size()-1;
		 Match m=matches.get(String.valueOf(len)).get(0);
		 if(m.get_outcome()==OutCome.Team_A_Won)
		 {
		 winner=m.get_team_a();
		 WIN.setText(winner.get_name());
		 }
		 else if (m.get_outcome()==OutCome.Team_B_Won)
		 {
			 winner=m.get_team_b();
			 WIN.setText(winner.get_name());
		 }
		 else
		 {
			 WIN.setText("None");
		 }
		 

		
	}
	 private void OnClickedSearchTeam()
		{
			TeamController control=new TeamController();
			String TeamName= WIN.getText();
			Team team=control.Search(TeamName);
			InfoTeam info = new InfoTeam(team);
			info.setVisible(true);
		}
}
