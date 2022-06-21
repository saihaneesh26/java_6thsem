

import java.io.IOException;
import shirt.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class prg9
 */
@WebServlet("/prg9")
public class prg9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prg9() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String []acc = request.getParameterValues("acc");
		String tag = request.getParameter("tag");
		String pocket = request.getParameter("pocket");
		String color = request.getParameter("colors");
		String acce ="";
		for(String i:acc) {
			acce+=i+", ";
		}
		System.out.println(acce+tag+pocket+color);
		Shirt s = new Shirt(acce,tag,pocket,color);
		Shirt.list.add(s);
		System.out.println(Shirt.list);
		request.setAttribute("shirts",Shirt.list);
		request.setAttribute("color", color);
		RequestDispatcher req = request.getRequestDispatcher("NewFile.jsp");
		req.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
