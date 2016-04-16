package com.qihui.ssh.service.user;

import java.util.List;

import com.qihui.ssh.ContextTest;
import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.service.sys.SysService;

@SuppressWarnings("unused")
public class UserServiceTest extends ContextTest {

	private static UserService userService;

	/*
	 * public void testAddEmployee() { UserService userService = getService();
	 * IpEmployee ipEmployee = new IpEmployee();
	 * ipEmployee.setMail("Derek@126.com"); ipEmployee.setEmployeeName("Derek");
	 * ipEmployee.setPassword("123"); Boolean flag =
	 * userService.addEmployee(ipEmployee); if (flag) { System.out.println(
	 * "Add IpEmployee successfully."); } else { System.out.println(
	 * "Add IpEmployee fail."); } }
	 */

	public void testGetEmployeeByID() {
		UserService userService = getService();
		IpEmployee ipEmployee = userService.getEmployeeByID(11);
		if (ipEmployee != null) {
			System.out.println("Mail: " + ipEmployee.getMail() + " and Password: " + ipEmployee.getPassword());
		}
	}

	public void testGetEmployeeByMail() {
		UserService userService = getService();
		List<IpEmployee> listEmployee = userService.getEmployeeByMail("11111");
		if (listEmployee != null) {
			System.out.println("Size is: " + listEmployee.size());
		}
	}

	public void testUpdateEmployee() {
		UserService userService = getService();
		IpEmployee ipEmployee = userService.getEmployeeByID(10);
		if (ipEmployee != null) {
			ipEmployee.setAddress("shi er hao");
			ipEmployee.setMobileNumber("1234567789");
			boolean updateFlag = userService.updateEmployee(ipEmployee);
			if (updateFlag) {
				System.out.println("Update successfully!");
			} else {
				System.out.println("Update fail!");
			}
		} else {
			System.out.println("Employee is null.");
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
