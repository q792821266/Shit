package com;

import java.sql.*;

public class BaseDao {

	public void DBCon() {
		/*
		 * jdbc:mysql:
		 * //localhost:3306/test?useUnicode=true&characterEncoding=gbk ;
		 * useUnicode=true：
		 */

		String url = "jdbc:mysql://localhost:3306/test";
		String username = "admin";
		String password = "admin";
		Connection con =null;
		Statement statement ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username,
					password);
			statement = con.createStatement();
		} catch (SQLException se) {
			System.out.println("数据库连接失败！");
			se.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
