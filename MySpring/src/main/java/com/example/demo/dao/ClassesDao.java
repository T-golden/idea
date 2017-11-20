package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Classes;
@Mapper
public interface ClassesDao {
	
	/**
	 * 查询班级信息
	 * @param classId
	 * @return
	 */
	Classes selectByPrimaryKey(String classId);
	
	/**
	 * 创建班级信息
	 * @param classes
	 * @return
	 */
	int createClass(Classes classes);
	
	/**
	 * 修改班级信息
	 * @param classId
	 * @return
	 */
	int updateClassById(String classId);
	
	/**
	 * 删除班级信息
	 * @param classId
	 * @return
	 */
	int deleteClass(String classId);
}
