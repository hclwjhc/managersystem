package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Classes;

public interface ISupervisorService {

	List<Classes> findAll();
	void save(Classes classess);
	void update(Classes classess);
	
	
}
