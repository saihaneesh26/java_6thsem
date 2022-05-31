package prgm5;

import java.sql.*;

public class Customer extends connection{
	public Customer()throws SQLException,ClassNotFoundException {
		
	}
	public void insert(String name,String state,String climit,int repno) throws SQLException,ClassNotFoundException{
		Statement st = conn.createStatement();
		String sql = "insert into customer(cusname,state,credit_limit,repno)"+" values(?,?,?,?)";
		PreparedStatement p = conn.prepareStatement(sql);;
		p.setString(1,name);
		p.setString(2, state);
		p.setString(3,climit);
		p.setInt(4, repno);
		System.out.println("Pushed data customer");
		ResultSet r = st.executeQuery("Select * from customer");
		while(r.next()) {
			System.out.println("Name: "+r.getString("repname"));
		}
		
	}
	public String getData() throws SQLException,ClassNotFoundException{
		Statement st = conn.createStatement();
		ResultSet r = st.executeQuery("Select * from customer");
		String res="";
		while(r.next()) {
			res+="ID: "+r.getInt("cusno")+"\n"+"Name: "+r.getString("cusname")+"\n\n";
		}
		return res;
	}
}
