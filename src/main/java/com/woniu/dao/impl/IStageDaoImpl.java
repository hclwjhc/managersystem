package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IStageDao;
import com.woniu.pojo.Stage;

@Repository
public class IStageDaoImpl implements IStageDao {

	@Autowired
	SessionFactory sessionFactory;

	public Stage getSid(Integer sid) {
		// TODO Auto-generated method stub
		return (Stage) sessionFactory.getCurrentSession().get(Stage.class, sid);
	}
	
	
	
}
