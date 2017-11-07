package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Chapter;
@Mapper
public interface ChapterDao {
	Chapter selectByPrimaryKey(String chapterId);
}
