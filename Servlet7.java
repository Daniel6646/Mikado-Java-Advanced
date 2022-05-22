package assignment.servlets;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
public class Servlet7 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession();
		String s = (String)hs.getAttribute("count");
		if(s == null)
		{
			pw.println("This Is Your 1st Visit");
			hs.setAttribute("count","1");
			hs.setAttribute("date", new Date());
		}
		else
		{
			int i = Integer.parseInt(s);
			i++;
			pw.println("This Is Your Visit No  "+i);
			Date d = (Date) hs.getAttribute("date");
			pw.println("You Last Visited on  "+d);
			hs.setAttribute("count",String.valueOf(i));
			hs.setAttribute("date",new Date());
		}
	}
}