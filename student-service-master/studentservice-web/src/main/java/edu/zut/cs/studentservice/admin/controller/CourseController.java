package edu.zut.cs.studentservice.admin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.studentservice.admin.domain.Course;
import edu.zut.cs.studentservice.admin.service.CourseManager;
import edu.zut.cs.studentservice.base.web.spring.controller.GenericController;
@Controller
@RequestMapping("/course")
public class CourseController extends GenericController<Course,Long,CourseManager> {
	CourseManager courseManager;
	@Autowired
	public void setCourseManager(CourseManager courseManager) {
		this.courseManager = courseManager;
		this.manager=this.courseManager;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/course/index";
		return result;
	}
}
