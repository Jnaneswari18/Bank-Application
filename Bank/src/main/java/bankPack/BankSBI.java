package bankPack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BankSBI
 */
@WebServlet("/BankSBI")
public class BankSBI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public BankSBI() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
	
		
		String name=request.getParameter("fname");
		String name1=request.getParameter("lname");
		String number=request.getParameter("acc");
		
		
		pw.println("<html><body bgcolor=#7CAADC>");
		pw.println("<header><h3><center>Customer details</center></h3></header>");
		pw.println("<center>FirstName is:"+name+"</center></br>");
		pw.println("<center>Lastname is:"+name1+"</center></br>");
		pw.println("<center>Account Number is:"+number+"</center></br>");
		pw.println("<a href=bank.html><center>Home</center></a>");
		pw.println("</body></html>");
		
		
		
		
	}

}
