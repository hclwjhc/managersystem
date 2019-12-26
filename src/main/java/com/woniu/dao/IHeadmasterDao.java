package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Headmaster;
import com.woniu.pojo.Teacher;

public interface IHeadmasterDao {

	Headmaster getHid(Integer hid);
	void save(Headmaster headmaster);
	List<Headmaster> findAll();
}
