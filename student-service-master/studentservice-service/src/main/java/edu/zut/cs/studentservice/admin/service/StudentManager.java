package edu.zut.cs.studentservice.admin.service;


import java.util.List;

import edu.zut.cs.studentservice.admin.domain.Student;

import edu.zut.cs.studentservice.base.service.GenericManager;

public interface StudentManager extends GenericManager<Student, Long> {
	public List<Student> findByNames(String name);
}
