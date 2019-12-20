package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IStudentDAO;
import com.woniu.pojo.Student;
@Repository
public class StudentDAOImpl implements IStudentDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
	}
	@Override
	public Student findOne(Integer id) {
		// TODO Auto-generated method stub
		return (Student) sessionFactory.getCurrentSession().get(Student.class, id);
	}

}
