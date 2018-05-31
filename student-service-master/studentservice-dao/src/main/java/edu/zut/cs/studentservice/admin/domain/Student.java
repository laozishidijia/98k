package edu.zut.cs.studentservice.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.studentservice.base.domain.BaseEntity;

@Table(name = "STUDENTSERVICE_STUDENT")
@Entity
public class Student extends BaseEntity {
	private static final long serialVersionUID = -6958160546969152695L;
	private String S_id;
	private String S_name;
	private String S_dept;
	@Column(name="S_class")
	private String S_class;
	@Column(name="S_ID")
	public String getS_id() {
		return S_id;
	}
	public void setS_id(String s_id) {
		S_id = s_id;
	}
	@Column(name="S_NAME")
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	@Column(name="S_DEPT")
	public String getS_dept() {
		return S_dept;
	}
	public void setS_dept(String s_dept) {
		S_dept = s_dept;
	}
	
	public String getS_class() {
		return S_class;
	}
	public void setS_class(String s_class) {
		S_class = s_class;
	}
	@Override
	public String toString() {
		return "Student [S_id=" + S_id + ", S_name=" + S_name + ", S_dept=" + S_dept + ", S_class=" + S_class + "]";
	}

}
