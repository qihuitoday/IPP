package com.qihui.ssh.web.maintenance;

import com.qihui.ssh.web.BaseAction;

@SuppressWarnings("serial")
public class FundUIAction extends BaseAction {

	private String actionFlag;

	public String execute() throws Exception {
		if (actionFlag != null && "add".equalsIgnoreCase(actionFlag)) {
			return "addSuccess";
		} else {
			return "listSuccess";
		}
	}

	public String getActionFlag() {
		return actionFlag;
	}

	public void setActionFlag(String actionFlag) {
		this.actionFlag = actionFlag;
	}

}
