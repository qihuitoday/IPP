package com.qihui.ssh.dao.user;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.qihui.ssh.dao.BaseDAOImpl;
import com.qihui.ssh.dao.entities.IpEmployee;

@SuppressWarnings("unchecked")
public class UserDAOImpl extends BaseDAOImpl implements UserDAO {

	public boolean addEmployee(IpEmployee ipEmployee) {
		this.createPOJO(ipEmployee);
		return true;
	}
	
	public IpEmployee getEmployeeByID(int id){
		IpEmployee ipEmployee = (IpEmployee)this.getPOJO(IpEmployee.class, id);
		return ipEmployee;
	}
	
	public List<IpEmployee> getEmployeeByMail(String mail){
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(IpEmployee.class);
		detachedCriteria.add(Restrictions.eq("mail", mail));
		return getHibernateTemplate().findByCriteria(detachedCriteria);
	}
	
	public boolean updateEmployee(IpEmployee ipEmployee){
		this.updatePOJO(ipEmployee);
		return true;
	}
	
	/*public List<Novel> getAllNovel() {
		String hql = "from Novel order by id";
		List<Novel> list = this.getHibernateTemplate().find(hql);
		return list;
	}

	public List<Novel> getNovelByID(Integer novelID) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Novel.class);
		detachedCriteria.add(Restrictions.eq("id", novelID));
		return getHibernateTemplate().findByCriteria(detachedCriteria);
	}

	public Novelchapter getNovelChapterByNovelChapterID(Integer novelID, Integer chapterID) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Novelchapter.class);
		detachedCriteria.add(Restrictions.eq("novel.id", novelID));
		detachedCriteria.add(Restrictions.eq("chapterId", chapterID));
		List<Novelchapter> novelChapterList = getHibernateTemplate().findByCriteria(detachedCriteria);
		if (novelChapterList.size() > 0) {
			return (Novelchapter) novelChapterList.get(0);
		}
		return null;
	}

	public List<Novelchapter> getNovelChapterByNovelID(Integer novelID) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Novelchapter.class);
		detachedCriteria.add(Restrictions.eq("novel.id", novelID));
		return getHibernateTemplate().findByCriteria(detachedCriteria);
	}

	public List<Novelchapter> getNovelChapterStartByNovelID(Integer novelID) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Novelchapter.class);
		detachedCriteria.add(Restrictions.eq("novel.id", novelID));
		detachedCriteria.add(Restrictions.eq("codedvalue.id", Constants.NOVEL_LEVEL_START));
		return getHibernateTemplate().findByCriteria(detachedCriteria);
	}

	public List<Novelchapter> getNovelChapterMainBodyByNovelID(Integer novelID) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Novelchapter.class);
		detachedCriteria.add(Restrictions.eq("novel.id", novelID));
		detachedCriteria.add(Restrictions.eq("codedvalue.id", Constants.NOVEL_LEVEL_MAIN_BODY));
		return getHibernateTemplate().findByCriteria(detachedCriteria);
	}

	public List<Novelchapter> getNovelChapterEndByNovelID(Integer novelID) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Novelchapter.class);
		detachedCriteria.add(Restrictions.eq("novel.id", novelID));
		detachedCriteria.add(Restrictions.eq("codedvalue.id", Constants.NOVEL_LEVEL_END));
		return getHibernateTemplate().findByCriteria(detachedCriteria);
	}*/
}
