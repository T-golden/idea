package com.example.demo.service;

import java.util.Map;

import com.example.demo.model.JsonResult;
import com.example.demo.model.StudentAccount;
import com.example.demo.model.Teacher;
import com.example.demo.model.TeacherAccount;

public interface TeacherService {
	
	JsonResult selectFiveTeacher();
	
	/**
	 * 教师登录
	 * @param account
	 * @param password
	 * @return
	 */
	TeacherAccount teacherLogin(String account , String password);
	
	/**
	 * 查询教师信息
	 * @param teacherId
	 * @return
	 */
	JsonResult getTeacherInfo(String teacherId);
	
	/**
	 * 修改教师信息
	 * @param teacherId
	 * @return
	 */
	JsonResult updateTeacherInfo(Teacher teacher);
	
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
	
	/**
	 * 删除班级信息
	 * @param map
	 * @return
	 */
	int deleteClass(Map<String, Object> map);
}
