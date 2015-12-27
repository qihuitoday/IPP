package com.qihui.ssh.web.sys;

import com.qihui.ssh.service.user.UserService;
import com.qihui.ssh.web.BaseAction;

@SuppressWarnings("serial")
public class LoginAction extends BaseAction {

	private String userName;
	private String password;

	UserService userService;

	public String execute() throws Exception {

		return "success";
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}