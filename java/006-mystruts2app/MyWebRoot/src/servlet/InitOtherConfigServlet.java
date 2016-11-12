package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import utility.ConstSetup;

/**
 * 初始化周边设置参数
 */
public class InitOtherConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 19761210;
	

	public void init(ServletConfig arg0) throws ServletException {
		ConstSetup.SPLIT_COLUMN_LENGTH=new Integer(Integer.parseInt(arg0.getInitParameter("SPLIT_COLUMN_LENGTH")));
		ConstSetup.PHYSICAL_PATH=arg0.getInitParameter("PHYSICAL_PATH");
	}

	public void destroy(){super.destroy();}
}