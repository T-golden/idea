package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Assignment;

@Mapper
public interface AssignmentDao {
	
	/**
	 * 查询作业信息
	 * @param assignmentId
	 * @return
	 */
	Assignment selectByPrimaryKey(String assignmentId);
	
	/**
	 * 创建作业信息
	 * @param assignment
	 * @return
	 */
	int createAssignment(Assignment assignment);
	
	/**
	 * 修改作业信息
	 * @param assignmentId
	 * @return
	 */
	int updateAssignment(String assignmentId);
	
	/**
	 * 删除作业信息
	 * @param assignmentId
	 * @return
	 */
	int deleteAssignment(String assignmentId);
}
