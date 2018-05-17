package edu.zut.cs.studentservice.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.studentservice.base.domain.BaseEntity;
@Table(name = "STUDENTSERVICE_COURSE")
@Entity
public class Course extends BaseEntity{
	private static final long serialVersionUID = -6958160546969152695L;
	@Column(name="SPECIALTY")
	String specialty;

	String erro;
	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

}
