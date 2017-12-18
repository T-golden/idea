package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.model.JsonResult;
import com.example.demo.util.PageTool;

public interface CourseService {
	/**
	 * 创建课程
	 * @param course
	 * @return
	 */
	JsonResult createCourse(Course course);
	
	/**
	 * 教师编号查询课程信息
	 * @param teacherId
	 * @return
	 */
	JsonResult selectCourseByTeacherId(String teacherId);
	
	/**
	 * 分页课程信息
	 * @param page
	 * @param teacherId
	 * @return
	 */
	PageTool<Course> selectCoursePageByTeacherId(PageTool<Course> page , String teacherId);
}
