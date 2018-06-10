package edu.zut.cs.studentservice.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.studentservice.admin.domain.Goods;
import edu.zut.cs.studentservice.admin.service.GoodsManager;
import edu.zut.cs.studentservice.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/goods")
public class GoodsContorller extends GenericController<Goods, Long, GoodsManager>{
	GoodsManager goodsManager;
	@Autowired
	public void setCourseManager(GoodsManager goodsManager) {
		this.goodsManager=goodsManager;
		this.manager=this.goodsManager;
		
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/goods/index";
		return result;
	}

	

}
