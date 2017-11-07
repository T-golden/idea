package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.ChapterKnowledgeExchange;
@Mapper
public interface ChapterKnowledgeExchangeDao {
	
	ChapterKnowledgeExchange selectByPrimaryKey(String studentId);

}
