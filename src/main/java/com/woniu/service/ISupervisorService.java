package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Classes;

public interface ISupervisorService {

	Classes findOne(Integer cid);
	List<Classes> findAll();
	void save(Classes classess);
	void update(Classes classess);
	
	
}
