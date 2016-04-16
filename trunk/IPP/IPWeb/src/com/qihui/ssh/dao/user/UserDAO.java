package com.qihui.ssh.dao.user;

import java.util.List;

import com.qihui.ssh.dao.BaseDAO;
import com.qihui.ssh.dao.entities.IpEmployee;

public interface UserDAO extends BaseDAO {

	public boolean addEmployee(IpEmployee ipEmployee);

	public IpEmployee getEmployeeByID(int id);

	public List<IpEmployee> getEmployeeByMail(String mail);
	
	public boolean updateEmployee(IpEmployee ipEmployee);
}
