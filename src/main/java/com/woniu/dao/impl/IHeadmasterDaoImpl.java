package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IHeadmasterDao;
import com.woniu.pojo.Headmaster;
@Repository
public class IHeadmasterDaoImpl implements IHeadmasterDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public Headmaster getHid(Integer hid) {
		// TODO Auto-generated method stub
		return (Headmaster) sessionFactory.getCurrentSession().get(Headmaster.class, hid);
	}

	public void save(Headmaster headmaster) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(headmaster);
	}

	@SuppressWarnings("unchecked")
	public List<Headmaster> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Headmaster").list();
	}

}
