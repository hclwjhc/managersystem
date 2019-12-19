package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Student;

public interface IStudentDAO {
	List<Student> findAll();
}
