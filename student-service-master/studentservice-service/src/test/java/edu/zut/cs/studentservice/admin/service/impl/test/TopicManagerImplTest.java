package edu.zut.cs.studentservice.admin.service.impl.test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mysql.fabric.xmlrpc.base.Data;

import edu.zut.cs.studentservice.admin.domain.Student;
import edu.zut.cs.studentservice.admin.domain.Topic;
import edu.zut.cs.studentservice.admin.service.StudentManager;
import edu.zut.cs.studentservice.admin.service.TopicManager;
import edu.zut.cs.studentservice.base.service.GenericGenerator;

public class TopicManagerImplTest extends GenericGenerator{
	@Autowired
	TopicManager topicManager;
	@Autowired
	StudentManager studentManager;
	@Test
	public void add_topic() {
		Student student = new Student();
		student.setS_id("201709091293");
		student.setS_name("胡勇");
		student.setS_dept("体育");
		this.studentManager.save(student);
		for(int i=1;i<=40;i++)
		{
			
			Topic topic =new Topic();
			topic.setT_id("201805201840"+i);
			topic.setTitle("约打篮球");
			topic.setContent("下完课有木有人去北大坑打篮球的？");
			topic.setType("运动");
			topic.setAuthor(student);
			topicManager.save(topic);
		}
	}
}
