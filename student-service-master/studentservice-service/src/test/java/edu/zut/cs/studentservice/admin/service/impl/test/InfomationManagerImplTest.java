package edu.zut.cs.studentservice.admin.service.impl.test;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.studentservice.admin.domain.Infomation;
import edu.zut.cs.studentservice.admin.service.InfomationManager;
import edu.zut.cs.studentservice.base.service.GenericGenerator;

public class InfomationManagerImplTest extends GenericGenerator{
	@Autowired
	InfomationManager infomationManager;
	
	@Test
	public void test() {
		for(int i=0;i<100;i++) {
			Infomation infomation=new Infomation();
			infomation.setInfo_id("Id"+i);
			infomation.setInfo_name("User"+i);
			infomation.setInfo_time("CreateTime"+i);
			infomation.setInfo_message("**");
			this.infomationManager.save(infomation);	}

}
}
