import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPage
{ 
	private JLabel welcomeLabel,passwordLabel;
	private JPanel loginPanel, welcomePanel,passwordPanel;
	JButton loginButton,signup;
	JTextField username,password;
	
	DatabaseReader dbr = new DatabaseReader();
	String[][] user = dbr.DB();

	public LoginPage()
	{
		JFrame frame = new JFrame("Login Page"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		loginPanel = new JPanel();
		loginPanel.setPreferredSize(new Dimension(800,500));
		loginPanel.setBackground(Color.cyan);
		
		welcomeLabel = new JLabel("Username: ");
	    username=new JTextField(20);
	    
		passwordLabel= new JLabel("Password:");
		password=new JTextField(20);
		
		welcomePanel= new JPanel();
		welcomePanel.setPreferredSize(new Dimension(800,30));
		welcomePanel.add(welcomeLabel);
		welcomePanel.add(username);
		
		passwordPanel= new JPanel();
		passwordPanel.setPreferredSize(new Dimension(800,30));
		passwordPanel.add(passwordLabel);
		passwordPanel.add(password);
		
		loginButton=new JButton("Login");
		signup=new JButton("Signup");
	    
		
		loginPanel.add(welcomePanel);
		loginPanel.add(passwordPanel);
		loginPanel.add(loginButton);
		loginPanel.add(signup);
		
		frame.getContentPane().add(loginPanel);
		frame.pack();
		frame.setVisible(true);
		
	 
	
		loginButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				
				for (String[] u : user)
				{
					if (password.getText().equals(u[3]) && username.getText().equals(u[16]))
					{						
						frame.dispose();
						PatientInformation pi  = new PatientInformation(Integer.parseInt(u[0]));						
					}
				}
	
			}
		});
		
		signup.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				frame.dispose();
				Signup si = new Signup();	
			}
		});

	}
}
	

	
