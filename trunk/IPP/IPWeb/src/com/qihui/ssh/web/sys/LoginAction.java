package com.qihui.ssh.web.sys;

import java.util.List;

import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.service.user.UserService;
import com.qihui.ssh.web.BaseAction;

@SuppressWarnings("serial")
public class LoginAction extends BaseAction {

	private String mail;
	private String password;

	UserService userService;

	public String execute() throws Exception {

		List<IpEmployee> listEmployee = userService.getEmployeeByMail(mail);
		if (listEmployee.size() > 0) {
			IpEmployee employee = listEmployee.get(0);
			String pwd = employee.getPassword();
			super.setSessionData("loginUser", employee);
			super.addCookie("mail", mail);
			if (password.equals(pwd)) {
				return "success";
			}
		}
		return "fail";
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
