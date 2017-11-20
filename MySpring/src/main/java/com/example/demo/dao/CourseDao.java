package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Course;

@Mapper
public interface CourseDao {
	/**
	 * 查询课程信息
	 * @param courseId
	 * @return
	 */
	Course selectByPrimaryKey(String courseId);
	
	/**
	 * 创建课程
	 * @param course
	 * @return
	 */
	int createCourse(Course course);
	
	/**
	 * 修改课程信息
	 * @param courseId
	 * @return
	 */
	int updateCourseById(String courseId);
	
	/**
	 * 删除课程信息
	 * @param courseId
	 * @return
	 */
	int deleteCourseById(String courseId);
}
