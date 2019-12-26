package com.woniu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ITeacherDao;
import com.woniu.pojo.Teacher;
import com.woniu.service.ITeacherService;
@Service
@Transactional
public class ITeacherServiceImpl implements ITeacherService {

	@Autowired
	ITeacherDao td;
	
	public Teacher getTid(Integer tid) {
		// TODO Auto-generated method stub
		return td.getTid(tid);
	}

	public void update(Teacher teacher) {
		// TODO Auto-generated method stub
		td.update(teacher);;
	}

	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return td.findAll();
	}

	
}
