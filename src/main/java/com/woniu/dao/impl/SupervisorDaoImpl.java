package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ISupervisorDao;
import com.woniu.pojo.Classes;
@Repository
public class SupervisorDaoImpl implements ISupervisorDao{

	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Classes> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Classes").list();
	}

	public void save(Classes classess) {
		// TODO Auto-generated method stub
		
		sessionFactory.getCurrentSession().save(classess);
		
	}

	public void update(Classes classess) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(classess);
	}

	public Classes findOne(Integer cid) {
		// TODO Auto-generated method stub
		return (Classes) sessionFactory.getCurrentSession().get(Classes.class,cid);
	}

	
	
	
}
