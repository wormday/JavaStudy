package core;

import java.sql.Connection;
import java.sql.SQLException;

import org.logicalcobwebs.proxool.ProxoolException;
import org.logicalcobwebs.proxool.ProxoolFacade;
import org.logicalcobwebs.proxool.admin.SnapshotIF;

import utility.ConstSetup;
          
          
public class ConnectionFactory{
	public ConnectionFactory(){super();}
               
    private static int activeCount = 0;
    
    /**
     * 获取连接,提供事务支持
     * @return
     */
    public Connection getFreeConnection(String alias){
        Connection conn=null;
		try{
			conn = ConstSetup.getProxoolDataSource().getConnection();
			showSnapshotInfo(alias);
			conn.setAutoCommit(false);//关闭自动Commit
		}catch(SQLException e){e.printStackTrace();}
        return conn;
    }

    /**
     * 此方法可以得到连接池的信息
     * @param alias proxool连接别名
     */
    public void showSnapshotInfo(String alias){
        try{
            SnapshotIF snapshot = ProxoolFacade.getSnapshot(alias, true);
            int curActiveCount=snapshot.getActiveConnectionCount();//获得活动连接数
            if(curActiveCount!=activeCount) activeCount=curActiveCount;
        }catch(ProxoolException e){e.printStackTrace();}
    }

    /**
     * 释放连接,提供事务支持
     * @param conn
     */
    public void freeConnection(Connection conn){
    	try{
    		conn.commit();
    		conn.setAutoCommit(true); //将AutoCommit恢复为true
		}catch(SQLException e){e.printStackTrace();
		}finally{try {if(conn!=null) conn.close();}catch(SQLException e){e.printStackTrace();}}
    }
}