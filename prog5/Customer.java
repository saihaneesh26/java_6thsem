package prgm5;

import java.sql.*;

public class Customer {
	public Customer(String name,String state,String climit,int repno) throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
		Statement st = con.createStatement();
		String sql = "insert into customer(cusname,state,credit_limit,repno)"+" values(?,?,?,?)";
		PreparedStatement p = con.prepareStatement(sql);;
		p.setString(1,name);
		p.setString(2, state);
		p.setString(3,climit);
		p.setInt(4, repno);
		System.out.println("Pushed data customer");
		ResultSet r = st.executeQuery("Select * from customer");
		while(r.next()) {
			System.out.println("Name: "+r.getString("cusnane"));
		}
	}
}
