package edu.zut.cs.studentservice.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.studentservice.base.domain.BaseEntity;
@Table(name="STUDENTSERVICE_ADMINISTRATOR")
@Entity
public class Administrator extends BaseEntity{

	private static final long serialVersionUID = 1L;
	@Column(name="USER_NAME")
	String userName;
	@Column(name="PASSWORD")
	String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
