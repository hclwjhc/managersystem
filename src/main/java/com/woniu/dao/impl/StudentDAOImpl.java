package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IStudentDAO;
import com.woniu.pojo.Student;

/*<<<<<<< HEAD=======>>>>>>> branch 'master' of https://github.com/birdprogrammer/mangerSys.git
*/	
@Repository
public class StudentDAOImpl implements IStudentDAO {
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Student").list();

	}
	
	public Student findOne(Integer id) {
		// TODO Auto-generated method stub
		return (Student) sessionFactory.getCurrentSession().get(Student.class, id);

	}

	public void upd(Student student) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(student);

	}

	public void save(Student student) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(student);

	}

}
