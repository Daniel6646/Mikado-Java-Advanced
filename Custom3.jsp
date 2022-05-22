<%@ taglib uri="/WEB-INF/hello.tld" prefix="examples" %>
<% String s=request.getParameter("name"); %>
<examples:attribHello1 name="<%= s %>" count="10" />