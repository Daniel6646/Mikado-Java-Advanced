package tagext;
import java.io.*;
import java.util.Date;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;

public class  Tag1Handler extends  TagSupport
{
	public int doStartTag() throws JspTagException 
	{
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag() throws JspTagException 
	{
		String dateString=new Date().toString();
		try
		{
			pageContext.getOut().write("Hello World <br>");
			pageContext.getOut().write("My Name is  "+getClass().getName()+" "+"and it's "+dateString);
		}
		catch(IOException e)
		{
			throw new JspTagException("Error writing to jsp out");
		}
		return EVAL_PAGE;
	}
}
