package com.deloitte.studentmark.bean;

import org.springframework.stereotype.Component;

@Component
public class StudentMarkHigher {
	private String student_id;
	private String english_mark;
	private String tamil_mark;
	private String physics_mark;
	private String chemistry_mark;
	private String maths_mark;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getEnglish_mark() {
		return english_mark;
	}
	public void setEnglish_mark(String english_mark) {
		this.english_mark = english_mark;
	}
	public String getTamil_mark() {
		return tamil_mark;
	}
	public void setTamil_mark(String tamil_mark) {
		this.tamil_mark = tamil_mark;
	}
	public String getPhysics_mark() {
		return physics_mark;
	}
	public void setPhysics_mark(String physics_mark) {
		this.physics_mark = physics_mark;
	}
	public String getChemistry_mark() {
		return chemistry_mark;
	}
	public void setChemistry_mark(String chemistry_mark) {
		this.chemistry_mark = chemistry_mark;
	}
	public String getMaths_mark() {
		return maths_mark;
	}
	public void setMaths_mark(String maths_mark) {
		this.maths_mark = maths_mark;
	}
}

