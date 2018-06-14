package edu.zut.cs.studentservice.admin.service;

import edu.zut.cs.studentservice.admin.domain.Administrator;
import edu.zut.cs.studentservice.base.service.GenericManager;

public interface AdministratorManager extends GenericManager<Administrator,Long>{
	Administrator findByUserName(String userName);
}
