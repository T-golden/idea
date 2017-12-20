package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Course;

@Mapper
public interface CourseDao {
	
	/**
	 * 分页课程信息
	 * @param teacherId
	 * @return
	 */
	List<Course> selectCoursePageByTeacherId(Map<String, Object> map);
	
	int getCount(String teacherId);
	
	/**
	 * 教师编号查询课程信息
	 * @param teacherId
	 * @return
	 */
	List<Course> selectByTeacherId(String teacherId);
	
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
	int updateCourseById(Course course);
	
	/**
	 * 删除课程信息
	 * @param courseId
	 * @return
	 */
	int deleteCourseById(String courseId);
}
