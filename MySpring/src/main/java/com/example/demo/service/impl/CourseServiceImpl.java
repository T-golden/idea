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
		int i = courseDao.createCourse(course);
		if(i>0){
			jsonResult.setMsg("课程创建成功！");
			jsonResult.setStatus(0);
		}else{
			jsonResult.setMsg("课程创建失败！");
			jsonResult.setStatus(1);
		}
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

	@Override
	public JsonResult selectCourseByTeacherId(String teacherId) {
		JsonResult jsonResult = new JsonResult();
		List<Course> courseList = courseDao.selectByTeacherId(teacherId);
		if(courseList.size() > 0) {
			jsonResult.setData(courseList);
			jsonResult.setMsg("课程信息！");
			jsonResult.setStatus(0);
		}else {
			jsonResult.setMsg("课程信息为空！");
			jsonResult.setStatus(0);
		}
		return jsonResult;
	}

	@Override
	public JsonResult updateCourseInfo(Course course) {
		JsonResult jsonResult = new JsonResult();
		int i = courseDao.updateCourseById(course);
		if(i>0){
			jsonResult.setMsg("课程信息修改成功！");
			jsonResult.setStatus(0);
		}else{
			jsonResult.setMsg("课程信息修改失败！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

	@Override
	public JsonResult deleteCourse(String courseId) {
		JsonResult jsonResult = new JsonResult();
		int i = courseDao.deleteCourseById(courseId);
		if(i>0){
			jsonResult.setMsg("课程信息删除成功！");
			jsonResult.setStatus(0);
		}else{
			jsonResult.setMsg("课程信息删除失败！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

}
