package edu.zut.cs.studentservice.admin.dao;

import edu.zut.cs.studentservice.admin.domain.Administrator;
import edu.zut.cs.studentservice.base.dao.GenericDao;

public interface AdministratorDao extends GenericDao<Administrator,Long>{
	Administrator findByUserName(String userName);
}
