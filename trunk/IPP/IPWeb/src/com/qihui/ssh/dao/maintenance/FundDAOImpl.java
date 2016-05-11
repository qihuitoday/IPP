package com.qihui.ssh.dao.maintenance;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.qihui.ssh.dao.BaseDAOImpl;
import com.qihui.ssh.dao.entities.IpFund;

@SuppressWarnings("unchecked")
public class FundDAOImpl extends BaseDAOImpl implements FundDAO {

	public boolean addFund(IpFund ipFund) {
		this.createPOJO(ipFund);
		return true;
	}

	public IpFund getFundByID(int id) {
		IpFund ipFund = (IpFund) this.getPOJO(IpFund.class, id);
		return ipFund;
	}

	public boolean updateFund(IpFund ipFund) {
		this.updatePOJO(ipFund);
		return true;
	}

	public List<IpFund> getFundByFundCode(String fundCode) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(IpFund.class);
		detachedCriteria.add(Restrictions.eq("fundCode", fundCode));
		return getHibernateTemplate().findByCriteria(detachedCriteria);
	}
}
