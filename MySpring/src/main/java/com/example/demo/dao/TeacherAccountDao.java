package com.example.demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Teacher;
import com.example.demo.model.TeacherAccount;

@Mapper
public interface TeacherAccountDao {
	/**
	 * 编号查询教师账号信息
	 * @param teacherId
	 * @return
	 */
	TeacherAccount selectByPrimaryKey(String teacherId);

	/**
	 * 账号查询教师账号信息
	 * @param map
	 * @return
	 */
	TeacherAccount selectByaccount(Map<String, String> map);
	
	/**
	 * 修改教师账号信息
	 * @param teacherId
	 * @return
	 */
	int updateByteacherId(String teacherId);
	
	/**
	 * 添加教师账号信息
	 * @param teacher
	 * @return
	 */
	int insertAccount(Teacher teacher);
	
	/**
	 * 删除教师账号信息
	 * @param teacherId
	 * @return
	 */
	int deleteTeacherAccount(String teacherId);
}
