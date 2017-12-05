package com.example.demo.dao;


import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Teacher;

@Mapper
public interface TeacherDao {
	/**
	 * 查询教师信息
	 * @param teacherId
	 * @return
	 */
	Teacher selectByPrimaryKey(String teacherId);
	
	/**
	 * 修改教师信息
	 * @param teacher
	 * @return
	 */
	boolean updateById(Teacher teacher);
	
	/**
	 * 添加教师信息
	 * @param teacher
	 * @return
	 */
	int insertTeacherInfo(Teacher teacher);
	
	/**
	 * 删除教师信息
	 * @param teacher
	 * @return
	 */
	int deleteTeacherInfo(Teacher teacher);
}
