package assignment.servlets;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
public class Servlet12 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		ServletContext sc = getServletContext();
		String s = (String)sc.getAttribute("name");
		pw.println("Hello  "+s);
	}
}