package com.qihui.ssh.service.user;

import java.sql.Timestamp;

import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.dao.user.UserDAO;

public class UserServiceImpl implements UserService {

	UserDAO userDAO;
	
	public boolean addEmployee(IpEmployee ipEmployee) {
		Timestamp createTime = new Timestamp(System.currentTimeMillis()); 
		ipEmployee.setCreateTime(createTime);
		return userDAO.addEmployee(ipEmployee);
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
