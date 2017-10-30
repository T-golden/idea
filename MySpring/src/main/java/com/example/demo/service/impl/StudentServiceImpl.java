package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentAccountDao;
import com.example.demo.model.StudentAccount;
import com.example.demo.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentAccountDao studentAccountDao;

	@Override
	public StudentAccount studentLogin(String account, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("account", account);
		map.put("password", password);
		StudentAccount studentAccount = studentAccountDao.selectByaccount(map);
		return studentAccount;
	}

}
