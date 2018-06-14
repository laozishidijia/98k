package edu.zut.cs.studentservice.admin.service.impl.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.studentservice.admin.domain.Goods;
import edu.zut.cs.studentservice.admin.service.GoodsManager;
import edu.zut.cs.studentservice.base.service.GenericGenerator;



public class GoodsManagerlmplTest extends GenericGenerator{
	@Autowired
	GoodsManager goodsManager;
	
	@Test
	public void test()
	{
		for(int i=0;i<100;i++) {
			Goods goods=new Goods();
			goods.setItemsId("1"+i);
			goods.setItemsName("物品"+i);
			goods.setItemsNumber("2"+i);
			goods.setItemsDescrib("very new"+i+5);
			this.goodsManager.save(goods);
		}
	}

}
