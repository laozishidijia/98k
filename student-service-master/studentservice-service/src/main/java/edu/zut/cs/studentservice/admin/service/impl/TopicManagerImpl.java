package edu.zut.cs.studentservice.admin.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.studentservice.admin.dao.TopicDao;
import edu.zut.cs.studentservice.admin.domain.Topic;
import edu.zut.cs.studentservice.admin.service.TopicManager;
import edu.zut.cs.studentservice.base.service.impl.GenericManagerImpl;
@Component
public class TopicManagerImpl extends GenericManagerImpl<Topic, Long>implements TopicManager {
	
	TopicDao topicDao;

	public TopicDao getTopicDao() {
		return topicDao;
	}
	@Autowired
	public void setTopicDao(TopicDao topicDao) {
		this.topicDao = topicDao;
		this.dao = this.topicDao;
	}
	
}
