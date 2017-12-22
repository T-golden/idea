package com.example.demo.service;


import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.JsonResult;
import com.example.demo.model.Student;
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
	JsonResult updateTeacherInfo(Teacher teacher , MultipartFile file);
	
	/**
	 * 修改学生信息
	 * @param student
	 * @param studentAccount
	 * @return
	 */
	JsonResult updateStudentInfo(Student student , StudentAccount studentAccount);
	
}
