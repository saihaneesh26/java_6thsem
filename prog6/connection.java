import java.sql.*;


public class connection  {
	public Connection conn;
	public connection() throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
	}
}