package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Classes;
import com.woniu.pojo.Headmaster;
import com.woniu.service.IHeadmasterService;

@Controller
public class HeadmasterAction {

	@Autowired
	IHeadmasterService hs;
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


//	public String supervisorHeadmasterFindOne() {
//		headmaster = hs.getHid(hid);
//		return "supervisorHeadmasterFindOne";
//	}

	public String headmasterFindAll() {
		
		headmasters = hs.findAll();
		
		return "showHeadmaster";
	}
	
	public String headmasterPosition() { 
	
//		hs.save(headmaster);
		return	"headmasterUpdate"; 
		}
}
