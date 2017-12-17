package com.example.demo.service;


import com.example.demo.model.Student;
import com.example.demo.model.StudentAccount;
import com.example.demo.util.PageTool;

public interface StudentService {
	
	StudentAccount studentLogin(String account , String password);
	
	PageTool<Student> selectStudentPageByteacherId(PageTool<Student> page , String teacherId );
}
