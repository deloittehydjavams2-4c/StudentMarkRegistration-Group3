package com.deloitte.studentmark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.studentmark.bean.StudentInfo;
import com.deloitte.studentmark.bean.StudentMarkPrimary;
import com.deloitte.studentmark.dao.StudentDao;



@Controller
public class StudentController {
	@RequestMapping("welcome")
	public String welcome()
	{
		return "Home";
	}
	
	@Autowired
	StudentDao dao;
	@RequestMapping("/homesubmit")
	public ModelAndView viewStudent(){
	ModelAndView mav = new ModelAndView();
		List<StudentInfo> stdlist = dao.getStudents();
		
		String id_list[] = new String[stdlist.size()];
		for(int i = 0; i< stdlist.size(); i++)
		{
			id_list[i] = stdlist.get(i).getStudent_id();
		}
		
		mav.addObject("list",stdlist);
		mav.setViewName("Home");
		return mav;
	}
	@RequestMapping("submitid")    
    public ModelAndView submitid(@RequestParam("student_id") String student_id){ 
		
		List<StudentInfo> std = dao.getDetail(student_id);
		
      ModelAndView mav= new ModelAndView();
      mav.addObject("detlist",std);
      mav.setViewName("Detail");
     
		return mav;      
    } 
	
	@RequestMapping("add")    
    public ModelAndView add(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("standard") String standard,@RequestParam("category") String category){ 
		ModelAndView mav= new ModelAndView();
		mav.addObject("id",id);
	      
		if (category.equals("p"))
		{
			mav.setViewName("Primary");
		}
		else if(category.equals("s"))
		{
			mav.setViewName("Secondary");
		}
		else if(category.equals("h"))
		{
			mav.setViewName("Higher");
		}
		else
		{
			mav.setViewName("Welcome");
		}
		return mav;
	}
		
	
	
	@RequestMapping(value="addprimarymarks",method=RequestMethod.POST)
	public ModelAndView addP(@ModelAttribute("StudentMarkPrimary") StudentMarkPrimary std)
	{
		ModelAndView mav = new ModelAndView();
		String msg;
		int rows = dao.addPrimaryMarks(std);
		
		if(rows>0)
			msg="Record inserted";
		else
			msg="record not inserted";
			
		System.out.println(msg);
		//mav.addObject("std",std);
		System.out.println(std.getStudent_id());
		System.out.println(std.getHindi_mark());
		//mav.setViewName("Welcome");
		//mav.setViewName("redirect:viewstd");
		return mav;
	}
}
