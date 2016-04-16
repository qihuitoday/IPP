package com.qihui.ssh.service.user;

import java.util.List;

import com.qihui.ssh.dao.entities.IpEmployee;

public interface UserService {

	/**
	 * Add Employee.
	 * 
	 * @param ipEmployee
	 * @return
	 */
	public boolean addEmployee(IpEmployee ipEmployee);

	/**
	 * Get Employee by id.
	 * 
	 * @param id
	 * @return
	 */
	public IpEmployee getEmployeeByID(int id);

	/**
	 * Get Employee by mail.
	 * 
	 * @param mail
	 * @return
	 */
	public List<IpEmployee> getEmployeeByMail(String mail);
	
	/**
	 * Update Employee.
	 * 
	 * @param ipEmployee
	 * @return
	 */
	public boolean updateEmployee(IpEmployee ipEmployee);
}
