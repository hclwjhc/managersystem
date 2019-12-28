package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Headmaster;


public interface IHeadmasterDao {

	Headmaster getHid(Integer hid);
	void update(Integer hid);
	List<Headmaster> findAll();
	Headmaster findHBySid(Integer sid);
	Headmaster getHds(Integer hid);

}
