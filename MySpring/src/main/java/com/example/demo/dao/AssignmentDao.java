package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Assignment;

@Mapper
public interface AssignmentDao {
	Assignment selectByPrimaryKey(String assignmentId);
}
