import java.sql.*;
public class medicine extends connection{
	String medname;
	public medicine(String medname) throws SQLException,ClassNotFoundException{
		this.medname = medname;
		String sql = "insert into med(medname) values(?)";
		PreparedStatement p = conn.prepareStatement(sql);
		p.setString(1,medname);
	}
}
