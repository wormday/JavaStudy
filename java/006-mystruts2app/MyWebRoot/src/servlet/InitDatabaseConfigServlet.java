package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import utility.ConstSetup;

/**
 * 初始化数据库配置参数
 */
public class InitDatabaseConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 19761210;

	public void init(ServletConfig arg0) throws ServletException {
		ConstSetup.DATABASE_OWNER=arg0.getInitParameter("DATABASE_OWNER");
		ConstSetup.DATABASE=arg0.getInitParameter("DATABASE");
		ConstSetup.REFERENCE_RANGE=arg0.getInitParameter("REFERENCE_RANGE");
	}
	
	public void destroy(){
		super.destroy();
	}
}