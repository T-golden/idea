package com.example.demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.TeacherAccount;

@Mapper
public interface TeacherAccountDao {
	TeacherAccount selectByPrimaryKey(String teacherId);

	TeacherAccount selectByaccount(Map<String, String> map);
}
