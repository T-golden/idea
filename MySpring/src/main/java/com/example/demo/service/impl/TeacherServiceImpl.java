package com.example.demo.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.StudentAccountDao;
import com.example.demo.dao.StudentDao;
import com.example.demo.dao.TeacherAccountDao;
import com.example.demo.dao.TeacherDao;
import com.example.demo.model.JsonResult;
import com.example.demo.model.Student;
import com.example.demo.model.StudentAccount;
import com.example.demo.model.Teacher;
import com.example.demo.model.TeacherAccount;
import com.example.demo.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherAccountDao teacherAccountDao;
	@Autowired
	private TeacherDao teacherDao;
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private StudentAccountDao studentAccountDao;

	/**
	 * 教师登录
	 */
	@Override
	public TeacherAccount teacherLogin(String account, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("account", account);
		map.put("password", password);
		TeacherAccount teacherAccount = teacherAccountDao.selectByaccount(map);
		return teacherAccount;
	}

	@Override
	public JsonResult selectFiveTeacher() {
		JsonResult jsonResult = new JsonResult();
		List<Teacher> teacherList = teacherDao.selectFiveTeacher();
		jsonResult.setData(teacherList);
		jsonResult.setMsg("教师信息");
		jsonResult.setStatus(0);
		return jsonResult;
	}
	
	/**
	 * 获取教师信息
	 */
	@Override
	public JsonResult getTeacherInfo(String teacherId) {
		JsonResult jsonResult = new JsonResult();
		Teacher teacher = teacherDao.selectByPrimaryKey(teacherId);
		if(teacher != null) {
			jsonResult.setStatus(0);
			jsonResult.setMsg("教师个人信息");
			jsonResult.setData(teacher);
		}else {
			jsonResult.setData(null);
			jsonResult.setStatus(1);
			jsonResult.setMsg("教师信息不存在！");
		}
		return jsonResult;
	}

	@Override
	public JsonResult updateTeacherInfo(Teacher teacher , MultipartFile file) {
		JsonResult jsonResult = new JsonResult();
		boolean b = teacherDao.updateById(teacher);
		if(b) {
			jsonResult.setMsg("教师信息修改成功！");
			jsonResult.setStatus(0);
		}else {
			jsonResult.setMsg("教师信息修改失败！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

	@Override
	public JsonResult updateStudentInfo(Student student , StudentAccount studentAccount) {
		JsonResult jsonResult = new JsonResult();
		studentAccount.setModifyTime(new Date());
		int i = studentAccountDao.updateStudentAccount(studentAccount);
		if(i>0){
			student.setModifyTime(studentAccount.getModifyTime());
			i = studentDao.updateStudent(student);
			if(i>0){
				jsonResult.setMsg("学生信息修改成功！");
				jsonResult.setStatus(0);
			}else{
				jsonResult.setMsg("学生信息修改失败！");
				jsonResult.setStatus(1);
			}
		}else{
			jsonResult.setMsg("学生账号信息修改失败！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

}
