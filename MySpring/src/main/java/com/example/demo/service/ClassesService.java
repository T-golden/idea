package com.example.demo.service;

import com.example.demo.model.Classes;
import com.example.demo.model.JsonResult;
import com.example.demo.util.PageTool;

public interface ClassesService {
	/**
	 * 分页查询所有班级信息
	 * @param classId
	 * @return
	 */
	PageTool<Classes> selectPageByteacherId(PageTool<Classes> page , String teacherId );
	
	/**
	 * 班级编号查询班级信息
	 * @param classId
	 * @return
	 */
	JsonResult selectByClassId(String classId);
	
	/**
	 * 查询教师下的班级信息
	 * @param teacherId
	 * @return
	 */
	JsonResult selectByTeacherId(String teacherId);
	
	/**
	 * 创建班级信息
	 * @param classes
	 * @return
	 */
	JsonResult createClass(Classes classes);
	
	/**
	 * 修改班级信息
	 * @param classId
	 * @return
	 */
	JsonResult updateClassById(Classes classes);
	
	/**
	 * 删除班级信息
	 * @param classId
	 * @return
	 */
	JsonResult deleteClass(String classId);
	
	/**
	 * 获取班级对象信息
	 * @param classId
	 * @return
	 */
	Classes selectClassesByClassId(String classId);
}
