package com.login_registration_project.model;

public interface DAOService {

	public void connectDb();
	public boolean validLogin(String username, String password);
	public int registerUser(String username, String email, String password);
	
}
