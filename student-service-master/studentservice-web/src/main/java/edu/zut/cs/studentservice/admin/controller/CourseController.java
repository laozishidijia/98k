package edu.zut.cs.studentservice.admin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.studentservice.admin.domain.Course;
import edu.zut.cs.studentservice.admin.domain.Student;
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
	@RequestMapping("/showcourse")
	public String showCourse(Student student)
	{
		String speciality=student.getS_dept();
		//List<Course> results=this.courseManager.findBySpeciality(speciality);
		//System.out.println(results.size());
		Course course=this.courseManager.findByStudent_class(student.getS_class());
		System.out.println(course);
		return "/course/course";
	}
}
