package com.se17e.service;

import com.se17e.bean.User;
import com.se17e.dao.impl.LoginDaoImpl;
import com.se17e.dao.inter.LoginDaoInter;

public class LoginService {
	LoginDaoInter dao = new LoginDaoImpl();
	
	public User checkAdmin(User user) {
		User searchUser = (User) dao.getAdminObject(
				"SELECT * FROM admin WHERE IDnumber=? AND password=?", 
				new Object[]{user.getIDnumber(), user.getPassword()});
		
		return searchUser;
	}
	
	public User checkCustomer(User user) {
		User searchUser = (User) dao.getAdminObject(
				"SELECT * FROM customer WHERE IDnumber=? AND password=?",
				new Object[]{user.getIDnumber(), user.getPassword()});
		
		return searchUser;
	}
	
	public User checkReceptionist(User user) {
		User searchUser = (User) dao.getAdminObject(
				"SELECT * FROM receptionist WHERE IDnumber=? AND password=?", 
				new Object[]{user.getIDnumber(), user.getPassword()});
		
		return searchUser;
	}
	
}
