package assignment.servlets;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
public class Servlet2 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String s = request.getParameter("name");
		String s1 = request.getParameter("age");
		pw.println("Your name is "+s);
		pw.println("<br/>");
		pw.println("Your age is "+s1);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Enumeration en = request.getParameterNames();
		while(en.hasMoreElements())
		{
			String s = (String)en.nextElement();
			String s1 = request.getParameter(s);
			pw.println("Parameter name is "+s);
			pw.println("Parameter value is "+s1);
			pw.println("<br/>");
		}
	}
};