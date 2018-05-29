package edu.zut.cs.studentservice.admin.dao;

import java.util.List;


import edu.zut.cs.studentservice.admin.domain.Topic;
import edu.zut.cs.studentservice.base.dao.GenericDao;

public interface TopicDao extends GenericDao<Topic,Long> {

public List<Topic> findBytype(String type);

//@Query("select t from Topic t where t.T_id=:id ")
//public Topic getTopicById(String id);

}
