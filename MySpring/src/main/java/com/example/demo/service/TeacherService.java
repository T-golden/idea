package com.example.demo.service;

import com.example.demo.model.JsonResult;
import com.example.demo.model.Teacher;
import com.example.demo.model.TeacherAccount;

public interface TeacherService {
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
}
