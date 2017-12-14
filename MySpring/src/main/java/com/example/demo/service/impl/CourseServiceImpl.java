package com.example.demo.service.impl;

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
		course.setCreateTime(new Date());
		course.setModifyTime(new Date());
		courseDao.createCourse(course);
		jsonResult.setMsg("课程创建成功！");
		jsonResult.setStatus(0);
		return jsonResult;
	}

}
