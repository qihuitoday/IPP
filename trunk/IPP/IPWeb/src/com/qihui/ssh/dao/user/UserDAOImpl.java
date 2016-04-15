package com.qihui.ssh.dao.user;

import com.qihui.ssh.dao.BaseDAOImpl;
import com.qihui.ssh.dao.entities.IpEmployee;

public class UserDAOImpl extends BaseDAOImpl implements UserDAO {
	/**
	 * Add IpEmployee.
	 */
	public boolean addEmployee(IpEmployee ipEmployee) {
		this.createPOJO(ipEmployee);
		return true;
	}
}
