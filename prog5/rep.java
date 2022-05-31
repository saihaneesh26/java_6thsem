package prgm5;

import java.sql.*;
public class rep extends connection{
	int id;
	public rep() throws SQLException,ClassNotFoundException {
		// TODO Auto-generated constructor stub
	}
	public void insert(String name,String state,String comm,String rate) throws SQLException,ClassNotFoundException{
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
			id = r.getInt("repno");
		}
	}
	public int getId() {
		return this.id;
	}
	public String getData() throws SQLException,ClassNotFoundException{
		Statement st = conn.createStatement();
		ResultSet r = st.executeQuery("Select * from rep");
		String res="";
		while(r.next()) {
			res+="ID: "+r.getInt("repno")+"\n"+"Name: "+r.getString("repnane")+"\n\n";
		}
		return res;
	}
}
