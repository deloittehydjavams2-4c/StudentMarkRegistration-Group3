package com.deloitte.studentmark.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.deloitte.studentmark.bean.StudentInfo;
import com.deloitte.studentmark.bean.StudentMarkPrimary;
import com.deloitte.studentmark.calculation.PrimaryCalculation;




@Repository
public class StudentDao {
	@Autowired
	JdbcTemplate template;
	
	public List<StudentInfo> getStudents(){
		String qry = "select * from student_info";
		List<StudentInfo> stdlist = template.query(qry, 
				new BeanPropertyRowMapper<StudentInfo>(StudentInfo.class));
		return stdlist;
	}
	
	public List<StudentInfo> getDetail(String student_id){
		String qry = "select * from student_info where student_id = '" + student_id + "'"; 
		List<StudentInfo> std = template.query(qry, 
				new BeanPropertyRowMapper<StudentInfo>(StudentInfo.class));
		return std;
		
	}
	public int addPrimaryMarks(StudentMarkPrimary std)
	{
		PrimaryCalculation pc=new PrimaryCalculation();
		int total=pc.total(std);
		double avg=pc.average(total);
		String g=pc.grade(avg, std);
		System.out.println(std.getStudent_id());
		System.out.println(std.getEnglish_mark());
		System.out.println(std.getMaths_mark());
		System.out.println(std.getScience_mark());
		System.out.println(std.getHindi_mark());
		System.out.println(total);
		System.out.println(avg);
		System.out.println(g);
		
	//	String qry="insert into student_mark_primary values('101',11,12,11,22,56,67,'F')";
		String qry="insert into student_mark_primary values(?,?,?,?,?,?,?,?)";
		Object args[] = {std.getStudent_id(),std.getEnglish_mark(),std.getHindi_mark(),std.getScience_mark(),std.getMaths_mark(),total,avg,g};
		int rows= template.update(qry,args);
		return rows; 
		
		
	}
	
	
	
}

