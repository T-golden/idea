package com.example.demo.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Teacher;

@Mapper
public interface TeacherDao {

	List<Teacher> selectFiveTeacher();
	
	List<Teacher> getTeacherPage(Map<String, Object> map);
	
	int getAllConut();
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
