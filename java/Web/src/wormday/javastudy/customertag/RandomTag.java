package wormday.javastudy.customertag;
import java.io.IOException;
import java.util.Random;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class RandomTag extends TagSupport {
	
	private static final long serialVersionUID=1L;
	
	private int min=0;
	
	private int max=Integer.MAX_VALUE;
	
	public void setMin(int value){this.min=value;}
	
	public void setMax(int value){this.max=value;}
	
	@Override
	public int doStartTag() throws JspException{
		try{
			Random random=new Random();
			int result=min+random.nextInt(max-min);
			pageContext.getOut().write(String.valueOf(result));
			
		}catch(IOException e){}
		return super.doStartTag();
	}
}
