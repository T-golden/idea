package com.example.demo.service;


import com.example.demo.model.JsonResult;
import com.example.demo.model.Student;
import com.example.demo.model.StudentAccount;
import com.example.demo.util.PageTool;

public interface StudentService {
	
	StudentAccount studentLogin(String account , String password);
	
	JsonResult selectStudentByClassId(String classId);
	
	PageTool<Student> selectStudentPageByteacherId(PageTool<Student> page , String teacherId );
	
	/**
	 * 查询学生信息
	 * @param studentId
	 * @return
	 */
	JsonResult selectByPrimaryKey(String studentId);
}
