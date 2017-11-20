package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.ChapterKnowledgeExchange;
@Mapper
public interface ChapterKnowledgeExchangeDao {
	
	/**
	 * 查询知识点信息
	 * @param studentId
	 * @return
	 */
	ChapterKnowledgeExchange selectByPrimaryKey(String studentId);
	
	/**
	 * 添加知识点信息
	 * @param chapterKnowledgeExchange
	 * @return
	 */
	int createKnowledge(ChapterKnowledgeExchange chapterKnowledgeExchange);
	
	/**
	 * 修改知识点信息
	 * @param studentId
	 * @return
	 */
	int updateKnowledge(String studentId);
	
	/**
	 * 删除知识点信息
	 * @param studentId
	 * @return
	 */
	int deleteKnowledge(String studentId);
}
