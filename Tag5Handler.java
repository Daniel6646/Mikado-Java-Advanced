package tagext;
import java.io.*;
import java.util.Date;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class  Tag5Handler extends  TagSupport
{
	private String name;
		public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int doStartTag() throws JspTagException 
	{
		pageContext.setAttribute("name",name);
		pageContext.setAttribute("className",getClass().getName());
		pageContext.setAttribute("date",new Date());
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag() throws JspTagException 
	{
		return EVAL_PAGE;
	}
}
