package edu.zut.cs.studentservice.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.zut.cs.studentservice.admin.domain.Infomation;

import edu.zut.cs.studentservice.admin.service.InfomationManager;
import edu.zut.cs.studentservice.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/infomation")
public class InfomationController extends GenericController<Infomation,Long,InfomationManager>{
	InfomationManager infomationManager;
	@Autowired
	public void setInfomationManager(InfomationManager infomationManager) {
		this.infomationManager = infomationManager;
		this.manager=this.infomationManager;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result ="/infomation/index";
		
		return result;
	}
}
