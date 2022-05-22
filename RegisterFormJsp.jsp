<%@ page import="java.sql.*"  %>
<%! Connection con;
public void jspInit()
	{
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","mikado");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void jspDestroy()
	{
		try
		{
				con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	%>

	<%

		String s = request.getParameter("id");
		String s1 = request.getParameter("name");
		String s2 = request.getParameter("salary");
		try
		{
			PreparedStatement pstmt = con.prepareStatement("Insert into employee values(?,?,?)");
			pstmt.setInt(1,Integer.parseInt(s));
			pstmt.setString(2,s1);
			pstmt.setDouble(3,Double.parseDouble(s2));
			int i = pstmt.executeUpdate();
			out.println("<B> No. of Rows Inserted = "+i);
			pstmt.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

%>
