package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ajax.ValidateFoundation;

/**
 * ajax验证跳转servlet
 */
public class ValidationServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 19761210;

	public ValidationServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProgess(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProgess(request,response);
	}

	private void doProgess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ValidateFoundation vf=new ValidateFoundation();
		String data=request.getParameter("data");
		int index=Integer.parseInt(request.getParameter("index"));
		boolean passed=false;
		passed=vf.validate(data,index,request); 
		response.setContentType("text/xml");
		response.setHeader("Cache-Control","no-cache");
		out.println("<response>");
		out.println("<message>" + Boolean.toString(passed) + "</message>");
		out.println("</response>");
		out.close();
	}
}