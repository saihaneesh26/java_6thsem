package prgm5;

import java.sql.*;
public class rep {
	public rep(String name,String state,String comm,String rate) throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
		Statement st = conn.createStatement();
		String sql = " insert into rep(repname,state,commision,rate)" + " values (?, ?, ?, ?)";
		 PreparedStatement preparedStmt = conn.prepareStatement(sql);
		  preparedStmt.setString (1, name);
		  preparedStmt.setString (2, state);
		  preparedStmt.setString (3, comm);
		  preparedStmt.setString(4, rate);
		  preparedStmt.execute();
		System.out.println("Pushed data rep");
		ResultSet r = st.executeQuery("Select * from rep");
		while(r.next()) {
			System.out.println("Name: "+r.getString("repname"));
		}
	}
}
