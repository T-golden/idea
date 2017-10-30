package com.example.demo.dao;

import java.util.Map;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

public interface loginDao {
	Teacher selectTeacherByAP(Map<String, String> map);
	
	Student selectStudentByAP(Map<String, String> map);
}
