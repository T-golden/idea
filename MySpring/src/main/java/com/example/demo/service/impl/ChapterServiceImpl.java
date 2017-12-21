package com.example.demo.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ChapterDao;
import com.example.demo.model.Chapter;
import com.example.demo.model.JsonResult;
import com.example.demo.service.ChapterService;
import com.example.demo.util.PageTool;

@Service("chapterService")
public class ChapterServiceImpl implements ChapterService{
	
	@Autowired
	private ChapterDao chapterDao;

	@Override
	public JsonResult deleteChapter(String chapterId) {
		JsonResult jsonResult = new JsonResult();
		int i = chapterDao.deleteChapter(chapterId);
		if(i>0){
			jsonResult.setMsg("课程信息删除成功！");
			jsonResult.setStatus(0);
		}else{
			jsonResult.setMsg("课程信息删除失败！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

	@Override
	public JsonResult createChapter(Chapter chapter) {
		JsonResult jsonResult = new JsonResult();
		chapter.setCreateTime(new Date());
		chapter.setModifyTime(new Date());
		int i = chapterDao.createChapter(chapter);
		if(i>0){
			jsonResult.setMsg("课程信息创建成功！");
			jsonResult.setStatus(0);
		}else{
			jsonResult.setMsg("课程信息创建失败！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

	@Override
	public PageTool<Chapter> selectChapterPageByTeacherId(PageTool<Chapter> page, String teacherId) {
		Map<String, Object> map = new HashMap<>();
		int pageCount = chapterDao.getCount(teacherId);
		page.setTotalCount(pageCount);
		if(pageCount>0) {
			map.put("teacherId", teacherId);
			map.put("page", page);
			List<Chapter> chapterPage = chapterDao.selectChapterPageByTeacherId(map);page.setResult(chapterPage);
			page.setTotalCount(pageCount);
		}else {
			page.setResult(null);
		}
		return page;
	}

	@Override
	public JsonResult selectByCourseId(String courseId) {
		JsonResult jsonResult = new JsonResult();
		Chapter chapter = chapterDao.selectByCourseId(courseId);
		if(chapter!=null){
			jsonResult.setData(chapter);
			jsonResult.setMsg("查询章节信息成功");
			jsonResult.setStatus(0);
		}else{
			jsonResult.setData(null);
			jsonResult.setMsg("章节信息为空");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

	@Override
	public Chapter selectByPrimaryKey(String chapterId) {
		return chapterDao.selectByPrimaryKey(chapterId);
	}

	@Override
	public JsonResult updateChapter(Chapter chapter) {
		JsonResult jsonResult = new JsonResult();
		int i = chapterDao.updateChapter(chapter);
		if(i>0){
			jsonResult.setMsg("章节信息修改成功！");
			jsonResult.setStatus(0);
		}else{
			jsonResult.setMsg("章节信息修改失败！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}

}
