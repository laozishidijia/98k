package edu.zut.cs.studentservice.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.studentservice.base.domain.BaseEntity;

@Table(name = "STUDENTSERVICE_GOODS")
@Entity
public class Goods extends BaseEntity {
	
	private static final long serialVersionUID = -6958160546969152695L;
	public String ItemsName;
	public String ItemsId;
	public String ItemsPrice;
	public String ItemsNumber;
	public String ItemsDescrib;
	public String ItemsClassify;
	
	
	
	@Column(name="ITEMSID")
	public String getItemsId() {
		return ItemsId;
	}
	public void setItemsId(String itemsId) {
		ItemsId = itemsId;
	}
	
	
	@Column(name="ITEMSName")
	public String getItemsName() {
		return ItemsName;
	}
	public void setItemsName(String itemsName) {
		ItemsName = itemsName;
	}
	
	

	
	
	@Column(name="ITEMSPRICE")
	public String getItemsPrice() {
		return ItemsPrice;
	}
	public void setItemsPrice(String itemsPrice) {
		ItemsPrice = itemsPrice;
	}
	
	@Column(name="ITEMSNUMBER")
	public String getItemsNumber() {
		return ItemsNumber;
	}
	public void setItemsNumber(String itemsNumber) {
		ItemsNumber = itemsNumber;
	}
	
	@Column(name="ITEMSDESCRIBE")
	public String getItemsDescrib() {
		return ItemsDescrib;
	}
	public void setItemsDescrib(String itemsDescrib) {
		ItemsDescrib = itemsDescrib;
	}
	
	@Column(name="ITEMSCLASSIFY")
	public String getItemsClassify() {
		return ItemsClassify;
	}
	public void setItemsClassify(String itemsClassify) {
		ItemsClassify = itemsClassify;
	}
	
	
	@Override
	public String toString() {
		return "Goods [ItemsId=" + ItemsId + ", ItemsName=" + ItemsName + ", ItemsPrice=" + ItemsPrice + ",ItemsNumber=" + ItemsNumber +", ItemsDescrib=" + ItemsDescrib + ",ItemsClassify="+ ItemsClassify +"]";
	}
	

}
