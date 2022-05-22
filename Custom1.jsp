<%@ taglib uri="/WEB-INF/hello.tld" prefix="examples" %>
<html>
<body>
<p>This is a static output. Tag output is shown in italics</p>
<p><i>
<examples:hello>
hi how r u?<br><%= 3*3 %>
<br>
</examples:hello>
</i></p>
<p><b>Closing of the tag without the body will have the same effect</b></p>
<p><i>
<examples:hello/>
</i></p>
</body>
</html>