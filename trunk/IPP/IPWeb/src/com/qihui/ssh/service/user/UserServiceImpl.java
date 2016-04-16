package com.qihui.ssh.service.user;

import java.sql.Timestamp;
import java.util.List;

import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.dao.user.UserDAO;

public class UserServiceImpl implements UserService {

	UserDAO userDAO;
	
	public boolean addEmployee(IpEmployee ipEmployee) {
		Timestamp createTime = new Timestamp(System.currentTimeMillis()); 
		ipEmployee.setCreateTime(createTime);
		return userDAO.addEmployee(ipEmployee);
	}
	
	public IpEmployee getEmployeeByID(int id){
		return userDAO.getEmployeeByID(id);
	}
	
	public List<IpEmployee> getEmployeeByMail(String mail){
		return userDAO.getEmployeeByMail(mail);
	}
	
	public boolean updateEmployee(IpEmployee ipEmployee){
		return userDAO.updateEmployee(ipEmployee);
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
