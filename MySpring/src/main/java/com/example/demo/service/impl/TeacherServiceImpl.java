package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TeacherAccountDao;
import com.example.demo.dao.TeacherDao;
import com.example.demo.model.JsonResult;
import com.example.demo.model.Teacher;
import com.example.demo.model.TeacherAccount;
import com.example.demo.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherAccountDao teacherAccountDao;
	@Autowired
	private TeacherDao teacherDao;

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

}
