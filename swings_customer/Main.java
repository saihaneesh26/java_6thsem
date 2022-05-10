package swings_customer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;
import javax.swing.event.*;

public class Main extends Frame implements ActionListener{
	JTextArea area;
	JLabel username,password,cid,phone;
	JTextField usernametxt,passwordtxt,cidtxt,phonetxt;
	JButton submit,add;
	ArrayList<Staff> slist = new ArrayList<Staff>();
	ArrayList<Customer> clist = new ArrayList<Customer>();
	boolean newCustomer = false;
	public Main() {
		slist.add(new Staff("admin","admin"));
		area = new JTextArea();
		username = new JLabel("USERNAME");
		password = new JLabel("PASSWORD");
		cid = new JLabel("CUSTOMER ID");
		phone = new JLabel("PHONE NO");
		usernametxt = new JTextField();
		passwordtxt = new JTextField();
		cidtxt = new JTextField();
		phonetxt = new JTextField();
		submit = new JButton("LOGIN");
		add = new JButton("ADD");
		submit.addActionListener((ActionListener)this);
		add.addActionListener((ActionListener)this);
		
		// TODO Auto-generated method stub
				System.out.println("hi");

		add(username);
		add(usernametxt);
		add(password);
		add(passwordtxt);	
		add(phone);
		add(phonetxt);
		add(cid);
		add(cidtxt);
		add(submit);
		add(add);
		add(area);
		setSize(600,400);
		setLayout(new GridLayout(6,2));
		setVisible(true);
		phone.setVisible(false);
		phonetxt.setVisible(false);
		cid.setVisible(false);
		cidtxt.setVisible(false);
		add.setVisible(false);
	}
	
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource()==submit) {
			String un = usernametxt.getText();
			String pass = passwordtxt.getText();
			newCustomer = false;
			for(Staff i :slist) {
				if(i.username.equals(un) && i.password.equals(pass)) {
					JOptionPane.showMessageDialog(this, "LOGGED IN");
					newCustomer = true;
				}
			}
			
			if(newCustomer)
			{	
				JOptionPane.showMessageDialog(this, "ADD A NEW CUSTOMER");
				submit.setVisible(false);
				phone.setVisible(true);
				phonetxt.setVisible(true);
				cid.setVisible(true);
				cidtxt.setVisible(true);
				add.setVisible(true);
				newCustomer = false;
			}
			else {
				JOptionPane.showMessageDialog(this, "NO USER FOUND");
			}
		}
		if(ev.getSource()==add) {
			Customer i = new Customer(usernametxt.getText(),passwordtxt.getText(),cidtxt.getText(),Integer.parseInt(phonetxt.getText()));
			clist.add(i);
			phone.setVisible(false);
			phonetxt.setVisible(false);
			cid.setVisible(false);
			cidtxt.setVisible(false);
			add.setVisible(false);
			submit.setVisible(true);
			area.setText("");
			area.setText(i.toString());
		}
	}
	public static void main(String[] args) {
				Main m = new Main();
	}

}
