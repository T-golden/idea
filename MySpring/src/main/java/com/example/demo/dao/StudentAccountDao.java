package com.example.demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Student;
import com.example.demo.model.StudentAccount;

@Mapper
public interface StudentAccountDao {
	
	/**
	 * 编号查询学生账号信息
	 * @param studentId
	 * @return
	 */
	StudentAccount selectByPrimaryKey(String studentId);
	
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
	int insertStudentAccont(Student student);
	
	/**
	 * 修改学生账号信息
	 * @param student
	 * @return
	 */
	int updateStudentAccount(Student student);
	
	/**
	 * 删除学生账号信息
	 * @param studentId
	 * @return
	 */
	int deleteStudentAccount(String studentId);
}
