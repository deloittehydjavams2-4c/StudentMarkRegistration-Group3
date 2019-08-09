package com.deloitte.studentmark.calculation;

import org.springframework.stereotype.Component;

import com.deloitte.studentmark.bean.StudentMarkPrimary;

@Component
public class PrimaryCalculation {
	
	public int total(StudentMarkPrimary stdp)
	{
		int total = stdp.getHindi_mark()+stdp.getEnglish_mark()+stdp.getScience_mark()+stdp.getMaths_mark();
		return total;
	}
	public double average(int total)

	{
		int avg=total/4;
		return avg;
	}
	public String grade(double avg,StudentMarkPrimary std)
	{
		String g;
		if(avg>90 && std.getEnglish_mark()>=50 && std.getHindi_mark()>=50 && std.getMaths_mark()>=50 && std.getScience_mark()>=50)
		{
			g="A";
		}
		else if(avg>70 && std.getEnglish_mark()>=50 && std.getHindi_mark()>=50 && std.getMaths_mark()>=50 && std.getScience_mark()>=50)
		{
			g="B";
		}
		else if(avg>50 && std.getEnglish_mark()>=50 && std.getHindi_mark()>=50 && std.getMaths_mark()>=50 && std.getScience_mark()>=50)
		{
			g="C";
		}
		else 
		{
			g="F";
		}
		return g;
	}

}
