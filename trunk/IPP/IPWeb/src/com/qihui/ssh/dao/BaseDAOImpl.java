package com.qihui.ssh.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qihui.ssh.dao.entities.BasePOJO;

@SuppressWarnings("rawtypes")
public class BaseDAOImpl extends HibernateDaoSupport implements BaseDAO {

	public BasePOJO createPOJO(BasePOJO basePOJO) {
		this.getHibernateTemplate().save(basePOJO);
		return basePOJO;
	}

	public void updatePOJO(BasePOJO basePOJO) {
		this.getHibernateTemplate().update(basePOJO);
	}

	public void mergePOJO(BasePOJO basePOJO) {
		this.getHibernateTemplate().merge(basePOJO);
	}

	public void deletePOJO(Class c, Serializable id) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().load(c, id));
	}

	public void deletePOJO(BasePOJO basePOJO) {
		this.getHibernateTemplate().delete(basePOJO);
	}

	public void deleteAllPOJO(Collection entities) {
		this.getHibernateTemplate().deleteAll(entities);
	}

	public BasePOJO loadPOJO(Class c, Serializable id) {
		return (BasePOJO) this.getHibernateTemplate().load(c, id);
	}

	public BasePOJO getPOJO(Class c, Serializable id) {
		return (BasePOJO) this.getHibernateTemplate().get(c, id);
	}

	public List loadAllPOJO(Class c) {
		return this.getHibernateTemplate().loadAll(c);
	}

	public void saveOrUpdateAllPOJO(Collection pojos) {
		this.getHibernateTemplate().saveOrUpdateAll(pojos);

	}

	public void saveOrUpdatePOJO(BasePOJO basePOJO) {
		this.getHibernateTemplate().saveOrUpdate(basePOJO);
	}

	public Serializable savePOJO(BasePOJO basePOJO) {
		return this.getHibernateTemplate().save(basePOJO);
	}
}
