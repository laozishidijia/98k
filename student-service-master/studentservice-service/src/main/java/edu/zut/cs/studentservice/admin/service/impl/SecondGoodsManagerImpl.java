package edu.zut.cs.studentservice.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.studentservice.admin.dao.SecondGoodsDao;
import edu.zut.cs.studentservice.admin.domain.SecondGoods;
import edu.zut.cs.studentservice.admin.service.SecondGoodsManager;
import edu.zut.cs.studentservice.base.service.impl.GenericManagerImpl;

@Component
public class SecondGoodsManagerImpl extends GenericManagerImpl<SecondGoods,Long> implements SecondGoodsManager {
	SecondGoodsDao Secondgoodsdaos;
    @Autowired
public void setSecondsDao(SecondGoodsDao Secondgoodsdaos) {
    	this.Secondgoodsdaos=Secondgoodsdaos;
    	this.dao=this.Secondgoodsdaos;
    }
}
