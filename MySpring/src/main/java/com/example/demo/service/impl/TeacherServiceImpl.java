package com.example.demo.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
			jsonResult.setStatus(1);
			jsonResult.setMsg("教师信息不存在！");
		}
		return jsonResult;
	}

	@Override
	public JsonResult updateTeacherInfo(Teacher teacher) {
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

}
