package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Chapter;
@Mapper
public interface ChapterDao {
	
	/**
	 * 查询章节信息
	 * @param chapterId
	 * @return
	 */
	Chapter selectByPrimaryKey(String chapterId);
	
	/**
	 * 添加章节信息
	 * @param chapter
	 * @return
	 */
	int createChapter(Chapter chapter);
	
	/**
	 * 修改章节信息
	 * @param chapterId
	 * @return
	 */
	int updateChapter(String chapterId);
	
	/**
	 * 删除章节信息
	 * @param chapterId
	 * @return
	 */
	int deleteChapter(String chapterId);
}
