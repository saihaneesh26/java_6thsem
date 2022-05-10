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
	JButton bill,submit,add;
	ArrayList<Staff> slist = new ArrayList<Staff>();
	ArrayList<Customer> clist = new ArrayList<Customer>();
	ArrayList<Item> items = new ArrayList<Item>();
	JLabel item,price,quantity;
	JTextField itemtxt,pricetxt,quantitytxt;
	boolean newCustomer = false,first = true;
	double total=0;
	public Main() {
		slist.add(new Staff("a","a"));
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
		item = new JLabel("ITEM");
		itemtxt =  new JTextField();
		price = new JLabel("price");
		pricetxt =  new JTextField();
		quantity = new JLabel("Quantity");
		bill = new JButton("CHECK OUT");
		quantitytxt =  new JTextField();
		
		submit.addActionListener((ActionListener)this);
		add.addActionListener((ActionListener)this);
		bill.addActionListener((ActionListener)this);
		// TODO Auto-generated method stub

		add(username);
		add(usernametxt);
		add(password);
		add(passwordtxt);	
		add(phone);
		add(phonetxt);
		add(cid);
		add(cidtxt);
		add(item);
		add(itemtxt);
		add(quantity);
		add(quantitytxt);
		add(price);
		add(pricetxt);
		add(submit);
		add(add);
		add(bill);
		add(area);
		setSize(1000,800);
		setLayout(new GridLayout(9,2));
		setVisible(true);
		phone.setVisible(false);
		phonetxt.setVisible(false);
		cid.setVisible(false);
		cidtxt.setVisible(false);
		price.setVisible(false);
		pricetxt.setVisible(false);
		item.setVisible(false);
		itemtxt.setVisible(false);
		quantity.setVisible(false);
		quantitytxt.setVisible(false);
		bill.setVisible(false);
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
				
				username.setVisible(false);
				usernametxt.setVisible(false);
				password.setVisible(false);
				passwordtxt.setVisible(false);
				submit.setVisible(false);
				phone.setVisible(true);
				phonetxt.setVisible(true);
				cid.setVisible(true);
				cidtxt.setVisible(true);
				price.setVisible(true);
				pricetxt.setVisible(true);
				item.setVisible(true);
				itemtxt.setVisible(true);
				quantity.setVisible(true);
				quantitytxt.setVisible(true);
				add.setVisible(true);
				newCustomer = false;
				bill.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(this, "NO USER FOUND");
			}
		}
		if(ev.getSource()==add) {
			if (first)
				area.setText("CUSTOMER: "+cidtxt.getText()+"\nPHONE: "+phonetxt.getText()+"\n");
			Item i = new Item(itemtxt.getText(),Integer.parseInt(pricetxt.getText()),Double.parseDouble(quantitytxt.getText()));
			items.add(i);
			area.setText(area.getText()+"\n"+i.toString());
			itemtxt.setText("");
			pricetxt.setText("");
			quantitytxt.setText("");
			first = false;
			
		}
		if(ev.getSource()==bill) {
			Customer i = new Customer(usernametxt.getText(),passwordtxt.getText(),cidtxt.getText(),Integer.parseInt(phonetxt.getText()));
			clist.add(i);
			phone.setVisible(false);
			phonetxt.setVisible(false);
			cid.setVisible(false);
			cidtxt.setVisible(false);
			add.setVisible(false);
			submit.setVisible(true);
			username.setVisible(true);
			usernametxt.setVisible(true);
			password.setVisible(true);
			bill.setVisible(false);
			passwordtxt.setVisible(true);
			price.setVisible(false);
			pricetxt.setVisible(false);
			item.setVisible(false);
			itemtxt.setVisible(false);
			quantity.setVisible(false);
			quantitytxt.setVisible(false);
			usernametxt.setText("");
			passwordtxt.setText("");
			cidtxt.setText("");
			phonetxt.setText("");
			area.setText("");
			for (Item f : items)
				{
					total+=f.total;
//					area.setText(area.getText()+"\n"+f.toString());
				}
			area.setText(area.getText()+"\nTotal BILL"+total);
			total= 0;
			first = true;
		}
	}
	public static void main(String[] args) {
				Main m = new Main();
	}

}
