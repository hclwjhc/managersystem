package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Headmaster;


public interface IHeadmasterService {

	List<Headmaster> findAll();
	Headmaster getHid(Integer hid);
	void save(Headmaster headmaster);
	
}
