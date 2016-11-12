package utility;

import org.logicalcobwebs.proxool.ProxoolDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstSetup {
	public static final ProxoolDataSource getProxoolDataSource(){
    	ApplicationContext appCt = new ClassPathXmlApplicationContext("database.xml");
        ProxoolDataSource dataSource = (ProxoolDataSource) appCt.getBean("proxoolDataSource");
        return dataSource;
    }
	
	//数据库所有者
	public static String DATABASE_OWNER="test";
	
	//数据库类型
	public static String DATABASE="MYSQL";
	
	//分页行数
	public static String REFERENCE_RANGE="10";
	
	//显示列截流
	public static Integer SPLIT_COLUMN_LENGTH=new Integer(0);
	
	//项目的物理路径
	public static String PHYSICAL_PATH="";
}