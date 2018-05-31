package edu.zut.cs.studentservice.admin.service;

import java.util.List;

import edu.zut.cs.studentservice.admin.domain.Course;
import edu.zut.cs.studentservice.base.service.GenericManager;

public interface CourseManager extends GenericManager<Course, Long>{
	public  List<Course> findBySpeciality(String speciality);

	public Course findByStudent_class(String student_class);
}
