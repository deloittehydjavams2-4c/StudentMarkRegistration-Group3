package com.deloitte.studentmark.bean;

import org.springframework.stereotype.Component;

@Component
public class StudentMarkPrimary {
	private String student_id;
	private int english_mark;
	private int hindi_mark;
	private int science_mark;
	private int maths_mark;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public int getEnglish_mark() {
		return english_mark;
	}
	public void setEnglish_mark(int english_mark) {
		this.english_mark = english_mark;
	}
	public int getHindi_mark() {
		return hindi_mark;
	}
	public void setHindi_mark(int hindi_mark) {
		this.hindi_mark = hindi_mark;
	}
	public int getScience_mark() {
		return science_mark;
	}
	public void setScience_mark(int science_mark) {
		this.science_mark = science_mark;
	}
	public int getMaths_mark() {
		return maths_mark;
	}
	public void setMaths_mark(int maths_mark) {
		this.maths_mark = maths_mark;
	}
	
	
	
}
