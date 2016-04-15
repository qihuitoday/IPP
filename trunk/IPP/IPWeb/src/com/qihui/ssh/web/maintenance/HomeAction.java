package com.qihui.ssh.web.maintenance;

import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.web.BaseAction;

@SuppressWarnings("serial")
public class HomeAction extends BaseAction {

	private IpEmployee ipEmploye = new IpEmployee();
	
	public String execute() throws Exception {
		ipEmploye = (IpEmployee)super.getSessionData("loginUser");
		return "success";
	}

	public IpEmployee getIpEmploye() {
		return ipEmploye;
	}

	public void setIpEmploye(IpEmployee ipEmploye) {
		this.ipEmploye = ipEmploye;
	}
}
