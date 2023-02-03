package com.demo.exception.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		String driver="com.mysql.cj.jdbc.Driver";
		String user="root";
		String pass="4321";
		String url="jdbc:mysql://127.0.0.1:3306/super30";
		String string="insert into tblemployee values(102,'ajay','hyd',54548)";
		Class.forName(driver);
		
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con. createStatement();
		st.execute(string);
		
		System.out.println("Connecting with  mysql");


	}

}
