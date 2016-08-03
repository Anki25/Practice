package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1=request.getParameter("txtname");
		String str2=request.getParameter("txtpass");
		//String str3=request.getParameter("txtcpass");
		if(str1.equals("NIIT")&&str2.equals("NIIT"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("WELCOME.html");
			rd.forward(request, response);
		}else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		}
	
	}

}
