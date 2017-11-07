package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Student;
@Mapper
public interface StudentDao {
	Student selectByPrimaryKey(String studentId);
}
