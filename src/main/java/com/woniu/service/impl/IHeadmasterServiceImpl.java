package com.woniu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.IHeadmasterDao;
import com.woniu.pojo.Headmaster;
import com.woniu.pojo.Teacher;
import com.woniu.service.IHeadmasterService;
@Service
@Transactional
public class IHeadmasterServiceImpl implements IHeadmasterService {

	@Autowired
	IHeadmasterDao hd;

	public Headmaster getHid(Integer hid) {
		// TODO Auto-generated method stub
		return hd.getHid(hid);
	}

	public void save(Headmaster headmaster) {
		// TODO Auto-generated method stub
		hd.save(headmaster);
	}

	public List<Headmaster> findAll() {
		// TODO Auto-generated method stub
		return hd.findAll();
	}
	
	
	
}
