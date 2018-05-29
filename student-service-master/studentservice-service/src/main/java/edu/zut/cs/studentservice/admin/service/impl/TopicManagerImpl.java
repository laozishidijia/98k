package edu.zut.cs.studentservice.admin.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.studentservice.admin.dao.TopicDao;
import edu.zut.cs.studentservice.admin.domain.Topic;
import edu.zut.cs.studentservice.admin.service.TopicManager;
import edu.zut.cs.studentservice.base.service.impl.GenericManagerImpl;
@Service
public class TopicManagerImpl extends GenericManagerImpl<Topic, Long>implements TopicManager {
	
	TopicDao topicDao;

	@Autowired
	public void setTopicDao(TopicDao topicDao) {
		this.topicDao = topicDao;
		this.dao = this.topicDao;
	}
	
	public List<Topic> findBytypes(String type){
		List<Topic> topicList = this.topicDao.findBytype(type);
		return topicList;
	}
	
}
