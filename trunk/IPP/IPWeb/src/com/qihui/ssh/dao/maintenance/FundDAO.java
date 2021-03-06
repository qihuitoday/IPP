package com.qihui.ssh.dao.maintenance;

import java.util.List;

import com.qihui.ssh.dao.entities.IpFund;

public interface FundDAO {
	
	public boolean addFund(IpFund ipFund);

	public IpFund getFundByID(int id);

	public List<IpFund> getFundByFundCode(String fundCode);
	
	public List<IpFund> getFundList(String fundCode, String fundName, String status);
	
	public boolean updateFund(IpFund ipFund);
}
