package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Classes;
import com.woniu.pojo.Headmaster;
import com.woniu.service.IHeadmasterService;
import com.woniu.service.ISupervisorService;

@Controller
public class HeadmasterAction {

	@Autowired
	IHeadmasterService hs;
	@Autowired
	ISupervisorService sups;
	private Headmaster headmaster;
	private List<Headmaster> headmasters;
	private Integer hid;
	private Classes classess;


	public Classes getClassess() {
		return classess;
	}

	public void setClassess(Classes classess) {
		this.classess = classess;
	}

	public List<Headmaster> getHeadmasters() {
		return headmasters;
	}

	public void setHeadmasters(List<Headmaster> headmasters) {
		this.headmasters = headmasters;
	}

	public Headmaster getHeadmaster() {
		return headmaster;
	}

	public void setHeadmaster(Headmaster headmaster) {
		this.headmaster = headmaster;
	}

	public Integer getHid() {
		return hid;
	}


	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public String headmasterFindAll() {

		headmasters = hs.findAll();

		return "showHeadmaster";
	}

	public String headmasterPosition() { 
		Integer cid_= classess.getCid();
		Integer hid_ = headmaster.getHid();
		//		System.out.println("cid_="+cid_+"      hid_="+hid_);
		headmaster.setHid(hid_);
		Classes classes = sups.findOne(cid_);
		//		  System.out.println(classes);
		classes.setHeadmaster(headmaster);
		sups.update(classes);
		return	"headmasterUpdate"; 
	}
}
