
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class patients
 */
@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
				Connection c;
				Class.forName("com.mysql.jdbc.Driver");
				 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","");
				String name = request.getParameter("name");
				String sql = "insert into patients values(?)";
				PreparedStatement st= c.prepareStatement(sql);
				st.setString(1,name);
				st.execute();
				response.getWriter().append("inserted");
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				response.getWriter().append("error"+e.toString());
			}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}