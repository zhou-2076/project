import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

	public class test {
	//定义数据库对象
	static Connection conn=null;//连接对象
	//定义数据库连接信息
	static String url="jdbc:oracle:thin:@localhost:1521:orcl";//地址
	static String user="scott";//用户名
	static String password="tiger";//密码
	
	public static void main(String[] args){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//驱动类名
			System.out.println("加载注册驱动成功");
			conn=DriverManager.getConnection(url, user, password);//连接到指定数据库，用户名，密码
			System.out.println("连接数据库成功");
		}catch (Exception e) {
			System.out.println("失败！连接数据库失败");
		}
		
	}
	
	}
		
	



