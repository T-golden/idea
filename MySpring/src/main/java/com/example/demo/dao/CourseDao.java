package com.example.demo.dao;

import com.example.demo.model.Course;

public interface CourseDao {
	Course selectByPrimaryKey(String courseId);
}
