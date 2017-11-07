package com.example.demo.dao;


import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Teacher;

@Mapper
public interface TeacherDao {
	/**
	 * 教师信息
	 * @param teacherId
	 * @return
	 */
	Teacher selectByPrimaryKey(String teacherId);
}
