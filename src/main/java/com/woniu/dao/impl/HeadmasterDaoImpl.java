package com.woniu.dao.impl;

import java.util.List;

import org.apache.struts2.components.Head;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IHeadmasterDao;
import com.woniu.pojo.Headmaster;
@Repository
public class HeadmasterDaoImpl implements IHeadmasterDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public Headmaster getHid(Integer hid) {
		// TODO Auto-generated method stub
		return (Headmaster) sessionFactory.getCurrentSession().get(Headmaster.class, hid);
	}

	@SuppressWarnings("unchecked")
	public List<Headmaster> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Headmaster").list();
	}

	public void update(Integer hid) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(hid);
	}

	public Headmaster findHBySid(Integer sid) {
		// TODO Auto-generated method stub
		return (Headmaster) sessionFactory.getCurrentSession().get(Headmaster.class, sid);
	}

	public Headmaster getHds(Integer hid) {
		// TODO Auto-generated method stub
		return (Headmaster) sessionFactory.openSession().get(Headmaster.class, hid);
	}


}
