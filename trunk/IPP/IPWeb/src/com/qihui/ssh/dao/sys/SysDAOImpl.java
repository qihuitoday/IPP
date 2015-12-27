package com.qihui.ssh.dao.sys;

import com.qihui.ssh.dao.BaseDAOImpl;
import com.qihui.ssh.dao.entities.IpEmployee;

public class SysDAOImpl extends BaseDAOImpl implements SysDAO {

	/**
	 * Add IpEmployee.
	 */
	public boolean addEmployee(IpEmployee ipEmployee) {
		this.createPOJO(ipEmployee);
		return true;
	}
	
}
