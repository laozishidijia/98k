package edu.zut.cs.studentservice.admin.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.studentservice.admin.dao.LearnDao;
import edu.zut.cs.studentservice.admin.domain.Learn;
import edu.zut.cs.studentservice.admin.service.LearnManager;
import edu.zut.cs.studentservice.base.service.impl.GenericManagerImpl;

@Component
public class LearnManagerImpl extends GenericManagerImpl<Learn, Long>implements LearnManager{
	LearnDao LearnDao;
	@Autowired 
	public void setLearnDao(LearnDao LearnDao) {
		this.LearnDao = LearnDao;
		this.dao = this.LearnDao;
	}
	
}