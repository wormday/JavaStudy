package utility;

import javax.servlet.http.HttpServletRequest;

public class SingleServletModel {
	
	private HttpServletRequest request=null;
	
	public HttpServletRequest getRequest(){return request;}

	public void setRequest(HttpServletRequest request){this.request = request;}
	
	public SingleServletModel(HttpServletRequest request){
		this.request=request;
	}
}
