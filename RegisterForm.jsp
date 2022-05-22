<%@ page import="java.io.*,java.sql.*"  %>
<%! Connection con;
public void jspInit()
	{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","mikado");
	}
	public void jspDestroy()
	{
			con.close();
	}
%>

<% protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		String s=request.getParameter("id");
		String s1=request.getParameter("name");
		String s2=request.getParameter("salary");
		PreparedStatement pstmt = con.prepareStatement("Insert into Employee values(?,?,?)");
		pstmt.setInt(1,Integer.parseInt(s));
		pstmt.setString(2,s1);
		pstmt.setDouble(3,Double.parseDouble(s2));
		int i=pstmt.executeUpdate();
		out.println("<b>No of rows inserted="+i);
		pstmt.close();
	}
%>
