package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Classes;
@Mapper
public interface ClassesDao {
	
	/**
	 * 分页查询所有班级信息
	 * @param classId
	 * @return
	 */
	List<Classes> selectClassPage(Map<String, Object> map);
	
	/**
	 * 班级编号查询班级信息
	 * @param classId
	 * @return
	 */
	Classes selectByClassId(String classId);
	
	/**
	 * 查询教师下的班级信息
	 * @param teacherId
	 * @return
	 */
	List<Classes> selectByTeacherId(String teacherId);
	
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
