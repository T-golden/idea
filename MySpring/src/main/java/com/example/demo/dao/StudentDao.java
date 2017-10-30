package com.example.demo.dao;

import com.example.demo.model.Student;

public interface StudentDao {
	Student selectByPrimaryKey(String studentId);
}
