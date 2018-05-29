package edu.zut.cs.studentservice.admin.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.studentservice.base.domain.BaseEntity;
@Table(name = "STUDENTSERVICE_TOPIC")
@Entity
public class Topic extends BaseEntity{
	private static final long serialVersionUID = -6958160546969152694L;
	private String T_id;
	private String title;
	private String content;
	private String type;
	@ManyToOne
	@JoinColumn(name = "Student_id",referencedColumnName="S_id")
	private Student author;
	
	public String getT_id() {
		return T_id;
	}
	@Override
	public String toString() {
		return "Topic [T_id=" + T_id + ", title=" + title + ", content=" + content + ", type=" + type + ", author="
				+ author + "]";
	}
	public void setT_id(String t_id) {
		T_id = t_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Student getAuthor() {
		return author;
	}
	public void setAuthor(Student author) {
		this.author = author;
	}

}
