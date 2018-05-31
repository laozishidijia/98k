package edu.zut.cs.studentservice.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.studentservice.admin.dao.CourseDao;
import edu.zut.cs.studentservice.admin.domain.Course;
import edu.zut.cs.studentservice.admin.service.CourseManager;
import edu.zut.cs.studentservice.base.service.impl.GenericManagerImpl;

@Component
public class CourseManagerImpl extends GenericManagerImpl<Course, Long> implements CourseManager {
	CourseDao courseDao;

	@Autowired
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
		this.dao = this.courseDao;
	}

	public CourseDao getCourseDao() {
		return courseDao;
	}

	@Override
	public List<Course> findBySpeciality(String speciality) {
		List<Course> results=this.courseDao.findBySpeciality(speciality);
		return results;
	}

	@Override
	public Course findByStudent_class(String student_class) {
		Course course=this.courseDao.findByStudent_class(student_class);
		return course;
	}
}
