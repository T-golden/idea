package com.example.demo.service.impl;

import java.util.Date;
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

	@Override
	public JsonResult upateStudentInfo(Student student) {
		JsonResult jsonResult = new JsonResult();
		int i = studentDao.updateStudent(student);
		if(i>0){
			jsonResult.setMsg("学生信息修改成功");
			jsonResult.setStatus(0);
		}else{
			jsonResult.setMsg("学生信息修改失败");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
	
	@Override
	public JsonResult createStudentAccount(String teacherId , String classId , StudentAccount account , int num) {
		JsonResult jsonResult = new JsonResult();
		String Astr = account.getAccount();
		String Sstr = account.getStudentId();
		for(int i = 0; i < num ; i++) {
			account.setAccount(Astr+""+i);
			account.setStudentId(Sstr+""+i); 
			account.setCreateTime(new Date());
			account.setModifyTime(new Date());
			int j = studentAccountDao.insertStudentAccont(account);
			if(j>0) {
				Student student = new Student();
				student.setStudentId(account.getStudentId());
				student.setTeacherId(teacherId);
				student.setClassId(classId);
				student.setCreateTime(new Date());
				student.setModifyTime(new Date());
				int k = studentDao.insertStudent(student);
				if(k>0) {
					jsonResult.setStatus(0);
					jsonResult.setMsg("学生账号信息创建成功");
				}else {
					jsonResult.setStatus(1);
					jsonResult.setMsg("学生信息创建失败");
				}
			}else {
				jsonResult.setStatus(1);
				jsonResult.setMsg("学生账号信息创建失败");
			}
		}
		return jsonResult;
	}

	@Override
	public JsonResult deleteStudentAccount(String teacherId, String studentId) {
		JsonResult jsonResult = new JsonResult();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("teacherId",teacherId);
		map.put("studentId", studentId);
		int i = deleteStudent(map);
		if(i>0){
			i = studentAccountDao.deleteStudentAccount(map);
			if(i>0){
				jsonResult.setMsg("学生账号信息删除成功");
				jsonResult.setStatus(0);
			}else {
				jsonResult.setMsg("学生账号信息删除失败");
				jsonResult.setStatus(1);
			}
		}else{
			jsonResult.setMsg("学生信息删除失败");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

	@Override
	public int deleteStudent(Map<String, Object> map) {
		return studentDao.deleteStudent(map);
	}

}
