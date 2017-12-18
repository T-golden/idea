package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentAccountDao;
import com.example.demo.dao.StudentDao;
import com.example.demo.model.JsonResult;
import com.example.demo.model.Student;
import com.example.demo.model.StudentAccount;
import com.example.demo.service.StudentService;
import com.example.demo.util.PageTool;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentAccountDao studentAccountDao;
	@Autowired
	private StudentDao studentDao;

	@Override
	public StudentAccount studentLogin(String account, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("account", account);
		map.put("password", password);
		StudentAccount studentAccount = studentAccountDao.selectByaccount(map);
		return studentAccount;
	}

	@Override
	public PageTool<Student> selectStudentPageByteacherId(PageTool<Student> page, String teacherId) {
		Map<String, Object> map = new HashMap<>();
		int pageCount = studentDao.getCount(teacherId);
		page.setTotalCount(pageCount);
		if(pageCount>0) {
			map.put("teacherId", teacherId);
			map.put("page", page);
			List<Student> studentPage = studentDao.selectStudentPageByteacherId(map);
			
			page.setResult(studentPage);
			page.setTotalCount(pageCount);
		}else {
			page.setResult(null);
		}
		return page;
	}

	@Override
	public JsonResult selectByPrimaryKey(String studentId) {
		JsonResult jsonResult = new JsonResult();
		Student student = studentDao.selectByPrimaryKey(studentId);
		if(student != null) {
			jsonResult.setMsg("学生信息");
			jsonResult.setStatus(0);
			jsonResult.setData(student);
		}else {
			jsonResult.setMsg("学生信息不存在");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

	@Override
	public JsonResult selectStudentByClassId(String classId) {
		JsonResult jsonResult = new JsonResult();
		System.out.println(classId);
		List<Student> studentList = studentDao.selectByClassId(classId);
		if(studentList.size() >0){
			jsonResult.setData(studentList);
			jsonResult.setMsg("学生信息");
			jsonResult.setStatus(0);
		}else{
			jsonResult.setData(null);
			jsonResult.setMsg("无学生信息");
			jsonResult.setStatus(0);
		}
		return jsonResult;
	}

}
