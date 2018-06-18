package edu.zut.cs.studentservice.admin.service.impl.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.studentservice.admin.domain.Learn;
import edu.zut.cs.studentservice.admin.domain.Student;
import edu.zut.cs.studentservice.admin.service.LearnManager;
import edu.zut.cs.studentservice.base.service.GenericGenerator;
/**
 * 四六级实现测试类
 * */
public class LearnManagerImplTest extends GenericGenerator {
	@Autowired
	LearnManager LearnManager;
	@Test
	public void test() {
		for(int i=0;i<99;i++) {
			Learn Learn = new Learn();
			Learn.setS_name("name:"+i);
			Learn.setS_time("time:"+i);
			Learn.setS_neirong("内容："+i);
			this.LearnManager.save(Learn);
		}
	}
	@Test
	public void jilu()
	{
		List<Learn> LearnList = LearnManager.findByNames("name0");
		System.out.println("总共"+LearnList.size()+"个资料名字为name0");
	}

}