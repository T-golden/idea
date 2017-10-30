package com.example.demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.StudentAccount;

@Mapper
public interface StudentAccountDao {
	StudentAccount selectByPrimaryKey(String studentId);
	
	StudentAccount selectByaccount(Map<String, String> map);
}
