/*import javax.swing.JFrame;

public class HealthCare
{ 
	
	public static void main(String[] args)  
	{ 
		
		LoginPage welcome  = new LoginPage(); 
		Signup newaccount=new Signup();
		
		UpdatePI up  = new UpdatePI();
		Billing bill=new Billing();
		DPRelation rtn=new DPRelation();
		Admin admin= new Admin();
		DatabaseReader dbr = new DatabaseReader();
		String[][] user = dbr.DB();
		
	
		JFrame frame = new JFrame("Login Page"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(welcome);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		
		welcome.signup.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent abe) 
			{
				frame.getContentPane().removeAll();
				frame.setTitle("Sign Up");
				frame.getContentPane().add(newaccount);
				frame.pack();
				frame.setVisible(true);
			}
		});
		
		newaccount.done.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent abe) 
			{
				frame.getContentPane().removeAll();
				frame.setTitle("Login Page");
				frame.getContentPane().add(pi);
				frame.pack();
				frame.setVisible(true);
			}
		});

		pi.edit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent abe) 
			{
				frame.getContentPane().removeAll();
				frame.setTitle("Update Information");
				frame.getContentPane().add(up);
				frame.pack();
				frame.setVisible(true);
			}
		});
		
		up.save.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent abe) 
			{
				frame.getContentPane().removeAll();
				frame.setTitle("Patient Information");
				frame.getContentPane().add(pi);
				frame.pack();
				frame.setVisible(true);
			}
		});
		
		pi.pay.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent abe) 
			{
				frame.getContentPane().removeAll();
				frame.setTitle("Billing");
				frame.getContentPane().add(bill);
				frame.pack();
				frame.setVisible(true);
			}
		});
		
		bill.pay.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent abe) 
					{
						frame.getContentPane().removeAll();
						frame.setTitle("Patient Information");
						frame.getContentPane().add(pi);
						frame.pack();
						frame.setVisible(true);
					}
				});
		
		pi.update.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent abe) 
			{
				frame.getContentPane().removeAll();
				frame.setTitle("Admin");
				frame.getContentPane().add(admin);
				frame.pack();
				frame.setVisible(true);
			}
		});
		
		admin.ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
			for (String[] u : user)
			{
				if (admin.name.getText().equals(u[1])&&(admin.adminID.getText().equals(u[1]))
				{
					frame.getContentPane().removeAll();
					frame.setTitle("DPRelation");
					frame.getContentPane().add(rtn);
					frame.pack();
					frame.setVisible(true);
				}
			}
			}
		});
			
		 
		admin.ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent abe) 
			{
				frame.getContentPane().removeAll();
				frame.setTitle("DPRelation");
				frame.getContentPane().add(rtn);
				frame.pack();
				frame.setVisible(true);
			}
		});
			
		rtn.go.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent abe) 
			{
				frame.getContentPane().removeAll();
				frame.setTitle("Patient Information");
				frame.getContentPane().add(pi);
				frame.pack();
				frame.setVisible(true);
			}
		});
		
	}
		
	}

*/