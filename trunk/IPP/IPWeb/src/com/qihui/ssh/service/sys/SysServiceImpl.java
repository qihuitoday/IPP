package com.qihui.ssh.service.sys;

import java.sql.Timestamp;

import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.dao.sys.SysDAO;

public class SysServiceImpl implements SysService {

	private SysDAO sysDAO;

	public boolean addEmployee(IpEmployee ipEmployee) {
		Timestamp createTime = new Timestamp(System.currentTimeMillis()); 
		ipEmployee.setCreateTime(createTime);
		return sysDAO.addEmployee(ipEmployee);
	}
	public SysDAO getSysDAO() {
		return sysDAO;
	}

	public void setSysDAO(SysDAO sysDAO) {
		this.sysDAO = sysDAO;
	}
}
