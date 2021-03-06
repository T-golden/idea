package com.example.demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.StudentAccount;

@Mapper
public interface StudentAccountDao {
	
	/**
	 * 编号查询学生账号信息
	 * @param studentId
	 * @return
	 */
	StudentAccount selectByPrimaryKey(String studentId);
	
	StudentAccount selectByStudentId(String studentId);
	
	/**
	 * 账号查询学生账号信息
	 * @param map
	 * @return
	 */
	StudentAccount selectByaccount(Map<String, String> map);
	
	/**
	 * 添加学生账号信息
	 * @param student
	 * @return
	 */
	int insertStudentAccont(StudentAccount studentAccount);
	
	/**
	 * 修改学生账号信息
	 * @param student
	 * @return
	 */
	int updateStudentAccount(StudentAccount studentAccount);
	
	/**
	 * 删除学生账号信息
	 * @param studentId
	 * @return
	 */
	int deleteStudentAccount(Map<String, Object> map);
}
