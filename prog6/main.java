import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class main extends Frame implements ActionListener{
	JButton submit,get;
	JTextField pnametxt,medidtxt;
	JLabel pname,medid;
	public main()
	{
		pnametxt = new JTextField();
		medidtxt = new JTextField();
		medid = new JLabel("medid");
		pname = new JLabel("pname");
		submit = new JButton("Submit");
		submit.addActionListener((ActionListener)this);
		get = new JButton("get");
		get.addActionListener((ActionListener)this);
		add(pname);
		add(pnametxt);
		add(medid);
		add(medidtxt);
		add(submit);
		add(get);
		setSize(800,600);
		setLayout(new GridLayout(9,2));
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource()==submit) {
			try {
				patient p = new patient();
				p.insert(pnametxt.getText(),Integer.parseInt(medidtxt.getText()));
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		if(ev.getSource()==get) {
			try {
				patient p = new patient();
				p.getData(1);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
	public static void main(String args[]) {
		main m = new main();
	}
	
}
