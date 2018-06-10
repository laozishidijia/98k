package edu.zut.cs.studentservice.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.studentservice.admin.dao.AdministratorDao;
import edu.zut.cs.studentservice.admin.domain.Administrator;
import edu.zut.cs.studentservice.admin.service.AdministratorManager;
import edu.zut.cs.studentservice.base.service.impl.GenericManagerImpl;
@Service
public class AdministratorManagerImpl extends GenericManagerImpl<Administrator,Long> implements AdministratorManager{
	AdministratorDao administratorDao;
	@Autowired
	public void setAdministratorDao(AdministratorDao administratorDao) {
		this.administratorDao = administratorDao;
		this.dao=this.administratorDao;
	}

	public Administrator findByUserName(String userName) {
		Administrator administrator=this.administratorDao.findByUserName(userName);
		return administrator;
	}
	
	
	
}
