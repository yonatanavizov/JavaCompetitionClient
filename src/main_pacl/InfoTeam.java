package main_pacl;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class InfoTeam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoTeam frame = new InfoTeam();
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
	public InfoTeam() {
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
		lblNewLabel.setFont(new Font("Bodoni MT", Font.BOLD, 25));
		lblNewLabel.setBounds(316, 10, 155, 52);
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
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(250, 235, 215));
		lblNewLabel_2.setBounds(158, 111, 87, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setForeground(new Color(250, 235, 215));
		lblNewLabel_2_1.setBounds(158, 149, 87, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setForeground(new Color(250, 235, 215));
		lblNewLabel_2_2.setBounds(158, 189, 97, 13);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_3.setForeground(new Color(250, 235, 215));
		lblNewLabel_2_3.setBounds(169, 240, 97, 13);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("New label");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_4.setForeground(new Color(250, 235, 215));
		lblNewLabel_2_4.setBounds(186, 290, 80, 13);
		contentPane.add(lblNewLabel_2_4);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(174, 320, 490, 54);
		contentPane.add(scrollPane_1);
		
		JLabel lblNewLabel_2_5 = new JLabel("New label");
		scrollPane_1.setRowHeaderView(lblNewLabel_2_5);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_5.setForeground(new Color(0, 0, 0));
	}
}
