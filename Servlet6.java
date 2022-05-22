package assignment.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class Servlet6 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Cookie []  c = request.getCookies();
		if(c != null)
		{
			for(Cookie co : c)
			{
				String s = co.getName();
				if(s.equals("MyCookie"))
				{
					String s1 = co.getValue();
					pw.println("Hi Welcome  "+s1);
				}
			}
		}
		else
		{
			pw.println("no Cookies found");
		}
	}
}