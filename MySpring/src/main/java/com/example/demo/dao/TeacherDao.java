package com.example.demo.dao;


import com.example.demo.model.Teacher;

public interface TeacherDao {
	Teacher selectByPrimaryKey(String teacherId);
}
