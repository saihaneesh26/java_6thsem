package prgm5;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Main extends Frame implements ActionListener{
	JTextArea area;
	JLabel name,state,comm,rate;
	JTextField nametxt,statetxt,commtxt,ratetxt;
	JButton submit;
	public Main() {
		
		name = new JLabel("Name");
		state = new JLabel("State");
		comm = new JLabel("Commision");
		rate = new JLabel("Rate");
		
		nametxt = new JTextField();
		statetxt = new JTextField();
		commtxt = new JTextField();
		ratetxt = new JTextField();
		submit = new JButton("Submit");
		
		add(name);
		add(nametxt);
		add(state);
		add(statetxt);
		add(comm);
		add(commtxt);
		add(rate);
		add(ratetxt);
		add(submit);
		setSize(800,600);
		setLayout(new GridLayout(5,2));
		setVisible(true);
		
		
		submit.addActionListener((ActionListener)this);
	}
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource()==submit) {
			try {
				rep r = new rep(nametxt.getText(),statetxt.getText(),commtxt.getText(),ratetxt.getText());
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
