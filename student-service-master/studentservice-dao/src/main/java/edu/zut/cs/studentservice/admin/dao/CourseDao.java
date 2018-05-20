package edu.zut.cs.studentservice.admin.dao;

import java.util.List;

import edu.zut.cs.studentservice.admin.domain.Course;
import edu.zut.cs.studentservice.base.dao.GenericDao;

public interface CourseDao extends GenericDao<Course,Long>{
	public  List<Course> findBySpeciality(String speciality);
}
