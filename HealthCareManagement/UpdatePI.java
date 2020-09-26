import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class UpdatePI 
	{
		private JLabel statusLabel,phonenoLabel,zipcodeLabel,addressLabel,aptLabel,cityLabel,stateLabel;
		private JPanel updatePanel,statusPanel,phonenoPanel,zipcodePanel,addressPanel,aptPanel,cityPanel,statePanel;
		private JLabel status,phoneno,zipcode,address,apt,city;
		private JTextField status1,phoneno1,zipcode1,address1,apt1,city1,state1;
		JButton save;
		String ln="";
		DatabaseReader dbr = new DatabaseReader();
		String[][] user = dbr.DB();
		public UpdatePI(int id)
		{
			JFrame frame = new JFrame("UpdatePI"); 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			updatePanel = new JPanel();
			updatePanel.setPreferredSize(new Dimension(800,500));
			updatePanel.setBackground(Color.cyan);
			
		    statusLabel=new JLabel ("Status:");
			status1=new JTextField(6);
			
			statusPanel = new JPanel();
			statusPanel.setPreferredSize(new Dimension(800,30));
			statusPanel.add(statusLabel);		
			statusPanel.add(status1);
			    
			phonenoLabel=new JLabel ("Phone Number:");
			phoneno1=new JTextField(6);
			zipcodeLabel=new JLabel ("Zip Code:");
			zipcode1=new JTextField(6);
			
			phonenoPanel = new JPanel();
			phonenoPanel.setPreferredSize(new Dimension(800,30));
			phonenoPanel.add(phonenoLabel);		
			phonenoPanel.add(phoneno1);
			phonenoPanel.add(zipcodeLabel);
			phonenoPanel.add(zipcode1);
			
			addressLabel=new JLabel ("Address:");
			address1=new JTextField(10);
			cityLabel=new JLabel("City:");
			city1=new JTextField(6);
			stateLabel=new JLabel("State");
			state1=new JTextField(6);
			
			addressPanel = new JPanel();
			addressPanel.setPreferredSize(new Dimension(800,30));
			addressPanel.add(addressLabel);		
			addressPanel.add(address1);
			addressPanel.add(cityLabel);
			addressPanel.add(city1);
			addressPanel.add(stateLabel);
			addressPanel.add(state1);
			
			save=new JButton("Save");
			 
			updatePanel.add(statusPanel);
			updatePanel.add(phonenoPanel);
			updatePanel.add(addressPanel);
			updatePanel.add(save);
		    
			frame.getContentPane().add(updatePanel);
			frame.pack();
			frame.setVisible(true);
			
			save.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae) 
				{
					
					
					if (status1.getText() != "")
					{
						user[id][5] = status1.getText();
					}
					if (phoneno1.getText() != "")
					{
						user[id][6] = phoneno1.getText();
					}
					if (zipcode1.getText() != "")
					{
						user[id][10] = zipcode1.getText();
					}
					if (address1.getText() != "")
					{
						user[id][7] = address1.getText();
					}				
					if (city1.getText() != "")
					{
						user[id][8] = city1.getText();
					}
					if (state1.getText() != "")
					{
						user[id][9] = state1.getText();
					}
					//System.out.println(Arrays.toString(user[1]));
					frame.dispose();
					Writer w = new Writer(user);
					       
					PatientInformation pi = new PatientInformation(id);	
				}
			});
			
			
		    }
		}