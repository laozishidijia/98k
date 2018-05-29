package edu.zut.cs.studentservice.admin.service.impl.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.studentservice.admin.domain.Student;
import edu.zut.cs.studentservice.admin.service.StudentManager;
import edu.zut.cs.studentservice.base.service.GenericGenerator;

public class StudentManagerImplTest extends GenericGenerator{

	@Autowired
	StudentManager studentManager;
	@Test
	public void test() {
		for(int i=0;i<70;i++) {
			Student student = new Student();
			student.setS_id("2016080401"+i);
			student.setS_name("小红"+i);
			student.setS_dept("计算机");
			this.studentManager.save(student);
		}
	}
	@Test
	public void TestFindBySdept() {
		List<Student> studentList = studentManager.findByNames("小红0");
		System.out.println("总共有"+studentList.size()+"个叫小红0的学生");
	}
}
