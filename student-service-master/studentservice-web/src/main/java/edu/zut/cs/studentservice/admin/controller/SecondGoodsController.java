package edu.zut.cs.studentservice.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.studentservice.admin.domain.SecondGoods;
import edu.zut.cs.studentservice.admin.service.SecondGoodsManager;
import edu.zut.cs.studentservice.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/secondgoods")
public class SecondGoodsController extends GenericController<SecondGoods,Long,SecondGoodsManager>{
	SecondGoodsManager secondgoodsmanager;
	@Autowired
	public void setsecondgoodsMan(SecondGoodsManager seconsecondgoodsmanager)
	{
		this.secondgoodsmanager=seconsecondgoodsmanager;
		this.manager=this.secondgoodsmanager;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index()
	{
		String result="/secondgoods/index";
		return result;
	}

	
}
