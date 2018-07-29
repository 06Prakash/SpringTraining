package com.test.j2eeweb;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {

	public boolean IsValidUser(String user, String password) {
		if(user.equals("Chandra Prakash V") && password.contains("Deepa N")) {
			return true;
		}
		return false;
	}
}
