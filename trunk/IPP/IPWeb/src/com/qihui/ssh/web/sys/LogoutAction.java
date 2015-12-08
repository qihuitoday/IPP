package com.qihui.ssh.web.sys;

import com.qihui.ssh.web.BaseAction;

@SuppressWarnings("serial")
public class LogoutAction extends BaseAction {

	public String execute() throws Exception {
		super.emptySession();
		super.removeCookie("name");
		return "success";
	}
}
