/*import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Signup extends JPanel
{
	private JLabel nameLabel,lastnameLabel,genderLabel,statusLabel,phonenoLabel,addressLabel,aptLabel,cityLabel,
	stateLabel,zipcodeLabel,departLabel,docnameLabel;
	private JPanel signupPanel,namePanel,lastnamePanel,genderPanel,statusPanel,phonenoPanel,addressPanel,aptPanel,cityPanel,
	statePanel,zipcodePanel,departPanel,docnamePanel;
	private JLabel name,lastname,gender,status,phoneno,address,apt,city,
	state,zipcode,depart,docname;
	private JTextField name1,lastname1,gender1,status1,address1,phoneno1,apt1,city1,state1,zipcode1,
	depart1,docname1;
	JButton done;
	
	public Signup()
	{
		JFrame frame = new JFrame("Signup"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		signupPanel = new JPanel();
		signupPanel.setPreferredSize(new Dimension(800,500));
		signupPanel.setBackground(Color.cyan);
		
		nameLabel =new JLabel("Name:");
		name1=new JTextField(10);
		lastnameLabel =new JLabel("Lastname:");
		lastname1=new JTextField(10);
		
		namePanel = new JPanel();
		namePanel.setPreferredSize(new Dimension(800,30));
		namePanel.add(nameLabel);
		namePanel.add(name1);
		namePanel.add(lastnameLabel);
		namePanel.add(lastname1);
		
		genderLabel=new JLabel("Gender:");
		gender1=new JTextField(10);
		
		genderPanel= new JPanel();
		genderPanel.setPreferredSize(new Dimension(800,30));
		genderPanel.add(genderLabel);
		genderPanel.add(gender1);
		
		statusLabel=new JLabel("Status:");
		status1=new JTextField(10);
		
		statusPanel= new JPanel();
		statusPanel.setPreferredSize(new Dimension(800,30));
		statusPanel.add(statusLabel);
		statusPanel.add(status1);
		
		addressLabel=new JLabel("Address:");
		address1=new JTextField(10);
		aptLabel=new JLabel("Apt:");
		apt1=new JTextField(5);
		
		addressPanel= new JPanel();
		addressPanel.setPreferredSize(new Dimension(800,30));
		addressPanel.add(addressLabel);
		addressPanel.add(address1);
		addressPanel.add(aptLabel);
		addressPanel.add(apt1);
	
		cityLabel=new JLabel("City:");
		city1=new JTextField(10);
		stateLabel=new JLabel("State:");
		state1=new JTextField(10);
		cityPanel= new JPanel();
		cityPanel.setPreferredSize(new Dimension(800,30));
		cityPanel.add(cityLabel);
		cityPanel.add(city1);
		cityPanel.add(stateLabel);
		cityPanel.add(state1);
	
		phonenoLabel=new JLabel("Phone No:");
		phoneno1=new JTextField(10);
		zipcodeLabel=new JLabel("Zip Code:");
		zipcode1=new JTextField(10);
		
		phonenoPanel= new JPanel();
		phonenoPanel.setPreferredSize(new Dimension(800,30));
		phonenoPanel.add(phonenoLabel);
		phonenoPanel.add(phoneno1);
		phonenoPanel.add(zipcodeLabel);
		phonenoPanel.add(zipcode1);
		
		departLabel=new JLabel("Department:");
		depart1=new JTextField(10);
		docnameLabel=new JLabel("Doctor Name:");
		docname1=new JTextField(10);
		
		departPanel= new JPanel();
		departPanel.setPreferredSize(new Dimension(800,30));
		departPanel.add(departLabel);
		departPanel.add(depart1);
		departPanel.add(docnameLabel);
		departPanel.add(docname1);
		
		done=new JButton("Done");
         
		signupPanel.add(namePanel);
		signupPanel.add(genderPanel);
		signupPanel.add(statusPanel);
		signupPanel.add(phonenoPanel);
		signupPanel.add(addressPanel);
		signupPanel.add(cityPanel);
		signupPanel.add(departPanel);
		signupPanel.add(done);
        
    	frame.getContentPane().add(signupPanel);
		frame.pack();
		frame.setVisible(true);
		
		done.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				frame.dispose();
				Signup signup = new Signup();	
			}
		});
		}

}
*/