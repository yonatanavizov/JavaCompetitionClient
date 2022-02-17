package main_pacl;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class FIrst extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		
		JLabel lblNewLabel_2 = new JLabel("In following page you will have 3 options:\r\n- 32 Teams competiton\r\n-16 Teams competition\r\n-4 Teams competition");
		lblNewLabel_2.setForeground(new Color(233, 150, 122));
		lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD, 13));
		lblNewLabel_2.setBounds(37, 71, 709, 132);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			  Com16 frame16=new Com16();
			  frame16.Display();
			}
		});
		btnNewButton.setBounds(339, 258, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Start");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Com32 frame32=new Com32();
				 frame32.Display();
				
			}
		});
		btnNewButton_1.setBounds(130, 258, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Start");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Comp4 frame4=new Comp4();
				  frame4.Display();
			}
		});
		btnNewButton_2.setBounds(572, 258, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("16 Teams");
		lblNewLabel_3.setForeground(new Color(250, 235, 215));
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(339, 213, 85, 17);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("32 Teams");
		lblNewLabel_4.setForeground(new Color(250, 235, 215));
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(130, 213, 68, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("4 Teams");
		lblNewLabel_5.setForeground(new Color(250, 235, 215));
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(572, 213, 68, 15);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("Search");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InfoTeam infoteam = new InfoTeam();
				infoteam.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(37, 377, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_6 = new JLabel("Team name");
		lblNewLabel_6.setForeground(new Color(255, 228, 181));
		lblNewLabel_6.setFont(new Font("Arimo", Font.BOLD, 14));
		lblNewLabel_6.setBounds(27, 328, 109, 13);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(133, 326, 143, 19);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
