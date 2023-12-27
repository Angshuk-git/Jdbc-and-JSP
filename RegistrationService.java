package com.techpalle.jdbc;

import java.sql.*;

public class RegistrationService {
private static String dburl="jdbc:mysql://localhost:3306/palle";
private static String dbuser="root";
private static String dbpass="angshuk123";
private static Connection cn=null;
private static PreparedStatement ps=null;
public static int doRegister(String name,String email,String qual,String pass) {
	int row = 0;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection(dburl, dbuser, dbpass);
		ps=cn.prepareStatement("insert into student(name,email,qualification,password)values(?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, qual);
		ps.setString(4, pass);
		row=ps.executeUpdate();
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	finally {
		if(ps!=null) {
			try {
				cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(cn!=null) {
				try {
					cn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	return row;
	
}
}
