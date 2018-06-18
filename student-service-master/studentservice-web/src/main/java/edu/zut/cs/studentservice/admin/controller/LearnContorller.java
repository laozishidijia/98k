package edu.zut.cs.studentservice.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.studentservice.admin.domain.Learn;
import edu.zut.cs.studentservice.admin.service.LearnManager;
import edu.zut.cs.studentservice.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/learn")
/**
 * 建立四六级信息映射关系
 * */
public class LearnContorller extends GenericController<Learn, Long, LearnManager>{
	LearnManager learnManager;
	@Autowired
	public void setCourseManager(LearnManager learnManager) {
		this.learnManager=learnManager;
		this.manager=this.learnManager;
		
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/learn/index";
		return result;
	}

	

}
