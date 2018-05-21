package edu.zut.cs.studentservice.admin.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import edu.zut.cs.studentservice.admin.dao.InfomationDao;
import edu.zut.cs.studentservice.admin.domain.Infomation;

import edu.zut.cs.studentservice.admin.service.InfomationManager;
import edu.zut.cs.studentservice.base.service.impl.GenericManagerImpl;
@Component
public class InfomationManagerImpl extends GenericManagerImpl<Infomation, Long>implements InfomationManager{
	InfomationDao infomationDao;
	@Autowired
	public void setInfomationDao(InfomationDao infomationDao)
	{
		this.infomationDao=infomationDao;
		this.dao=this.infomationDao;
	}
}
