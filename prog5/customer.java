import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class customer extends Frame implements ActionListener{
	JLabel cno,cname,climit,repno;
	JTextField cno_txt,cname_txt,climit_txt,repno_txt;
	JButton submit;
	customer(){
		
		cname = new JLabel("Customer Name");
		cno = new JLabel("Customer State");
		climit = new JLabel("Credit Limit");
		repno =new JLabel("REP No");
		
		cname_txt = new JTextField();
		cno_txt = new JTextField();
		climit_txt = new JTextField();
		repno_txt = new JTextField();
		
		submit = new JButton("ADD");
		
		
		add(cname);
		add(cname_txt);
		add(cno);
		add(cno_txt);
		add(climit);
		add(climit_txt);
		add(repno);
		add(repno_txt);
		
		add(submit);
		setSize(800,600);
		setLayout(new GridLayout(9,2));
		setVisible(true);
		
		
		submit.addActionListener((ActionListener)this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
			String na=cname_txt.getText();
			String no=cno_txt.getText();
			String cl=climit_txt.getText();
			String repno=repno_txt.getText();
			
			try {
				
				if(Integer.parseInt(cl)>15000){
					String sql1 ="select * from rep where repno = ?";
					PreparedStatement st1 = connection.c.prepareStatement(sql1);
					st1.setString(1,repno);
					ResultSet res = st1.executeQuery();
					while(res.next()) {
						JOptionPane.showMessageDialog(this,"CL>15000\nNAME:"+res.getString("repname"));
					}
					
				}
				
				String sql = "insert into customer(cusno,cusname,climit,repno,state) values(?,?,?,?,?)";
				PreparedStatement st;
				st = connection.c.prepareStatement(sql);
				st.setString(1, no);
				st.setString(2, na);
				st.setString(3, cl);
				st.setString(4, repno);
				st.setString(5,"state");//get params correctly..if forgot to consider this
				st.executeUpdate();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
