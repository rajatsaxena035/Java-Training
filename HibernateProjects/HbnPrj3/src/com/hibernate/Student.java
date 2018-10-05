package com.hibernate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	@Id
	@GeneratedValue
	private int student_id;
	private String student_name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id")
	private StudentDetail studentDetail;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public StudentDetail getStudentDetail() {
		return studentDetail;
	}
	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}
}
