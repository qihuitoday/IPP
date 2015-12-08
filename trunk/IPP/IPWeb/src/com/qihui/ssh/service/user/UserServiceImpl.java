package com.qihui.ssh.service.user;

import com.qihui.ssh.dao.user.UserDAO;

public class UserServiceImpl implements UserService {

	UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
