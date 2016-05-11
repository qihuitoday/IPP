package com.qihui.ssh.service.maintenance;

import java.util.List;

import com.qihui.ssh.dao.entities.IpFund;
import com.qihui.ssh.dao.maintenance.FundDAO;

public class FundServiceImpl implements FundService {

	FundDAO fundDAO;

	@Override
	public boolean addFund(IpFund ipFund) {
		return fundDAO.addFund(ipFund);
	}

	@Override
	public IpFund getFundByID(int id) {
		return fundDAO.getFundByID(id);
	}

	@Override
	public List<IpFund> getFundByFundCode(String fundCode) {
		return fundDAO.getFundByFundCode(fundCode);
	}

	@Override
	public boolean updateFund(IpFund ipFund) {
		return fundDAO.updateFund(ipFund);
	}

	public FundDAO getFundDAO() {
		return fundDAO;
	}

	public void setFundDAO(FundDAO fundDAO) {
		this.fundDAO = fundDAO;
	}

}