package com.example.demo.dao;

import com.example.demo.model.Classes;

public interface ClassesDao {
	Classes selectByPrimaryKey(String classId);
}
