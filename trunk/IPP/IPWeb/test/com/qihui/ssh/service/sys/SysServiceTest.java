package com.qihui.ssh.service.sys;

import com.qihui.ssh.ContextTest;
import com.qihui.ssh.dao.entities.IpEmployee;

public class SysServiceTest extends ContextTest {

	private static SysService sysService;

	public void testAddIpEmployee() {
		SysService sysService = getService();
		IpEmployee ipEmployee = new IpEmployee();
		ipEmployee.setEmployeeName("Derek");
		Boolean flag = sysService.addEmployee(ipEmployee);
		if (flag) {
			System.out.println("Add IpEmployee successfully.");
		} else {
			System.out.println("Add IpEmployee fail.");
		}
	}

	private SysService getService() {
		if (sysService == null) {
			return (SysService) applicationContext.getBean("sysService");
		} else {
			return sysService;
		}
	}
}
