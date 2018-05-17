package edu.zut.cs.studentservice.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.studentservice.admin.dao.CourseDao;
import edu.zut.cs.studentservice.admin.domain.Course;
import edu.zut.cs.studentservice.admin.service.CourseManager;
import edu.zut.cs.studentservice.base.service.impl.GenericManagerImpl;
@Component
public class CourseManagerImpl extends GenericManagerImpl<Course, Long>implements CourseManager{
	CourseDao courseDao;
	@Autowired
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
		this.dao=this.courseDao;
	}
}
