package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Student;

/*<<<<<<< HEAD=======>>>>>>> branch 'master' of https://github.com/birdprogrammer/mangerSys.git
*/

public interface IStudentService {
	List<Student> findAll();
	Student findOne(Integer id);
	void upd(Student student);
	void save(Student student);
}
