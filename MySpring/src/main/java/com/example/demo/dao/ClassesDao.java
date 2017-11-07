package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Classes;
@Mapper
public interface ClassesDao {
	Classes selectByPrimaryKey(String classId);
}
