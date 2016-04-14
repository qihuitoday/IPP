package com.qihui.ssh.service.sys;

import com.qihui.ssh.dao.sys.SysDAO;

public class SysServiceImpl implements SysService {

	private SysDAO sysDAO;

	public SysDAO getSysDAO() {
		return sysDAO;
	}

	public void setSysDAO(SysDAO sysDAO) {
		this.sysDAO = sysDAO;
	}
}
