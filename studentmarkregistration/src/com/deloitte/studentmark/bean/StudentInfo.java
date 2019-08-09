package com.deloitte.studentmark.bean;

import org.springframework.stereotype.Component;

@Component
public class StudentInfo {
	private String student_id;
	private String student_name;
	private String standard;
	private char standard_category;
	
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public char getStandard_category() {
		return standard_category;
	}
	public void setStandard_category(char standard_category) {
		this.standard_category = standard_category;
	}
	
}
