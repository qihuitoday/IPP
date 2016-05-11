package com.qihui.ssh.web.maintenance;

import java.util.ArrayList;
import java.util.List;

import com.qihui.ssh.dao.entities.IpFund;
import com.qihui.ssh.service.maintenance.FundService;
import com.qihui.ssh.web.BaseAction;

@SuppressWarnings("serial")
public class FundAction extends BaseAction {

	private String fundCode;
	private String fundName;
	private String status;
	List<IpFund> fundList = new ArrayList<IpFund>();

	private FundService fundService;

	public String execute() throws Exception {

		fundList = fundService.getFundList(fundCode, fundName, status);
		System.out.println(fundList.size());
		return "listSuccess";
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

}
