package com.example.demo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClassesDao;
import com.example.demo.model.Classes;
import com.example.demo.model.JsonResult;
import com.example.demo.service.ClassesService;
import com.example.demo.util.PageTool;

@Service("classesService")
public class ClassesServiceImpl implements ClassesService{
	
	@Autowired
	private ClassesDao classDao;

	@Override
	public JsonResult selectPageByteacherId(String teacherId, int start, int pageSize) {
		JsonResult jsonResult = new JsonResult();
		PageTool<Classes> classPage =  classDao.selectPageByteacherId(teacherId, start, pageSize);
		jsonResult.setMsg("班级分页信息");
		jsonResult.setStatus(0);
		jsonResult.setData(classPage);
		return jsonResult;
	}
	
	@Override
	public JsonResult selectByClassId(String classId) {
		JsonResult jsonResult = new JsonResult();
		Classes classes = classDao.selectByClassId(classId);
		jsonResult.setMsg("班级信息");
		jsonResult.setStatus(0);
		jsonResult.setData(classes);
		return jsonResult;
	}
	
	@Override
	public JsonResult selectByTeacherId(String teacherId) {
		JsonResult jsonResult = new JsonResult();
		List<Classes> classesList = classDao.selectByTeacherId(teacherId);
		jsonResult.setMsg("教师班级信息!");
		jsonResult.setStatus(0);
		jsonResult.setData(classesList);
		return jsonResult;
	}

	@Override
	public JsonResult createClass(Classes classes) {
		JsonResult jsonResult = new JsonResult();
		System.out.println(classes.getTeacherId() + ":::" + classes.getClassId() + ":::" + classes.getClassName() + ":::" + classes.getClassNum());
		classes.setCreateTime(new Date());
		classes.setModifyTime(new Date());
		int i = classDao.createClass(classes);
		if(i>0) {
			jsonResult.setStatus(0);
			jsonResult.setMsg("班级创建成功！");
		}else {
			jsonResult.setStatus(0);
			jsonResult.setMsg("班级创建成功！");
		}
		return jsonResult;
	}

	@Override
	public JsonResult updateClassById(String classId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonResult deleteClass(String classId) {
		// TODO Auto-generated method stub
		return null;
	}







}
