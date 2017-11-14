package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Student;
@Mapper
public interface StudentDao {
	
	/**
	 * 查询学生信息
	 * @param studentId
	 * @return
	 */
	Student selectByPrimaryKey(String studentId);
	
	/**
	 * 添加学生信息
	 * @param student
	 * @return
	 */
	int insertStudent(Student student);
	
	/**
	 * 修改学生信息
	 * @param student
	 * @return
	 */
	int updateStudent(Student student);
	
	/**
	 * 删除学生信息
	 * @param studentId
	 * @return
	 */
	int deleteStudent(String studentId);
}
