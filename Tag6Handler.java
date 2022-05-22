package tagext;
import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class  Tag6Handler extends  TagSupport implements IterationTag
{
	private List names;
	private int index;
	public List getNames()
	{
		return names;
	}
	public void setNames(List names)
	{
		this.names=names;
	}
	public int doStartTag() throws JspTagException 
	{
		index=0;
		setLoopVariables();
		return EVAL_BODY_INCLUDE;
	}
	public int doAfterBody() throws JspTagException 
	{
		if(++index<names.size())
		{
			setLoopVariables();
			return EVAL_BODY_AGAIN;
		}
		return SKIP_BODY;
	}
	public int doEndTag()
	{
		pageContext.setAttribute("className",getClass().getName());
		pageContext.setAttribute("date",new Date());
		return EVAL_PAGE;
	}
	private void setLoopVariables()
	{
		pageContext.setAttribute("name",names.get(index).toString());
		pageContext.setAttribute("index",new Integer(index));
	}
}
