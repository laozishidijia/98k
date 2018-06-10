package edu.zut.cs.studentservice.admin.service.impl.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.studentservice.admin.domain.Administrator;
import edu.zut.cs.studentservice.admin.service.AdministratorManager;
import edu.zut.cs.studentservice.base.service.GenericGenerator;

public class AdministratorManagerImplTest extends GenericGenerator{
	@Autowired
	AdministratorManager administratorManager;
	@Test
	public void addTestData()
	{
		List<Administrator> administrators=new ArrayList<Administrator>();
		for(int i=0;i<10;i++)
		{
			Administrator administrator=new Administrator();
			administrator.setUserName("userName_"+i);
			administrator.setPassword("password_"+i);
			administrators.add(administrator);
		}
		this.administratorManager.save(administrators);
	}
}
