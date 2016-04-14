package com.qihui.ssh.service.user;

import com.qihui.ssh.ContextTest;
import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.service.sys.SysService;

@SuppressWarnings("unused")
public class UserServiceTest extends ContextTest {

	private static UserService userService;
	
	public void testAddIpEmployee() {
		UserService userService = getService();
		IpEmployee ipEmployee = new IpEmployee();
		ipEmployee.setEmployeeName("Derek");
		ipEmployee.setPassword("123");
		Boolean flag = userService.addEmployee(ipEmployee);
		if (flag) {
			System.out.println("Add IpEmployee successfully.");
		} else {
			System.out.println("Add IpEmployee fail.");
		}
	}

	private UserService getService() {
		if (userService == null) {
			return (UserService) applicationContext.getBean("userService");
		} else {
			return userService;
		}
	}
}
