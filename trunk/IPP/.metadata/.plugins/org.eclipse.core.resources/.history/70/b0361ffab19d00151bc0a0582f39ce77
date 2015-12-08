package com.qihui.ssh.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.qihui.ssh.dao.entities.BasePOJO;

@SuppressWarnings("rawtypes")
public interface BaseDAO {

	BasePOJO createPOJO(BasePOJO basePOJO);

	void updatePOJO(BasePOJO basePOJO);

	void mergePOJO(BasePOJO basePOJO);

	void deletePOJO(Class c, Serializable id);

	void deletePOJO(BasePOJO basePOJO);

	public void deleteAllPOJO(Collection entities);

	BasePOJO loadPOJO(Class c, Serializable id);

	BasePOJO getPOJO(Class c, Serializable id);

	List loadAllPOJO(Class c);

	void saveOrUpdateAllPOJO(Collection pojos);

	void saveOrUpdatePOJO(BasePOJO basePOJO);

	public Serializable savePOJO(BasePOJO basePOJO);
}
