package edu.zut.cs.studentservice.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.studentservice.admin.dao.GoodsDao;
import edu.zut.cs.studentservice.admin.domain.Goods;
import edu.zut.cs.studentservice.admin.service.GoodsManager;
import edu.zut.cs.studentservice.base.service.impl.GenericManagerImpl;



@Component
public class GoodsManagerlmpl extends GenericManagerImpl<Goods, Long>implements GoodsManager{
	GoodsDao goodDao;
	@Autowired
	public void setGoodDao(GoodsDao goodDao)
	{
		this.goodDao=goodDao;
		this.dao=this.goodDao;
	}
	
}
