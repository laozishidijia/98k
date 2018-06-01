package edu.zut.cs.studentservice.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.studentservice.base.domain.BaseEntity;

@Table(name="STUDENTSERVICE_SECONDGOODS")
@Entity
public class SecondGoods extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6958160546969152695L;
	@Column(name="SNAME")
	private String Sname;
	@Column(name="SNUMBER")
	private long Snumber;
	@Column(name="SPRICE")
	private float Sprice;
	@Column(name="SUSINGTIME")
	private float Stime;
	@Column(name="SDESCRILE")
	private String Sdescrible;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public long getSnumber() {
		return Snumber;
	}
	public void setSnumber(long snumber) {
		Snumber = snumber;
	}
	public float getSprice() {
		return Sprice;
	}
	public void setSprice(float sprice) {
		Sprice = sprice;
	}
	public float getStime() {
		return Stime;
	}
	public void setStime(float stime) {
		Stime = stime;
	}
	public String getSdescrible() {
		return Sdescrible;
	}
	public void setSdescrible(String sdescrible) {
		Sdescrible = sdescrible;
	}
	

}
