package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.model.JsonResult;

public interface CourseService {
	/**
	 * 创建课程
	 * @param course
	 * @return
	 */
	JsonResult createCourse(Course course);
}
