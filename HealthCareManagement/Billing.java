import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Billing extends JPanel
{
	private JLabel dueblanceLabel,debitLabel,creditLabel;
	private JPanel billingPanel,dueblancePanel,debitPanel,creditPanel;
	private JLabel dueblance,debit,credit;
	private JTextField debit1,credit1;
	JButton pay;
	
	public Billing()
	{
		JFrame frame = new JFrame("Billing"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		billingPanel = new JPanel();
		billingPanel.setPreferredSize(new Dimension(800,500));
		billingPanel.setBackground(Color.cyan);
		
		dueblanceLabel= new JLabel("Due Amount:");
		dueblance = new JLabel("$234");
		
		dueblancePanel = new JPanel();
		dueblancePanel.setPreferredSize(new Dimension(800,20));
		dueblancePanel.add(dueblanceLabel);
		dueblancePanel.add(dueblance);
		
		
		debitLabel=new JLabel("Debit Card No:");
		debit1=new JTextField(10);
		
		debitPanel = new JPanel();
		debitPanel.setPreferredSize(new Dimension(800,20));
		debitPanel.add(debitLabel);
		debitPanel.add(debit1);
		
		
		creditLabel=new JLabel("Credit Card No:");
		credit1=new JTextField(10);
		
		creditPanel = new JPanel();
		creditPanel.setPreferredSize(new Dimension(800,20));
		creditPanel.add(creditLabel);
		creditPanel.add(credit1);

		pay=new JButton("Pay");
		
		billingPanel.add(dueblancePanel);
		billingPanel.add(debitPanel);
		billingPanel.add(creditPanel);
		billingPanel.add(pay);
		
		frame.getContentPane().add(billingPanel);
		frame.pack();
		frame.setVisible(true);
		
		pay.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				frame.dispose();
				PatientInformation pi = new PatientInformation(0);	
			}
		});
	}
	
 

}