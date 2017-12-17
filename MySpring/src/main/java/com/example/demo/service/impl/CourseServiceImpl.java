package com.example.demo.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.model.Course;
import com.example.demo.model.JsonResult;
import com.example.demo.service.CourseService;
import com.example.demo.util.PageTool;

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

	@Override
	public PageTool<Course> selectCoursePageByTeacherId(PageTool<Course> page, String teacherId) {
		Map<String, Object> map = new HashMap<>();
		int count = courseDao.getCount(teacherId);
		page.setTotalCount(count);
		if(count>0) {
			map.put("teacherId", teacherId);
			map.put("page", page);
			List<Course> coursePage = courseDao.selectCoursePageByTeacherId(map);
			page.setResult(coursePage);
			page.setTotalCount(count);
		}else {
			page.setResult(null);
		}
		return page;
	}

}
