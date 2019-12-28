package com.woniu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.IStageDao;
import com.woniu.pojo.Stage;
import com.woniu.pojo.Teacher;
import com.woniu.service.IStageService;

@Service
@Transactional
public class StageServiceImpl implements IStageService {

	@Autowired
	IStageDao sd;

	public Stage getSid(Integer sid) {
		// TODO Auto-generated method stub
		return sd.getSid(sid);
	}


	
	

}
