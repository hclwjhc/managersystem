package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Teacher;

public interface ITeacherService {

	List<Teacher> findAll();
	Teacher getTid(Integer tid);
	void update(Teacher teacher);
	Teacher findBySid(Integer sid);
	
}
