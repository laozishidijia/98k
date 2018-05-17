package edu.zut.cs.studentservice.admin.service.impl.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.studentservice.admin.domain.Learn;
import edu.zut.cs.studentservice.admin.domain.Student;
import edu.zut.cs.studentservice.admin.service.LearnManager;
import edu.zut.cs.studentservice.admin.service.StudentManager;
import edu.zut.cs.studentservice.base.service.GenericGenerator;

public class LearnManagerImplTest extends GenericGenerator {
	@Autowired
	LearnManager LearnManager;
	@Test
	public void test() {
		for(int i=0;i<999999;i++) {
			Learn Learn = new Learn();
			Learn.setS_name("name:"+i);
			Learn.setS_time("time:"+i);
			Learn.setS_neirong("内容："+i);
			this.LearnManager.save(Learn);
		}
	}

}