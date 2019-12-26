package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IStudentDAO;
import com.woniu.pojo.Student;
import com.woniu.service.IStudentService;

/*<<<<<<< HEAD=======>>>>>>> branch 'master' of https://github.com/birdprogrammer/mangerSys.git
*/

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
	@Autowired
	IStudentDAO sd;

	
	public List<Student> findAll() {
		List<Student> stu = sd.findAll();
		return stu;
	}

}
