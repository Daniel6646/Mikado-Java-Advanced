<%@ page errorPage="err.jsp" %>
<% if(Math.random()<0.5)
{
	out.println("HI");
}
else
{
	throw new Exception("BYE");
}
%> 