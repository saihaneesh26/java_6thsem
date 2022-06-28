import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Main extends Frame implements ActionListener{
	
	ArrayList<Student> slist = new ArrayList<Student>();
	public JTextArea area;
	public JLabel name,usn,address,age,g1,g2,g3,cat;
	public JTextField txtname,txtusn,txtaddr,txtage,txtg1,txtg2,txtg3;
	public JComboBox<String> category;
	public JButton submit,display;
	public String cats[]= {"GM","BC","SC"};
	public Main() {
		name = new JLabel("Name");
		usn = new JLabel("USN");
		address = new JLabel("Address");
		age = new JLabel("Age");
		g1 = new JLabel("SGPA-1");
		g2 = new JLabel("SGPA-2");
		g3 = new JLabel("SGPA-3");
		cat = new JLabel("Category");
		txtname = new JTextField();
		txtusn = new JTextField();
		txtaddr = new JTextField();
		txtage = new JTextField();
		txtg1 = new JTextField();
		txtg2 = new JTextField();
		txtg3 = new JTextField();
		submit = new JButton("Submit");
		display = new JButton("Display");
		category = new JComboBox<String>(cats);
		area = new JTextArea();
		add(name);
		add(txtname);
		add(usn);
		add(txtusn);
		add(address);
		add(txtaddr);
		add(age);
		add(txtage);
		add(cat);
		add(category);
		add(g1);
		add(txtg1);
		add(g2);
		add(txtg2);
		add(g3);
		add(txtg3);
		add(submit);
		add(display);
		add(area);
		display.addActionListener((ActionListener)this);
		submit.addActionListener((ActionListener)this);
	}
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource()==submit) {
			int age=0;
			try {
				age = Integer.parseInt(txtage.getText());
				if(age<0 || age>100)		
				{
					txtage.setText(JOptionPane.showInputDialog(null, "reenter age"));
//					flag = false;
//					txtage.requestFocus();
				}
			}catch(Exception e) {
				
				txtage.setText(JOptionPane.showInputDialog(null, "reenter age"));
//				txtage.requestFocus();
			}
			Student s = new Student(
					txtname.getText(),
					txtusn.getText(),
					txtaddr.getText(),
					(String) category.getItemAt(category.getSelectedIndex()),
					Integer.parseInt(txtage.getText()),
					Double.parseDouble(txtg1.getText()),
					Double.parseDouble(txtg2.getText()),
					Double.parseDouble(txtg3.getText())
					);
			
			double g = (s.g1+s.g2+s.g3)/3;
			s.setCGPA(g);
			slist.add(s);
			
		}
		if(ev.getSource()==display) {	
			area.setText("");
			for(Student i:slist) 
				{
					area.setText(area.getText()+i+"\n");
					System.out.println(i);
				}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.setLayout(new GridLayout(10,2));
		m.setSize(600,400);
		m.setVisible(true);
	}

}
