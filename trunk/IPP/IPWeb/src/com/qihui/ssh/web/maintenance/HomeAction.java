package com.qihui.ssh.web.maintenance;

import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.web.BaseAction;

@SuppressWarnings("serial")
public class HomeAction extends BaseAction {

	private IpEmployee ipEmployee = new IpEmployee();

	public String execute() throws Exception {
		ipEmployee = (IpEmployee) super.getSessionData("loginUser");
		return "success";
	}

	public IpEmployee getIpEmployee() {
		return ipEmployee;
	}

	public void setIpEmployee(IpEmployee ipEmployee) {
		this.ipEmployee = ipEmployee;
	}

}
