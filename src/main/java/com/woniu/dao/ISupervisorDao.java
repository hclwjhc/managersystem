package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Classes;
import com.woniu.pojo.Student;

public interface ISupervisorDao {

	Classes findOne(Integer cid);
	List<Classes> findAll();
	void save(Classes classess);
	void update(Classes classess);
	Classes findTeaHeadByStage(Integer sid);
}
