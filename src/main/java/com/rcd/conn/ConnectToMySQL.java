/**
 * ������ݿ�
 */
package com.rcd.conn;

import java.sql.*;

public class ConnectToMySQL {
	
	private static Connection conn = null;
	
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url    = "jdbc:mysql://localhost:3306/movie";
			String username = "root";
			String password = "916568";            // Change it to your Password
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}

}
