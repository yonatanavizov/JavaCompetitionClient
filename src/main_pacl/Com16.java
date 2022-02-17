package main_pacl;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.Color;

public class Com16 extends ComFrame {

	private JPanel contentPane;
	private JTextField IN1R1;
	private JTextField IN2R1;
	private JTextField IN3R1;
	private JTextField IN4R1;
	private JTextField IN5R1;
	private JTextField IN6R1;
	private JTextField IN7R1;
	private JTextField IN8R1;
	private JTextField IN1R2;
	private JTextField IN2R2;
	private JTextField IN3R2;
	private JTextField IN4R2;
	private JTextField IN1R3;
	private JTextField IN2R3;
	private JTextField IN1F;
	private JTextField WIN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Com16 frame = new Com16();
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
	public Com16() {
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
		
		JLabel Match1R1 = new JLabel("match 1");
		Match1R1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Match1R1.setForeground(new Color(255, 228, 196));
		Match1R1.setBounds(93, 128, 45, 13);
		contentPane.add(Match1R1);
		
		JLabel Match2R1 = new JLabel("Match 2");
		Match2R1.setForeground(new Color(255, 228, 196));
		Match2R1.setBounds(93, 151, 45, 13);
		contentPane.add(Match2R1);
		
		IN1R1 = new JTextField();
		IN1R1.setText("TEam 1 vs ream 2");
		IN1R1.setBounds(155, 125, 96, 19);
		contentPane.add(IN1R1);
		IN1R1.setColumns(10);
		
		JLabel Match3R1 = new JLabel("Match 3");
		Match3R1.setForeground(new Color(255, 228, 196));
		Match3R1.setBounds(93, 191, 45, 13);
		contentPane.add(Match3R1);
		
		JLabel Match4R1 = new JLabel("Match 4");
		Match4R1.setForeground(new Color(255, 228, 196));
		Match4R1.setBounds(93, 214, 45, 13);
		contentPane.add(Match4R1);
		
		JLabel Match5R1 = new JLabel("Match 5");
		Match5R1.setForeground(new Color(255, 228, 196));
		Match5R1.setBounds(93, 249, 45, 13);
		contentPane.add(Match5R1);
		
		JLabel Match6R1 = new JLabel("Match 6");
		Match6R1.setForeground(new Color(255, 228, 196));
		Match6R1.setBounds(93, 272, 45, 13);
		contentPane.add(Match6R1);
		
		JLabel Match7R1 = new JLabel("Match 7");
		Match7R1.setForeground(new Color(255, 228, 196));
		Match7R1.setBounds(93, 314, 45, 13);
		contentPane.add(Match7R1);
		
		JLabel Match8R1 = new JLabel("Match 8");
		Match8R1.setForeground(new Color(255, 228, 196));
		Match8R1.setBounds(93, 337, 45, 13);
		contentPane.add(Match8R1);
		
		IN2R1 = new JTextField();
		IN2R1.setBounds(155, 148, 96, 19);
		contentPane.add(IN2R1);
		IN2R1.setColumns(10);
		
		IN3R1 = new JTextField();
		IN3R1.setColumns(10);
		IN3R1.setBounds(155, 188, 96, 19);
		contentPane.add(IN3R1);
		
		IN4R1 = new JTextField();
		IN4R1.setColumns(10);
		IN4R1.setBounds(155, 211, 96, 19);
		contentPane.add(IN4R1);
		
		IN5R1 = new JTextField();
		IN5R1.setColumns(10);
		IN5R1.setBounds(155, 246, 96, 19);
		contentPane.add(IN5R1);
		
		IN6R1 = new JTextField();
		IN6R1.setColumns(10);
		IN6R1.setBounds(155, 269, 96, 19);
		contentPane.add(IN6R1);
		
		IN7R1 = new JTextField();
		IN7R1.setColumns(10);
		IN7R1.setBounds(155, 311, 96, 19);
		contentPane.add(IN7R1);
		
		IN8R1 = new JTextField();
		IN8R1.setColumns(10);
		IN8R1.setBounds(155, 334, 96, 19);
		contentPane.add(IN8R1);
		
		JLabel lblNewLabel_1 = new JLabel("Round 1");
		lblNewLabel_1.setForeground(new Color(255, 192, 203));
		lblNewLabel_1.setBounds(178, 102, 62, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Round 2");
		lblNewLabel_2.setForeground(new Color(255, 192, 203));
		lblNewLabel_2.setBounds(406, 102, 62, 13);
		contentPane.add(lblNewLabel_2);
		
		IN1R2 = new JTextField();
		IN1R2.setText("TEam 1 vs ream 2");
		IN1R2.setColumns(10);
		IN1R2.setBounds(385, 125, 96, 19);
		contentPane.add(IN1R2);
		
		IN2R2 = new JTextField();
		IN2R2.setColumns(10);
		IN2R2.setBounds(385, 148, 96, 19);
		contentPane.add(IN2R2);
		
		IN3R2 = new JTextField();
		IN3R2.setColumns(10);
		IN3R2.setBounds(385, 188, 96, 19);
		contentPane.add(IN3R2);
		
		IN4R2 = new JTextField();
		IN4R2.setColumns(10);
		IN4R2.setBounds(385, 214, 96, 19);
		contentPane.add(IN4R2);
		
		JLabel Match4R1_1 = new JLabel("Match 4");
		Match4R1_1.setForeground(new Color(255, 228, 196));
		Match4R1_1.setBounds(326, 214, 45, 13);
		contentPane.add(Match4R1_1);
		
		JLabel Match3R1_1 = new JLabel("Match 3");
		Match3R1_1.setForeground(new Color(255, 228, 196));
		Match3R1_1.setBounds(326, 191, 45, 13);
		contentPane.add(Match3R1_1);
		
		JLabel Match2R1_1 = new JLabel("Match 2");
		Match2R1_1.setForeground(new Color(255, 228, 196));
		Match2R1_1.setBounds(326, 151, 45, 13);
		contentPane.add(Match2R1_1);
		
		JLabel Match1R1_1 = new JLabel("match 1");
		Match1R1_1.setForeground(new Color(255, 228, 196));
		Match1R1_1.setBounds(326, 128, 45, 13);
		contentPane.add(Match1R1_1);
		
		IN1R3 = new JTextField();
		IN1R3.setText("TEam 1 vs ream 2");
		IN1R3.setColumns(10);
		IN1R3.setBounds(597, 125, 96, 19);
		contentPane.add(IN1R3);
		
		IN2R3 = new JTextField();
		IN2R3.setColumns(10);
		IN2R3.setBounds(597, 148, 96, 19);
		contentPane.add(IN2R3);
		
		JLabel Match2R1_2 = new JLabel("Match 2");
		Match2R1_2.setForeground(new Color(255, 228, 196));
		Match2R1_2.setBounds(535, 151, 45, 13);
		contentPane.add(Match2R1_2);
		
		JLabel Match1R1_2 = new JLabel("match 1");
		Match1R1_2.setForeground(new Color(255, 228, 196));
		Match1R1_2.setBounds(535, 128, 45, 13);
		contentPane.add(Match1R1_2);
		
		IN1F = new JTextField();
		IN1F.setText("TEam 1 vs ream 2");
		IN1F.setColumns(10);
		IN1F.setBounds(775, 125, 96, 19);
		contentPane.add(IN1F);
		
		JLabel Match1R1_2_1 = new JLabel("match 1");
		Match1R1_2_1.setForeground(new Color(255, 228, 196));
		Match1R1_2_1.setBounds(723, 128, 45, 13);
		contentPane.add(Match1R1_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Round 3");
		lblNewLabel_2_1.setForeground(new Color(255, 192, 203));
		lblNewLabel_2_1.setBounds(621, 102, 62, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Final");
		lblNewLabel_2_2.setForeground(new Color(255, 192, 203));
		lblNewLabel_2_2.setBounds(801, 105, 70, 13);
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
		
		JButton btnNewButton = new JButton("Info");
		btnNewButton.setBounds(446, 318, 132, 53);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Winner Info");
		lblNewLabel_2_1_1.setForeground(new Color(255, 192, 203));
		lblNewLabel_2_1_1.setBounds(479, 286, 136, 22);
		contentPane.add(lblNewLabel_2_1_1);
		setTor();
	}
	@Override
	public void Display()
	{
		this.setVisible(true);
	}
	
	 private void setTor()
	{
		Component [] array= contentPane.getComponents();
		int len=17;
		
		JTextField [] Inputfield= new JTextField[len];
		for(int i=0,counter=0;i<array.length;i++)
		{
			if(array[i] instanceof JTextField)
			{
				Inputfield[counter]= (JTextField)array[i];
				Inputfield[counter].setText(""+counter);
				counter++;
			}
		}
		
	}
}