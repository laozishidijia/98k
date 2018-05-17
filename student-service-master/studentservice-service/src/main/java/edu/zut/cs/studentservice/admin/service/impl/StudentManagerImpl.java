package edu.zut.cs.studentservice.admin.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.studentservice.admin.dao.StudentDao;
import edu.zut.cs.studentservice.admin.domain.Student;
import edu.zut.cs.studentservice.admin.service.StudentManager;
import edu.zut.cs.studentservice.base.service.impl.GenericManagerImpl;

@Component
public class StudentManagerImpl extends GenericManagerImpl<Student, Long>implements StudentManager{
	StudentDao studentDao;
	@Autowired
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
		this.dao = this.studentDao;
	}
	
}
