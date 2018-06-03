package edu.zut.cs.studentservice.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.studentservice.admin.domain.Student;
import edu.zut.cs.studentservice.admin.service.StudentManager;
import edu.zut.cs.studentservice.base.web.spring.controller.GenericController;
@Controller
@RequestMapping("/student")
public class StudentController extends GenericController<Student,Long,StudentManager>{
	StudentManager studentManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/student/index";
		return result;
	}
	@Autowired
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
		this.manager =this.studentManager;
	}
}
