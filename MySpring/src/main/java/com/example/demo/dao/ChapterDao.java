package com.example.demo.dao;

import com.example.demo.model.Chapter;

public interface ChapterDao {
	Chapter selectByPrimaryKey(String chapterId);
}
