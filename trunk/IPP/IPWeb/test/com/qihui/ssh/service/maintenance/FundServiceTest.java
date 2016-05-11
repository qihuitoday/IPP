package com.qihui.ssh.service.maintenance;

import com.qihui.ssh.ContextTest;
import com.qihui.ssh.dao.entities.IpFund;
import com.qihui.ssh.service.user.UserService;

@SuppressWarnings("unused")
public class FundServiceTest extends ContextTest {

	private static FundService fundService;

	public void testAddFund() {
		FundService fundService = getService();
		IpFund ipFund = new IpFund();
		ipFund.setFundCode("11");
		ipFund.setFundName("22");
		ipFund.setProductCode("33");
		ipFund.setUwCode("44");
		Boolean flag = fundService.addFund(ipFund);
		if (flag) {
			System.out.println("Add IpFund successfully.");
		} else {
			System.out.println("Add IpFund fail.");
		}
	}

	public void testGetFundByID() {
		FundService fundService = getService();
		IpFund ipFund = fundService.getFundByID(1);
		if (ipFund != null) {
			System.out.println("getFundCode: " + ipFund.getFundCode() + " and getFundName: " + ipFund.getFundName());
		}
	}

	private FundService getService() {
		if (fundService == null) {
			return (FundService) applicationContext.getBean("fundService");
		} else {
			return fundService;
		}
	}
}
