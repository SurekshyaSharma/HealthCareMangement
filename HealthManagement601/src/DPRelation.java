/*import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DPRelation extends JPanel
{
	private JLabel departmentLabel,docnameLabel,noofvisitLabel,followupLabel;
	private JPanel relationPanel,departmentPanel,docnamePanel,noofvisitPanel,followupPanel;
	private JLabel department,docname,noofvisit,followup;
	private JTextField department1,docname1,noofvisit1,followup1;
	JButton go;
	
	public DPRelation()
	{
		JFrame frame = new JFrame("DPRelation"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		relationPanel = new JPanel();
		relationPanel.setPreferredSize(new Dimension(800,500));
		relationPanel.setBackground(Color.cyan);
		
		departmentLabel=new JLabel("Department:");
		department1=new JTextField(10);
		docnameLabel=new JLabel("Doctor Name:");
		docname1=new JTextField(10);
		
		noofvisitLabel=new JLabel("No Of Visit:");
		noofvisit1=new JTextField(10);
		followupLabel=new JLabel("Follow Up Date:");
		followup1=new JTextField(10);
		
		departmentPanel = new JPanel();
		departmentPanel.setPreferredSize(new Dimension(800,30));
		departmentPanel.add(departmentLabel);
		departmentPanel.add(department1);
		departmentPanel.add(docnameLabel);
		departmentPanel.add(docname1);
		
		noofvisitPanel = new JPanel();
		noofvisitPanel.setPreferredSize(new Dimension(800,30));
		noofvisitPanel.add(noofvisitLabel);
		noofvisitPanel.add(noofvisit1);
		noofvisitPanel.add(followupLabel);
		noofvisitPanel.add(followup1);
		
		go=new JButton("Save");
		
		relationPanel.add(departmentPanel);
		relationPanel.add(noofvisitPanel);
		relationPanel.add(go);
		
		frame.getContentPane().add(relationPanel);
		frame.pack();
		frame.setVisible(true);
		
		go.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				frame.dispose();
				PatientInformation pi = new PatientInformation(0);
			}
		});
		
	}
	
}*/