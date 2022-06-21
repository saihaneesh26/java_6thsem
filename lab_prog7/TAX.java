

import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TAX
 */
@WebServlet("/TAX")
public class TAX extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TAX() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		int salary = Integer.parseInt(request.getParameter("salary"));
		int tax = Integer.parseInt(request.getParameter("tax"));
		response.getWriter().append(name);
		try{
	        FileWriter writer = new FileWriter("/home/ritadmin/eclipse-workspace/19is047/lab_7/src/main/webapp/salary.txt");//replace with ur txt file path
	        writer.write("NAME: "+name+"\nSALARY: "+String.valueOf(salary)+"\nTAX: "+String.valueOf(tax)+"\n");
	        System.out.println("Written to file");
	        writer.close();
	    }catch(Exception ex){
	        ex.printStackTrace();
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		response.getWriter().append(name);
		doGet(request, response);
	}

}
