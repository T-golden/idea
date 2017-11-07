package com.example.demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
@Mapper
public interface loginDao {
	Teacher selectTeacherByAP(Map<String, String> map);
	
	Student selectStudentByAP(Map<String, String> map);
}
