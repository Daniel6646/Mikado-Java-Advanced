package assignment.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class Servlet5 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String s = request.getParameter("name");
		Cookie c = new Cookie("MyCookie",s);
		// for Stored cookie
		c.setMaxAge(10000);
		response.addCookie(c);
		pw.println("Cookie sent to Your machine");
	}
}