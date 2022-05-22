package assignment.servlets;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
public class Servlet9 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		request.setAttribute("name","harshad");
		//response.sendRedirect("http://localhost:8080/harshad/s10");
		pw.println("before");
		//request.getRequestDispatcher("/s10").forward(request,response);
		request.getRequestDispatcher("/s10").include(request,response);
		pw.println("After");
	}
}