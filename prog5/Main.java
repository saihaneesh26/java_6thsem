package prgm5;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Main extends Frame implements ActionListener{
	JLabel name,state,comm,rate,cname,cstate,climit;
	JTextField nametxt,statetxt,commtxt,ratetxt,cnametxt,cstatetxt,climittxt;
	JButton submit,display;
	public Main() {
		
		name = new JLabel("Rep Name");
		state = new JLabel("Rep State");
		comm = new JLabel("Rep Commision");
		rate = new JLabel("Rep Rate");
		
		nametxt = new JTextField();
		statetxt = new JTextField();
		commtxt = new JTextField();
		ratetxt = new JTextField();
		
		cname = new JLabel("Customer Name");
		cstate = new JLabel("Customer State");
		climit = new JLabel("Credit Limit");
		
		cnametxt = new JTextField();
		cstatetxt = new JTextField();
		climittxt = new JTextField();
		
		
		submit = new JButton("ADD");
		
		add(name);
		add(nametxt);
		add(state);
		add(statetxt);
		add(comm);
		add(commtxt);
		add(rate);
		add(ratetxt);
		
		add(cname);
		add(cnametxt);
		add(cstate);
		add(cstatetxt);
		add(climit);
		add(climittxt);
		
		add(submit);
		setSize(800,600);
		setLayout(new GridLayout(9,2));
		setVisible(true);
		
		
		submit.addActionListener((ActionListener)this);
	}
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource()==submit) {
			try {
				rep r = new rep();
				r.insert(nametxt.getText(),statetxt.getText(),commtxt.getText(),ratetxt.getText());
				Customer c = new Customer();
				c.insert(cnametxt.getText(),cstatetxt.getText(),climittxt.getText(),1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		Main m = new Main();
	}

}
