package com.woniu.dao.impl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ITeacherDao;
import com.woniu.pojo.Teacher;

@Repository
public class TeacherDaoImpl implements ITeacherDao {

	@Autowired
	SessionFactory sessionFactory;

	public Teacher getTid(Integer tid) {
		// TODO Auto-generated method stub
		return (Teacher) sessionFactory.getCurrentSession().get(Teacher.class, tid);
	}

	public void update(Teacher teacher) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("update Teacher teacher set teacher.tname=? where classes.cid=?").executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Teacher").list();
	}

	public Teacher findBySid(Integer sid) {
		// TODO Auto-generated method stub
		return (Teacher) sessionFactory.getCurrentSession().get(Teacher.class, sid);
	}

}
