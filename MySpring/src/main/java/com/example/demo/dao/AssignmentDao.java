package com.example.demo.dao;

import com.example.demo.model.Assignment;

public interface AssignmentDao {
	Assignment selectByPrimaryKey(String assignmentId);
}
