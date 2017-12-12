package com.example.demo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.model.Course;
import com.example.demo.model.JsonResult;
import com.example.demo.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public JsonResult createCourse(Course course) {
		JsonResult jsonResult = new JsonResult();
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		course.setCourseBeginTime(sdf.format(course.getCourseBeginTime()));
		System.out.println(course.getCourseBeginTime());
		course.setCreateTime(new Date());
		course.setModifyTime(new Date());
		int i = courseDao.createCourse(course);
		if(i>0) {
			jsonResult.setMsg("课程创建成功！");
			jsonResult.setStatus(0);
		}else {
			jsonResult.setMsg("课程创建失败！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

}
