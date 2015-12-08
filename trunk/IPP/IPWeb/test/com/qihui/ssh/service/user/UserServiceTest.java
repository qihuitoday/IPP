package com.qihui.ssh.service.user;

import com.qihui.ssh.ContextTest;

@SuppressWarnings("unused")
public class UserServiceTest extends ContextTest {

	private static UserService userService;

	private UserService getService() {
		if (userService == null) {
			return (UserService) applicationContext.getBean("userService");
		} else {
			return userService;
		}
	}
}
