package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Examrecord;
import com.woniu.service.IExamrecordService;

@Controller
public class ExamrecordAction {
	@Autowired
	IExamrecordService es;
	private Integer erid;
	private  Examrecord  exam;
	
	public Integer getErid() {
		return erid;
	}

	public void setErid(Integer erid) {
		this.erid = erid;
	}

	public Examrecord getExam() {
		return exam;
	}

	public void setExam(Examrecord exam) {
		this.exam = exam;
	}

	public String findOneExam() {
		System.out.println(erid);
		exam = es.findOneExam(erid);
		return "success";
	}
}
