package com.artisan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/db_student?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false";
	private String dbUserName="root";
	private String dbPassword="root";
	private String jdbcName="com.mysql.cj.jdbc.Driver";
	
	public Connection getCon(){
		try {
	    	
				Class.forName(jdbcName);
				System.out.println("�������سɹ���");
			} catch (ClassNotFoundException e) {

				System.out.println("����ʧ�ܣ�");
				e.printStackTrace();
			}
			Connection con =null;
	try {
		con =  DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		
	} catch (SQLException e) {
		e.printStackTrace();
	
	}
	return con;
}
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {dbUtil.getCon();
		System.out.println("���ݿ����ӳɹ�");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
	}
	
	}


