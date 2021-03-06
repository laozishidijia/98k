package edu.zut.cs.studentservice.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.studentservice.admin.domain.Course;
import edu.zut.cs.studentservice.base.dao.GenericDao;

public interface CourseDao extends GenericDao<Course,Long>{
	public  List<Course> findBySpeciality(String speciality);
	@Query("select course from Course course where course.clazz like %?1%")
	public Course findByClazz(String clazz);

}
