package com.deloitte.studentmark.bean;

import org.springframework.stereotype.Component;

@Component
public class StudentMarkSecondary {
	private String student_id;
	private String english_mark;
	private String hindi_mark;
	private String science_mark;
	private String maths_mark;
	private String social_mark;
	
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
	public String getHindi_mark() {
		return hindi_mark;
	}
	public void setHindi_mark(String hindi_mark) {
		this.hindi_mark = hindi_mark;
	}
	public String getScience_mark() {
		return science_mark;
	}
	public void setScience_mark(String science_mark) {
		this.science_mark = science_mark;
	}
	public String getMaths_mark() {
		return maths_mark;
	}
	public void setMaths_mark(String maths_mark) {
		this.maths_mark = maths_mark;
	}
	public String getSocial_mark() {
		return social_mark;
	}
	public void setSocial_mark(String social_mark) {
		this.social_mark = social_mark;
	}
	
}
