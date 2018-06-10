package edu.zut.cs.studentservice.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.studentservice.admin.domain.Administrator;
import edu.zut.cs.studentservice.admin.service.AdministratorManager;
import edu.zut.cs.studentservice.base.web.spring.controller.GenericController;
@Controller
@RequestMapping("/administrator")
public class AdministratorController extends GenericController<Administrator,Long,AdministratorManager>{
	
	AdministratorManager administratorManager;
	@Autowired
	public void setAdministratorManager(AdministratorManager administratorManager) {
		this.administratorManager = administratorManager;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index()
	{
		String result = "/administrator/index";
		return result;
	}
	
}
