package com.woniu.dao;


import java.util.List;

import com.woniu.pojo.Teacher;

public interface ITeacherDao {

	List<Teacher> findAll();
	Teacher getTid(Integer tid);
	void update(Teacher teacher);
	
}
