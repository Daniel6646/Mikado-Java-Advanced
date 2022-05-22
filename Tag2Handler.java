package tagext;
import java.io.*;
import java.util.Date;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class  Tag2Handler extends  TagSupport
{
	private String name;
	public int doStartTag() throws JspTagException 
	{
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag() throws JspTagException 
	{
		String dateString=new Date().toString();
		try
		{
			pageContext.getOut().println("Hello  "+name);
		}
		catch(IOException e)
		{
			throw new JspTagException("Could not write");
		}
		return EVAL_PAGE;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
