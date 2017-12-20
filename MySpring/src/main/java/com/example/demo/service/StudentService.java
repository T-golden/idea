package com.example.demo.service;


import java.util.Map;

import com.example.demo.model.JsonResult;
import com.example.demo.model.Student;
import com.example.demo.model.StudentAccount;
import com.example.demo.util.PageTool;

public interface StudentService {
	
	StudentAccount studentLogin(String account , String password);
	
	StudentAccount selectByStudentId(String studentId);
	
	Student selectStudentInfo(String studentId);
	
	JsonResult selectStudentByClassId(String classId);
	
	PageTool<Student> selectStudentPageByteacherId(PageTool<Student> page , String teacherId );
	
	/**
	 * 查询学生信息
	 * @param studentId
	 * @return
	 */
	JsonResult selectByPrimaryKey(String studentId);
	
	/**
	 * 修改学生信息
	 * @param Student
	 * @return
	 */
	int upateStudentInfo(Student Student);
	
	/**
	 * 修改学生账号信息
	 * @param studentAccount
	 * @return
	 */
	int updateStudentAccount(StudentAccount studentAccount);
	
	/**
	 * 创建学生账号信息
	 * @param teacherId
	 * @return
	 */
	JsonResult createStudentAccount(String teacherId , String classId , StudentAccount studentAccount , int num);
	
	/**
	 * 删除学生账号信息
	 * @param teacherId
	 * @param studentId
	 * @return
	 */
	JsonResult deleteStudentAccount(String teacherId ,String studentId);
	
	/**
	 * 删除学生信息
	 * @param teacherId
	 * @param studentId
	 * @return
	 */
	int deleteStudent(Map<String , Object> map);
}
