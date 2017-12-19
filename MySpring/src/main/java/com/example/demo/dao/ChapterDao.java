package com.example.demo.dao;

import java.util.List;
import java.util.Map;

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
	 * 课程编号查询章节信息
	 * @param courseId
	 * @return
	 */
	Chapter selectByCourseId(String courseId);
	
	/**
	 * 章节分页信息
	 * @param map
	 * @return
	 */
	List<Chapter> selectChapterPageByTeacherId(Map<String, Object> map);
	
	int getCount(String teacherId);
	
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
	int updateChapter(Chapter chapter);
	
	/**
	 * 删除章节信息
	 * @param chapterId
	 * @return
	 */
	int deleteChapter(Map<String, Object> map);
}
