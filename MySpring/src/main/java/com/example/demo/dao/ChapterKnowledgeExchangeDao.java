package com.example.demo.dao;

import com.example.demo.model.ChapterKnowledgeExchange;

public interface ChapterKnowledgeExchangeDao {
	
	ChapterKnowledgeExchange selectByPrimaryKey(String studentId);

}
