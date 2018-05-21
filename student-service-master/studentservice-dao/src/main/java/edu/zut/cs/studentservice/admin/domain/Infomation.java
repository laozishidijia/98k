package edu.zut.cs.studentservice.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.studentservice.base.domain.BaseEntity;
@Table(name="STUDENTSERVICE_FEEDBACK")
@Entity
public class Infomation extends BaseEntity{
	private static final long serialVersionUID = -6958160546969152695L;
	private String Info_id;
	private String Info_name;
	private String Info_time;
	private String Info_message;
	
	@Column(name="Info_id",length=12)
	public String getInfo_id() {
		return Info_id;
	}
	public void setInfo_id(String info_id) {
		Info_id = info_id;
	}
	@Column(name="Info_name",length=20)
	public String getInfo_name() {
		return Info_name;
	}
	public void setInfo_name(String info_name) {
		Info_name = info_name;
	}
	@Column(name="Info_time")
	public String getInfo_time() {
		return Info_time;
	}
	public void setInfo_time(String info_time) {
		Info_time = info_time;
	}
	@Column(name="Info_message")
	public String getInfo_message() {
		return Info_message;
	}
	public void setInfo_message(String info_message) {
		Info_message = info_message;
	}
	@Override
	public String toString()
	{
		return "Infomation [Info_id="+Info_id+",Info_name="+Info_name+",Info_time="+Info_time+",Info_message="+Info_message+" ]";
	}
	
	
}
