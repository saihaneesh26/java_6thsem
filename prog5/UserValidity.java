package program_db;

import java.sql.*;
import java.util.*;

public class UserValidity {
	public static void main(String args[]) throws ClassNotFoundException,SQLException{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter id");
		int id = Integer.parseInt(in.nextLine());
		System.out.println("Enter name");
		String n1 = in.nextLine();
		System.out.println("Enter password");
		String pass = in.nextLine();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Tab");
		while(rs.next()) {
			System.out.println("Id is "+rs.getInt(1));
			System.out.println("Name is "+rs.getString("name"));
			System.out.println("pass is "+rs.getString("pass"));
		}
	}
}
