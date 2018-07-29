package com.test.j2eeweb;

public class UserValidationService {

	public boolean IsValidUser(String user, String password) {
		if(user.equals("tester") && password.contains("test")) {
			return true;
		}
		return false;
	}
}
