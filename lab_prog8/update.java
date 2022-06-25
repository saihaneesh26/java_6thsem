

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c  = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","");
			String sql ="update  patients set name =? where name=?";
			PreparedStatement s = c.prepareStatement(sql);
			s.setString(1,to); //set to 
			s.setString(2,from); //set from
			s.executeUpdate();
			response.getWriter().append("updated from :"+from+" to :"+to);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			response.getWriter().append(e.toString());
		}
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
