import java.sql.*;

public class patient extends connection{
	public patient() throws SQLException, ClassNotFoundException {
		super();
	}
	String pname;
	int medid;
	public void insert(String pname,int medid) throws SQLException,ClassNotFoundException{
		this.medid = medid;
		Statement st = conn.createStatement();
		this.pname = pname;
		String sql = "insert into patient(pname,medid)"+" values(?,?)";
		PreparedStatement p = conn.prepareStatement(sql);
		p.setString(1, pname);
		p.setInt(2, medid);
		p.executeUpdate();
		System.out.println("done");
		ResultSet r = st.executeQuery("Select * from patient");
		while(r.next()) {
			System.out.println("Name: "+r.getString("pname"));
		}
	}
	public void getData(int id) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet r = st.executeQuery("Select * from patient ");
		while(r.next()) {
			if (r.getInt("pid")==id)
			System.out.println("Name: "+r.getString("pname"));
		}
		
	}
}
