<%@ taglib uri="/WEB-INF/hello.tld" prefix="examples" %>
<%! java.util.List names=new java.util.LinkedList();
public void jspInit()
{
	names.add("Harshad");
	names.add("Danny");
	names.add("Ganesh");
}
%>
<examples:helloIterator names="<%= names%>">
<b>Hi <%= name%> ur entry is <%= index%> in my list<br/>
</examples:helloIterator>
<br>
we have finished looping but i can access the tag's
className (<%= className%>)
and date is (<%= date%>) scripting variables
