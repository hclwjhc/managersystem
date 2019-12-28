package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Student;

public interface IStudentDAO {
	List<Student> findAll();
	Student findOne(Integer id);
	void upd(Student student);
	void save(Student student);
}
