package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.ChapterMaterial;
@Mapper
public interface ChapterMaterialDao {
	ChapterMaterial selectByPrimaryKey(String chapterMaterialId);
}
