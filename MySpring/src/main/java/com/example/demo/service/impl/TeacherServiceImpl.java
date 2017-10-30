package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TeacherAccountDao;
import com.example.demo.model.TeacherAccount;
import com.example.demo.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherAccountDao teacherAccountDao;

	@Override
	public TeacherAccount teacherLogin(String account, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("account", account);
		map.put("password", password);
		TeacherAccount teacherAccount = teacherAccountDao.selectByaccount(map);
		return teacherAccount;
	}

}
