package edu.zut.cs.studentservice.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.studentservice.base.domain.BaseEntity;
@Table(name = "STUDENTSERVICE_COURSE")
@Entity
public class Course extends BaseEntity{
	private static final long serialVersionUID = -6958160546969152695L;
	@Column(name="SPECIALITY")
	String speciality;
	@Column(name="MONDAY",columnDefinition="LONGTEXT")
	String monday;
	@Column(name="TUESDAY",columnDefinition="LONGTEXT")
	String tuesday;
	@Column(name="WEDNESDAY",columnDefinition="LONGTEXT")
	String wednesday;
	@Column(name="THURSDAY",columnDefinition="LONGTEXT")
	String thursday;
	@Column(name="FRIDAY",columnDefinition="LONGTEXT")
	String friday;
	@Column(name="SATURDAY",columnDefinition="LONGTEXT")
	String saturday;
	@Column(name="SUNDAY",columnDefinition="LONGTEXT")
	String sunday;
	@Column(name="CLASS")
	String student_class;
	Student student;
	
	public String getStudent_class() {
		return student_class;
	}

	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpecialty(String specialty) {
		this.speciality = specialty;
	}

	public String getMonday() {
		return monday;
	}

	public void setMonday(String monday) {
		this.monday = monday;
	}

	public String getTuesday() {
		return tuesday;
	}

	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}

	public String getWednesday() {
		return wednesday;
	}

	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}

	public String getThursday() {
		return thursday;
	}

	public void setThursday(String thursday) {
		this.thursday = thursday;
	}

	public String getFriday() {
		return friday;
	}

	public void setFriday(String friday) {
		this.friday = friday;
	}

	public String getSaturday() {
		return saturday;
	}

	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}

	public String getSunday() {
		return sunday;
	}

	public void setSunday(String sunday) {
		this.sunday = sunday;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [speciality=" + speciality + ", monday=" + monday + ", tuesday=" + tuesday + ", wednesday="
				+ wednesday + ", thursday=" + thursday + ", friday=" + friday + ", saturday=" + saturday + ", sunday="
				+ sunday + ", student_class=" + student_class + ", student=" + student + "]";
	}


}
