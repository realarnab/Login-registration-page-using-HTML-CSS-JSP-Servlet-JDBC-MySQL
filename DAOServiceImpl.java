package com.login_registration_project.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {

	Connection con;
	Statement smt;
	
	@Override
	public void connectDb() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectDb","root","Arnabmondal@7");
		smt=con.createStatement();
	} catch (Exception e) {
		e.printStackTrace();
	}	
		
	}

	@Override
	public boolean validLogin(String username, String password) {
		try {
			ResultSet status = smt.executeQuery("select * from registration where name='"+username+"' and password='"+password+"'");
			return status.next();
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public int registerUser(String username, String email, String password) {
		try {
			int update = smt.executeUpdate("insert into registration values('"+username+"','"+email+"','"+password+"')");
			return update;
		} catch (Exception e) {
			return 0;
		}
		
	}

	
}
