package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PopUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtHelloOverThere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopUp frame = new PopUp("Some");
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

	
	public PopUp(String message) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 462);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setBounds(224, 313, 320, 21);
		contentPane.add(btnNewButton);
		
		txtHelloOverThere = new JTextField();
		txtHelloOverThere.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtHelloOverThere.setHorizontalAlignment(SwingConstants.CENTER);
		txtHelloOverThere.setText("<html>In following page you will have 3 options:<br/>- 32 Teams competiton<br/>-16 Teams competition<br/>-4 Teams competition</html>\r\n");
		txtHelloOverThere.setBounds(22, 32, 748, 271);
		contentPane.add(txtHelloOverThere);
		txtHelloOverThere.setColumns(10);
		txtHelloOverThere.setText(message);
	}
}
