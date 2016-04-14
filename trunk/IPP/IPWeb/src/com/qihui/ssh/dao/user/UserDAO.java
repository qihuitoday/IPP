package com.qihui.ssh.dao.user;

import com.qihui.ssh.dao.BaseDAO;
import com.qihui.ssh.dao.entities.IpEmployee;

public interface UserDAO extends BaseDAO {
	public boolean addEmployee(IpEmployee ipEmployee);
}
