package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Classes;

public interface ISupervisorDao {

	List<Classes> findAll();
	void save(Classes classess);
	void update(Classes classess);
	
}
