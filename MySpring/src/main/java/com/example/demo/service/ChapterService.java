package com.example.demo.service;


import com.example.demo.model.Chapter;
import com.example.demo.model.JsonResult;
import com.example.demo.util.PageTool;

public interface ChapterService {
	
	/**
	 * 创建章节信息
	 * @param chapter
	 * @return
	 */
	JsonResult createChapter(Chapter chapter);
	
	/**
	 * 课程编号查询章节信息
	 * @param courseId
	 * @return
	 */
	JsonResult selectByCourseId(String courseId);
	
	/**
	 * 章节分页信息
	 * @param map
	 * @return
	 */
	PageTool<Chapter> selectChapterPageByTeacherId(PageTool<Chapter> page , String teacherId);

	/**
	 * 删除章节信息
	 * @param map
	 * @return
	 */
	JsonResult deleteChapter(String courseId , String chapterId);
}
