package edu.zut.cs.studentservice.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.studentservice.base.domain.BaseEntity;

@Table(name = "STUDENTSERVICE_LEARN")
@Entity
/**
 * 构建四六级资料实体
*/
public class Learn extends BaseEntity {
	private static final long serialVersionUID = -6958160546969152695L;
	private String S_name;
	private String S_time;
	private String S_neirong;
	
	@Column(name="S_name")
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	@Column(name="S_time")
	public String getS_time() {
		return S_time;
	}
	public void setS_time(String s_time) {
		S_time = s_time;
	}
	@Column(name="S_neirong")
	public String getS_dept() {
		return S_neirong;
	}
	public void setS_neirong(String s_neirong) {
		S_neirong = s_neirong;
	}
	@Override
	public String toString() {
		return "46ji [S_name=" + S_name + ", S_time=" + S_time + ", S_neirong=" + S_neirong + "]";
	}
}

	