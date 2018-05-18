package edu.zut.cs.studentservice.admin.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.zut.cs.studentservice.admin.domain.Course;
import edu.zut.cs.studentservice.base.service.GenericManager;

public interface CourseManager extends GenericManager<Course, Long>{
	@Query("SLECT course FROM Course course WHERE course.speciality = :specialty")
	public  List<Course> findBySpeciality(@Param("specialty")String speciality);
}
