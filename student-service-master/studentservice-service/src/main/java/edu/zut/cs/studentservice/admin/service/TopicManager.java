package edu.zut.cs.studentservice.admin.service;

import java.util.List;

import edu.zut.cs.studentservice.admin.domain.Topic;
import edu.zut.cs.studentservice.base.service.GenericManager;

public interface TopicManager extends GenericManager<Topic, Long>  {
	public List<Topic> findBytypes(String type);
}
