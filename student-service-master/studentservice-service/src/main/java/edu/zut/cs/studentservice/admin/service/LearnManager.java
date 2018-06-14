package edu.zut.cs.studentservice.admin.service;

import java.util.List;

import edu.zut.cs.studentservice.admin.domain.Learn;
import edu.zut.cs.studentservice.base.service.GenericManager;

public interface LearnManager extends GenericManager<Learn, Long>{
	public List<Learn> findByNames(String name);
}
