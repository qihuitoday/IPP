package com.qihui.ssh.service.maintenance;

import java.sql.Timestamp;
import java.util.List;

import com.qihui.ssh.dao.entities.IpFund;
import com.qihui.ssh.dao.maintenance.FundDAO;

public class FundServiceImpl implements FundService {

	private FundDAO fundDAO;

	@Override
	public boolean addFund(IpFund ipFund) {
		Timestamp createTime = new Timestamp(System.currentTimeMillis());
		ipFund.setMakerTS(createTime);
		ipFund.setLastModifiedTS(createTime);
		return fundDAO.addFund(ipFund);
	}

	@Override
	public boolean updateFund(IpFund ipFund) {
		IpFund tempFund = fundDAO.getFundByID(ipFund.getId());
		tempFund.setFundName(ipFund.getFundName());
		tempFund.setLocalName(ipFund.getLocalName());
		tempFund.setCurrencyCode(ipFund.getCurrencyCode());
		tempFund.setRiskLevel(ipFund.getRiskLevel());
		tempFund.setStartDate(ipFund.getStartDate());
		tempFund.setEndDate(ipFund.getEndDate());
		tempFund.setStatus(ipFund.getStatus());
		tempFund.setLastModifiedTS(new Timestamp(System.currentTimeMillis()));
		return fundDAO.updateFund(tempFund);
	}

	@Override
	public IpFund getFundByID(int id) {
		return fundDAO.getFundByID(id);
	}

	@Override
	public List<IpFund> getFundByFundCode(String fundCode) {
		return fundDAO.getFundByFundCode(fundCode);
	}

	public FundDAO getFundDAO() {
		return fundDAO;
	}

	public void setFundDAO(FundDAO fundDAO) {
		this.fundDAO = fundDAO;
	}

	@Override
	public List<IpFund> getFundList(String fundCode, String fundName, String status) {
		return fundDAO.getFundList(fundCode, fundName, status);
	}

}