package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Course;
@Mapper
public interface CourseDao {
	Course selectByPrimaryKey(String courseId);
}
