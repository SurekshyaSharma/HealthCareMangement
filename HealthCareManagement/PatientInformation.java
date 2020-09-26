import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PatientInformation
{ 
	private JLabel nameLabel,lastnameLabel,genderLabel,statusLabel,addressLabel,cityLabel,stateLabel,
	phonenumberLabel,zipcodeLabel,noofvisitLabel,departmentLabel,docnameLabel,scheduledateLabel,
	followupLabel,billingLabel;
	private JPanel PIPanel, namePanel,lastnamePanel,genderPanel,statusPanel,phonenumberPanel,addressPanel,
	cityPanel,statePanel,zipcodePanel,noofvisitPanel,departmentPanel,docnamePanel,
	followupPanel,billingPanel;
	public JLabel name,lastname,gender,status,phonenumber,address,city,state,zipcode,noofvisit,department,
	docname,followup,billing;
	JButton update,edit,pay;
	
	public PatientInformation(int id) //parameter passing 
	{
		Patients p = new Patients(id);
		
		JFrame frame = new JFrame("Patient Information"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		PIPanel = new JPanel();
		PIPanel.setPreferredSize(new Dimension(800,500));
		PIPanel.setBackground(Color.cyan);
		
		
		nameLabel =new JLabel("Name:");
		name =new JLabel(p.getFname());
		lastnameLabel =new JLabel("Lastname:");
		lastname =new JLabel(p.getLname());
		
		genderLabel =new JLabel("Gender:");
		gender =new JLabel(p.getGender());
		
		statusLabel=new   JLabel("Status:");
		status = new JLabel(p.getStatus());
		
		phonenumberLabel=new JLabel("Phone number:");
		phonenumber =new JLabel(p.getPhoneno());
		
		addressLabel= new  JLabel("Address:");
		address = new JLabel(p.getAddress());
		
		cityLabel=new JLabel("City:");
		city=new JLabel(p.getCity());
		stateLabel=new JLabel("State:");
		state=new JLabel(p.getState());
		
		zipcodeLabel=new   JLabel("Zip-Code:");
		zipcode=new JLabel(p.getZipcode());
		
		noofvisitLabel=new JLabel("No.of visit: ");
		noofvisit =new JLabel(p.getNoofvisit());
       
		departmentLabel=new JLabel("Department:");
		department= new JLabel(p.getDepartment());
		
		docnameLabel=new JLabel("Doctor Name:");
		docname=new JLabel(p.getDocname());
		
		followupLabel=new JLabel("Follow Up Date:");
		followup =new JLabel(p.getFollowupdate());
		
		billingLabel=new JLabel("Due Amount:$");
		billing = new JLabel(p.getBilling());		
		
		namePanel = new JPanel();
		namePanel.setPreferredSize(new Dimension(800,30));
		namePanel.add(nameLabel);
		namePanel.add(name);
		namePanel.add(lastnameLabel);
		namePanel.add(lastname);
		
		genderPanel = new JPanel();
		genderPanel.setPreferredSize(new Dimension(800,30));
		genderPanel.add(genderLabel);
		genderPanel.add(gender);
		
		statusPanel = new JPanel();
		statusPanel.setPreferredSize(new Dimension(800,30));
		statusPanel.add(statusLabel);
		statusPanel.add(status);		
		
		phonenumberPanel = new JPanel();
		phonenumberPanel.setPreferredSize(new Dimension(800,30));
		phonenumberPanel.add(phonenumberLabel);
		phonenumberPanel.add(phonenumber);
		
		addressPanel = new JPanel();
		addressPanel.setPreferredSize(new Dimension(800,30));
		addressPanel.add(addressLabel);
		addressPanel.add(address);

		cityPanel= new JPanel();
		cityPanel.setPreferredSize(new Dimension(800,30));
		cityPanel.add(cityLabel);
		cityPanel.add(city);
		cityPanel.add(stateLabel);
		cityPanel.add(state);
	
		zipcodePanel = new JPanel();
		zipcodePanel.setPreferredSize(new Dimension(800,30));
		zipcodePanel.add(zipcodeLabel);
		zipcodePanel.add(zipcode);
		
		noofvisitPanel = new JPanel();
		noofvisitPanel.setPreferredSize(new Dimension(800,30));
		noofvisitPanel.add(noofvisitLabel);
		noofvisitPanel.add(noofvisit);
		
		update=new JButton("Update");
		departmentPanel=new JPanel();
		departmentPanel.setPreferredSize(new Dimension(800,30));
		departmentPanel.add(departmentLabel);
		departmentPanel.add(department);
		departmentPanel.add(update);
		
		docnamePanel=new JPanel();
		docnamePanel.setPreferredSize(new Dimension(800,30));
		docnamePanel.add(docnameLabel);
		docnamePanel.add(docname);
		
		followupPanel=new JPanel();
		followupPanel.setPreferredSize(new Dimension(800,30));
		followupPanel.add(followupLabel);
		followupPanel.add(followup);
		
		pay=new JButton("Pay");
		billingPanel= new JPanel();
		billingPanel.setPreferredSize(new Dimension(800,30));
		billingPanel.add(billingLabel);
		billingPanel.add(billing);
		billingPanel.add(pay);
		
		edit=new JButton("Edit Profile");
		
		PIPanel.add(namePanel);
		PIPanel.add(genderPanel);
		PIPanel.add(statusPanel);
		PIPanel.add(phonenumberPanel);
		PIPanel.add(addressPanel);
		PIPanel.add(cityPanel);
		PIPanel.add(zipcodePanel);
		PIPanel.add(departmentPanel);
		PIPanel.add(docnamePanel);
		PIPanel.add(noofvisitPanel);
		PIPanel.add(followupPanel);
		PIPanel.add(billingPanel);
		PIPanel.add(edit);
	    
		frame.getContentPane().add(PIPanel);
		frame.pack();
		frame.setVisible(true);
		
		update.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				frame.dispose();
				DPRelation rtn = new DPRelation();	
				
			}
		});
		
		pay.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				frame.dispose();
				Billing bill = new Billing();	
			}
		});
		
		edit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				frame.dispose();
				UpdatePI upI = new UpdatePI(id);	
			}
		});
		
	} // method ends
} 
	
