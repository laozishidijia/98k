package edu.zut.cs.studentservice.admin.service.impl.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.studentservice.admin.domain.SecondGoods;
import edu.zut.cs.studentservice.admin.service.SecondGoodsManager;
import edu.zut.cs.studentservice.base.service.GenericGenerator;

public class SecondGoodsManagerImplTest extends GenericGenerator{
	@Autowired
	SecondGoodsManager Secondgoodsmanager;
	
	@Test
	public void test()
	{
		for(int i=0;i<100;i++)
		{
			SecondGoods Secondgoods=new SecondGoods();
			Secondgoods.setSnumber(i);
			Secondgoods.setSname("二手物品："+i);
			Secondgoods.setSprice(200);
			Secondgoods.setStime(2);
			Secondgoods.setSdescrible("无损坏，可以继续使用");
			this.Secondgoodsmanager.save(Secondgoods);
		}
	}

}
