<%@ page import ="java.util.Date" %>
<%= new java.util.Date() %>
<br>
<%-- <%= new Date() %> --%>
<%-- jsp comments --%>
<!-- html comments -->
<br>
<%@ include file="Header.html" %>
<br>
<% if(Math.random()<0.5)
{
	out.println("Hi");
}
else
{
	out.println("Bye");
}
%>
<br>
<% if(Math.random()<0.5) {%>
<b> Hi </b>
<% } else { %>
<b> Bye </b>
<% } %>
<br>
<%! int count;
public int getCount()
{
	return count++;
}
%>
<% out.println(getCount()); %>