package com.qihui.ssh.web.maintenance;

import java.util.ArrayList;
import java.util.List;

import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.dao.entities.IpFund;
import com.qihui.ssh.service.maintenance.FundService;
import com.qihui.ssh.web.BaseAction;

@SuppressWarnings("serial")
public class FundAction extends BaseAction {

	private String actionFlag;
	private String id;
	private String fundCode;
	private String fundName;
	private String status;

	private IpFund objIpFund;

	List<IpFund> fundList = new ArrayList<IpFund>();

	private FundService fundService;

	public String execute() throws Exception {

		if (actionFlag != null && "add".equalsIgnoreCase(actionFlag)) {
			IpEmployee loinUser = (IpEmployee) super.getSessionData("loginUser");
			objIpFund.setMakerID(loinUser.getMail());
			fundService.addFund(objIpFund);
			return "addDoneSuccess";
		} else if (actionFlag != null && "view".equalsIgnoreCase(actionFlag)) {
			objIpFund = fundService.getFundByID(Integer.valueOf(id).intValue());
			return "viewSuccess";
		} else if (actionFlag != null && "modify".equalsIgnoreCase(actionFlag)) {
			objIpFund = fundService.getFundByID(Integer.valueOf(id).intValue());
			return "modifySuccess";
		} else if (actionFlag != null && "modifyDone".equalsIgnoreCase(actionFlag)) {
			fundService.updateFund(objIpFund);
			return "modifyDoneSuccess";
		} else {
			fundList = fundService.getFundList(fundCode, fundName, status);
			return "listSuccess";
		}

	}

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public FundService getFundService() {
		return fundService;
	}

	public void setFundService(FundService fundService) {
		this.fundService = fundService;
	}

	public List<IpFund> getFundList() {
		return fundList;
	}

	public void setFundList(List<IpFund> fundList) {
		this.fundList = fundList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public IpFund getObjIpFund() {
		return objIpFund;
	}

	public void setObjIpFund(IpFund objIpFund) {
		this.objIpFund = objIpFund;
	}

	public String getActionFlag() {
		return actionFlag;
	}

	public void setActionFlag(String actionFlag) {
		this.actionFlag = actionFlag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
