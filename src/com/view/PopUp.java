package com.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopUp extends JFrame
{
	private static final long serialVersionUID = 2280912508080114298L;
	
	private JPanel contentPane;
	private JTextField txtHelloOverThere;

	
	public PopUp(String message)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 462);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				Close();
			}
		});
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
	
	private void Close()
	{
		this.dispose();
	}
}
