import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

	public class test {
	//�������ݿ����
	static Connection conn=null;//���Ӷ���
	//�������ݿ�������Ϣ
	static String url="jdbc:oracle:thin:@localhost:1521:orcl";//��ַ
	static String user="scott";//�û���
	static String password="tiger";//����
	
	public static void main(String[] args){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//��������
			System.out.println("����ע�������ɹ�");
			conn=DriverManager.getConnection(url, user, password);//���ӵ�ָ�����ݿ⣬�û���������
			System.out.println("�������ݿ�ɹ�");
		}catch (Exception e) {
			System.out.println("ʧ�ܣ��������ݿ�ʧ��");
		}
		
	}
	
	}
		
	



