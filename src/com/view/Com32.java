package com.view;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.competition.dm.Contest;
import com.competition.dm.Match;
import com.competition.dm.Team;
import com.competition.dm.Match.OutCome;
import com.controller.TeamController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.Color;

public class Com32 extends ComFrame {

	private JPanel contentPane;
	private JTextField IN1R2;
	private JTextField IN2R2;
	private JTextField IN3R2;
	private JTextField IN4R2;
	private JTextField IN5R2;
	private JTextField IN6R2;
	private JTextField IN7R2;
	private JTextField IN8R2;
	private JTextField IN1R3;
	private JTextField IN2R3;
	private JTextField IN3R3;
	private JTextField IN4R3;
	private JTextField IN1R4;
	private JTextField IN2R4;
	private JTextField IN1F;
	private JTextField WIN;
	private JTextField IN1R1;
	private JTextField IN2R1;
	private JTextField IN3R1;
	private JTextField IN4R1;
	private JTextField IN5R1;
	private JTextField IN6R1;
	private JTextField IN7R1;
	private JTextField IN8R1;
	private JTextField IN9R1;
	private JTextField IN10R1;
	private JTextField IN11R1;
	private JTextField IN12R1;
	private JTextField IN13R1;
	private JTextField IN14R1;
	private JTextField IN15R1;
	private JTextField IN16R1;
	JTextField [] Inputfield;
	private static int compSize=32;
	private Team winner ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamController ts = new TeamController(compSize);
					Contest contest=new Contest("contest32",1);
					Team t1 =ts.Search("T2");
					Match m1 =new Match (t1,t1,0);
					m1.set_outcome(OutCome.Team_A_Won);
					ArrayList <Match> r1=new ArrayList<Match>();
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					r1.add(m1);
					ArrayList <Match> r2=new ArrayList<Match>();
					r2.add(m1);
					r2.add(m1);
					r2.add(m1);
					r2.add(m1);
					r2.add(m1);
					r2.add(m1);
					r2.add(m1);
					r2.add(m1);
					ArrayList <Match> r3=new ArrayList<Match>();
					r3.add(m1);
					r3.add(m1);
					r3.add(m1);
					r3.add(m1);
					ArrayList <Match> r4=new ArrayList<Match>();
					r4.add(m1);
					r4.add(m1);
					ArrayList <Match> r5=new ArrayList<Match>();
					r5.add(m1);
					HashMap<String,ArrayList<Match>> ma= new HashMap <String,ArrayList<Match>> ();
					ma.put("0", r1);
					ma.put("1", r2);
					ma.put("2", r3);
					ma.put("3", r4);
					ma.put("4", r5);
					contest.set_matches(ma);

					Com32 frame = new Com32(contest);
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
	public Com32(Contest contest) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 933, 568);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		IN14R1 = new JTextField();
		IN14R1.setColumns(10);
		IN14R1.setBounds(101, 442, 96, 19);
		contentPane.add(IN14R1);
		
		IN6R1 = new JTextField();
		IN6R1.setColumns(10);
		IN6R1.setBounds(101, 207, 96, 19);
		contentPane.add(IN6R1);
		
		IN12R1 = new JTextField();
		IN12R1.setColumns(10);
		IN12R1.setBounds(101, 384, 96, 19);
		contentPane.add(IN12R1);
		
		IN16R1 = new JTextField();
		IN16R1.setColumns(10);
		IN16R1.setBounds(101, 507, 96, 19);
		contentPane.add(IN16R1);
		
		IN11R1 = new JTextField();
		IN11R1.setColumns(10);
		IN11R1.setBounds(101, 361, 96, 19);
		contentPane.add(IN11R1);
		
		IN3R1 = new JTextField();
		IN3R1.setColumns(10);
		IN3R1.setBounds(101, 126, 96, 19);
		contentPane.add(IN3R1);
		
		IN2R1 = new JTextField();
		IN2R1.setColumns(10);
		IN2R1.setBounds(101, 86, 96, 19);
		contentPane.add(IN2R1);
		
		IN1R1 = new JTextField();
		IN1R1.setText("TEam 1 vs ream 2");
		IN1R1.setColumns(10);
		IN1R1.setBounds(101, 63, 96, 19);
		contentPane.add(IN1R1);
		
		IN5R1 = new JTextField();
		IN5R1.setColumns(10);
		IN5R1.setBounds(101, 184, 96, 19);
		contentPane.add(IN5R1);
		
		IN7R1 = new JTextField();
		IN7R1.setColumns(10);
		IN7R1.setBounds(101, 249, 96, 19);
		contentPane.add(IN7R1);
		
		IN10R1 = new JTextField();
		IN10R1.setColumns(10);
		IN10R1.setBounds(101, 321, 96, 19);
		contentPane.add(IN10R1);
		
		IN8R1 = new JTextField();
		IN8R1.setColumns(10);
		IN8R1.setBounds(101, 272, 96, 19);
		contentPane.add(IN8R1);
		
		IN9R1 = new JTextField();
		IN9R1.setText("TEam 1 vs ream 2");
		IN9R1.setColumns(10);
		IN9R1.setBounds(101, 298, 96, 19);
		contentPane.add(IN9R1);
		
		IN4R1 = new JTextField();
		IN4R1.setColumns(10);
		IN4R1.setBounds(101, 149, 96, 19);
		contentPane.add(IN4R1);
		
		IN15R1 = new JTextField();
		IN15R1.setColumns(10);
		IN15R1.setBounds(101, 484, 96, 19);
		contentPane.add(IN15R1);
		
		IN13R1 = new JTextField();
		IN13R1.setColumns(10);
		IN13R1.setBounds(101, 419, 96, 19);
		contentPane.add(IN13R1);
		
		JLabel lblMatch_3 = new JLabel("Match 12");
		lblMatch_3.setForeground(new Color(255, 228, 196));
		lblMatch_3.setBounds(39, 387, 62, 13);
		contentPane.add(lblMatch_3);
		
		JLabel lblMatch = new JLabel("match 9");
		lblMatch.setForeground(new Color(255, 228, 196));
		lblMatch.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMatch.setBounds(39, 301, 45, 13);
		contentPane.add(lblMatch);
		
		JLabel lblMatch_2 = new JLabel("Match 11");
		lblMatch_2.setForeground(new Color(255, 228, 196));
		lblMatch_2.setBounds(39, 364, 62, 13);
		contentPane.add(lblMatch_2);
		
		IN1R2 = new JTextField();
		IN1R2.setText("TEam 1 vs ream 2");
		IN1R2.setBounds(317, 63, 96, 19);
		contentPane.add(IN1R2);
		IN1R2.setColumns(10);
		
		JLabel lblMatch_6 = new JLabel("Match 15");
		lblMatch_6.setForeground(new Color(255, 228, 196));
		lblMatch_6.setBounds(39, 486, 62, 13);
		contentPane.add(lblMatch_6);
		
		JLabel lblMatch_4 = new JLabel("Match 13");
		lblMatch_4.setForeground(new Color(255, 228, 196));
		lblMatch_4.setBounds(39, 422, 62, 13);
		contentPane.add(lblMatch_4);
		
		JLabel lblMatch_7 = new JLabel("Match 16");
		lblMatch_7.setForeground(new Color(255, 228, 196));
		lblMatch_7.setBounds(39, 509, 62, 13);
		contentPane.add(lblMatch_7);
		
		JLabel lblMatch_5 = new JLabel("Match 14");
		lblMatch_5.setForeground(new Color(255, 228, 196));
		lblMatch_5.setBounds(39, 445, 62, 13);
		contentPane.add(lblMatch_5);
		
		JLabel lblMatch_1 = new JLabel("Match 10");
		lblMatch_1.setForeground(new Color(255, 228, 196));
		lblMatch_1.setBounds(39, 324, 62, 13);
		contentPane.add(lblMatch_1);
		
		JLabel lblNewLabel = new JLabel("Competition  Tornument");
		lblNewLabel.setForeground(new Color(255, 165, 0));
		lblNewLabel.setFont(new Font("Footlight MT Light", Font.BOLD, 25));
		lblNewLabel.setBounds(286, -14, 430, 70);
		contentPane.add(lblNewLabel);
		
		JLabel Match1R1 = new JLabel("match 1");
		Match1R1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Match1R1.setForeground(new Color(255, 228, 196));
		Match1R1.setBounds(255, 66, 45, 13);
		contentPane.add(Match1R1);
		
		JLabel Match2R1 = new JLabel("Match 2");
		Match2R1.setForeground(new Color(255, 228, 196));
		Match2R1.setBounds(255, 89, 45, 13);
		contentPane.add(Match2R1);
		
		JLabel Match3R1 = new JLabel("Match 3");
		Match3R1.setForeground(new Color(255, 228, 196));
		Match3R1.setBounds(255, 128, 45, 13);
		contentPane.add(Match3R1);
		
		JLabel Match4R1 = new JLabel("Match 4");
		Match4R1.setForeground(new Color(255, 228, 196));
		Match4R1.setBounds(255, 151, 45, 13);
		contentPane.add(Match4R1);
		
		JLabel Match5R1 = new JLabel("Match 5");
		Match5R1.setForeground(new Color(255, 228, 196));
		Match5R1.setBounds(255, 191, 45, 13);
		contentPane.add(Match5R1);
		
		JLabel Match6R1 = new JLabel("Match 6");
		Match6R1.setForeground(new Color(255, 228, 196));
		Match6R1.setBounds(255, 214, 45, 13);
		contentPane.add(Match6R1);
		
		JLabel Match7R1 = new JLabel("Match 7");
		Match7R1.setForeground(new Color(255, 228, 196));
		Match7R1.setBounds(255, 252, 45, 13);
		contentPane.add(Match7R1);
		
		JLabel Match8R1 = new JLabel("Match 8");
		Match8R1.setForeground(new Color(255, 228, 196));
		Match8R1.setBounds(255, 275, 45, 13);
		contentPane.add(Match8R1);
		
		IN2R2 = new JTextField();
		IN2R2.setBounds(317, 86, 96, 19);
		contentPane.add(IN2R2);
		IN2R2.setColumns(10);
		
		IN3R2 = new JTextField();
		IN3R2.setColumns(10);
		IN3R2.setBounds(317, 125, 96, 19);
		contentPane.add(IN3R2);
		
		IN4R2 = new JTextField();
		IN4R2.setColumns(10);
		IN4R2.setBounds(317, 154, 96, 19);
		contentPane.add(IN4R2);
		
		IN5R2 = new JTextField();
		IN5R2.setColumns(10);
		IN5R2.setBounds(317, 188, 96, 19);
		contentPane.add(IN5R2);
		
		IN6R2 = new JTextField();
		IN6R2.setColumns(10);
		IN6R2.setBounds(317, 211, 96, 19);
		contentPane.add(IN6R2);
		
		IN7R2 = new JTextField();
		IN7R2.setColumns(10);
		IN7R2.setBounds(317, 249, 96, 19);
		contentPane.add(IN7R2);
		
		IN8R2 = new JTextField();
		IN8R2.setColumns(10);
		IN8R2.setBounds(317, 278, 96, 19);
		contentPane.add(IN8R2);
		
		JLabel lblNewLabel_1 = new JLabel("Round 2");
		lblNewLabel_1.setForeground(new Color(255, 192, 203));
		lblNewLabel_1.setBounds(317, 49, 62, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Round 3");
		lblNewLabel_2.setForeground(new Color(255, 192, 203));
		lblNewLabel_2.setBounds(501, 49, 62, 13);
		contentPane.add(lblNewLabel_2);
		
		IN1R3 = new JTextField();
		IN1R3.setText("TEam 1 vs ream 2");
		IN1R3.setColumns(10);
		IN1R3.setBounds(482, 66, 96, 19);
		contentPane.add(IN1R3);
		
		IN2R3 = new JTextField();
		IN2R3.setColumns(10);
		IN2R3.setBounds(482, 95, 96, 19);
		contentPane.add(IN2R3);
		
		IN3R3 = new JTextField();
		IN3R3.setColumns(10);
		IN3R3.setBounds(482, 125, 96, 19);
		contentPane.add(IN3R3);
		
		IN4R3 = new JTextField();
		IN4R3.setColumns(10);
		IN4R3.setBounds(482, 154, 96, 19);
		contentPane.add(IN4R3);
		
		JLabel Match4R1_1 = new JLabel("Match 4");
		Match4R1_1.setForeground(new Color(255, 228, 196));
		Match4R1_1.setBounds(427, 157, 45, 13);
		contentPane.add(Match4R1_1);
		
		JLabel Match3R1_1 = new JLabel("Match 3");
		Match3R1_1.setForeground(new Color(255, 228, 196));
		Match3R1_1.setBounds(427, 128, 45, 13);
		contentPane.add(Match3R1_1);
		
		JLabel Match2R1_1 = new JLabel("Match 2");
		Match2R1_1.setForeground(new Color(255, 228, 196));
		Match2R1_1.setBounds(427, 89, 45, 13);
		contentPane.add(Match2R1_1);
		
		JLabel Match1R1_1 = new JLabel("match 1");
		Match1R1_1.setForeground(new Color(255, 228, 196));
		Match1R1_1.setBounds(427, 66, 45, 13);
		contentPane.add(Match1R1_1);
		
		IN1R4 = new JTextField();
		IN1R4.setText("TEam 1 vs ream 2");
		IN1R4.setColumns(10);
		IN1R4.setBounds(643, 66, 96, 19);
		contentPane.add(IN1R4);
		
		IN2R4 = new JTextField();
		IN2R4.setColumns(10);
		IN2R4.setBounds(643, 95, 96, 19);
		contentPane.add(IN2R4);
		
		JLabel Match2R1_2 = new JLabel("Match 2");
		Match2R1_2.setForeground(new Color(255, 228, 196));
		Match2R1_2.setBounds(588, 98, 45, 13);
		contentPane.add(Match2R1_2);
		
		JLabel Match1R1_2 = new JLabel("match 1");
		Match1R1_2.setForeground(new Color(255, 228, 196));
		Match1R1_2.setBounds(588, 66, 45, 13);
		contentPane.add(Match1R1_2);
		
		IN1F = new JTextField();
		IN1F.setText("TEam 1 vs ream 2");
		IN1F.setColumns(10);
		IN1F.setBounds(813, 66, 96, 19);
		contentPane.add(IN1F);
		
		JLabel Match1R1_2_1 = new JLabel("match 1");
		Match1R1_2_1.setForeground(new Color(255, 228, 196));
		Match1R1_2_1.setBounds(760, 66, 45, 13);
		contentPane.add(Match1R1_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Round 4");
		lblNewLabel_2_1.setForeground(new Color(255, 192, 203));
		lblNewLabel_2_1.setBounds(643, 49, 62, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Final");
		lblNewLabel_2_2.setForeground(new Color(255, 192, 203));
		lblNewLabel_2_2.setBounds(825, 49, 70, 13);
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
		
		JLabel Match1R1_3 = new JLabel("match 1");
		Match1R1_3.setForeground(new Color(255, 228, 196));
		Match1R1_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Match1R1_3.setBounds(39, 66, 45, 13);
		contentPane.add(Match1R1_3);
		
		JLabel Match2R1_3 = new JLabel("Match 2");
		Match2R1_3.setForeground(new Color(255, 228, 196));
		Match2R1_3.setBounds(39, 89, 45, 13);
		contentPane.add(Match2R1_3);
		
		JLabel Match3R1_2 = new JLabel("Match 3");
		Match3R1_2.setForeground(new Color(255, 228, 196));
		Match3R1_2.setBounds(39, 129, 45, 13);
		contentPane.add(Match3R1_2);
		
		JLabel Match4R1_2 = new JLabel("Match 4");
		Match4R1_2.setForeground(new Color(255, 228, 196));
		Match4R1_2.setBounds(39, 152, 45, 13);
		contentPane.add(Match4R1_2);
		
		JLabel Match5R1_1 = new JLabel("Match 5");
		Match5R1_1.setForeground(new Color(255, 228, 196));
		Match5R1_1.setBounds(39, 187, 45, 13);
		contentPane.add(Match5R1_1);
		
		JLabel Match6R1_1 = new JLabel("Match 6");
		Match6R1_1.setForeground(new Color(255, 228, 196));
		Match6R1_1.setBounds(39, 210, 45, 13);
		contentPane.add(Match6R1_1);
		
		JLabel Match7R1_1 = new JLabel("Match 7");
		Match7R1_1.setForeground(new Color(255, 228, 196));
		Match7R1_1.setBounds(39, 252, 45, 13);
		contentPane.add(Match7R1_1);
		
		JLabel Match8R1_1 = new JLabel("Match 8");
		Match8R1_1.setForeground(new Color(255, 228, 196));
		Match8R1_1.setBounds(39, 275, 45, 13);
		contentPane.add(Match8R1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Round 1");
		lblNewLabel_1_1.setForeground(new Color(255, 192, 203));
		lblNewLabel_1_1.setBounds(123, 49, 62, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Info");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClickedSearchTeam();
			}
		});
		btnNewButton.setBounds(442, 385, 132, 53);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Winner Info");
		lblNewLabel_2_1_1.setForeground(new Color(255, 192, 203));
		lblNewLabel_2_1_1.setBounds(475, 353, 136, 22);
		contentPane.add(lblNewLabel_2_1_1);
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
		setTor(contest);
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
			TeamController control=new TeamController(32);
			String TeamName= WIN.getText();
			Team team=control.Search(TeamName);
			InfoTeam info = new InfoTeam(team);
			info.setVisible(true);
		}
}
