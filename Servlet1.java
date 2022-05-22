package assignment.servlets;
import javax.servlet.*;
import java.io.*;
public class Servlet1 extends GenericServlet
{
	public void service(ServletRequest request,ServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<b> Hello </b>");
	}
};