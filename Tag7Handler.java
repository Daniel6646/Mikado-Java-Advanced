package tagext;
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class  Tag7Handler extends  BodyTagSupport
{
	public int doEndTag() throws JspTagException
	{
		BodyContent bc=getBodyContent();
		if(bc!=null)
		{
			StringBuffer output=new StringBuffer(bc.getString());
			output.reverse();
			try
			{
				bc.getEnclosingWriter().write(output.toString());
			}
			catch(IOException e)
			{
				throw new JspTagException("Fatal IO Error");
			}
		}
		return EVAL_PAGE;
	}
}
