package com.woniu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ISupervisorDao;
import com.woniu.pojo.Classes;
import com.woniu.service.ISupervisorService;
@Repository
@Transactional
public class SupervisorServiceImpl implements ISupervisorService {

	@Autowired
	ISupervisorDao sd;

	public List<Classes> findAll() {
		// TODO Auto-generated method stub
		List<Classes> classes = sd.findAll();
		return classes;
	}

	public void save(Classes classess) {
		// TODO Auto-generated method stub
		sd.save(classess);
	}

	public void update(Classes classess) {
		// TODO Auto-generated method stub
		sd.update(classess);
	}

	public Classes findOne(Integer cid) {
		// TODO Auto-generated method stub
		return sd.findOne(cid);
	}

	public Classes findTeaHeadByStage(Integer sid) {
		// TODO Auto-generated method stub
		return sd.findTeaHeadByStage(sid);
	}


	
	
}
