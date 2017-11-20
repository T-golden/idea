package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.ChapterMaterial;
@Mapper
public interface ChapterMaterialDao {
	
	/**
	 * 查询章节资料
	 * @param chapterMaterialId
	 * @return
	 */
	ChapterMaterial selectByPrimaryKey(String chapterMaterialId);
	
	/**
	 * 添加章节资料
	 * @param chapterMaterial
	 * @return
	 */
	int createChapterMaterial(ChapterMaterial chapterMaterial);
	
	/**
	 * 修改章节资料信息
	 * @param chapterMaterialId
	 * @return
	 */
	int updateChapterMaterial(String chapterMaterialId);
	
	/**
	 * 删除章节资料哦信息
	 * @param chapterMaterialId
	 * @return
	 */
	int deleteChapterMaterial(String chapterMaterialId);
}
