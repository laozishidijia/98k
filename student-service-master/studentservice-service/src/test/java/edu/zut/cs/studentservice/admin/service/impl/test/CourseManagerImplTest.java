package edu.zut.cs.studentservice.admin.service.impl.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.studentservice.admin.domain.Course;
import edu.zut.cs.studentservice.admin.service.CourseManager;
import edu.zut.cs.studentservice.base.service.GenericGenerator;

public class CourseManagerImplTest extends GenericGenerator {
	@Autowired
	CourseManager courseManager;
	@Test
	public void test() {
		for(int i=0;i<100;i++) {
			Course course=new Course();
			course.setSpecialty(i+"");
			this.courseManager.save(course);
		}
	}

}
