package tagext;
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class  Tag3Handler extends  TagSupport
{
	private String name;
	private int count;
	public int doStartTag() throws JspTagException 
	{
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag() throws JspTagException 
	{
		try
		{
			pageContext.getOut().println("Hello   "+name+"   count ="+count);
		}
		catch(IOException e)
		{
			throw new JspTagException("Could not write");
		}
		return EVAL_PAGE;
	}
	public void setCount(int count)
	{
		this.count=count;
	}
	public int getCount()
	{
		return count;
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
