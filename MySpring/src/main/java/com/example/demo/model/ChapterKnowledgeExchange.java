package com.example.demo.model;

import java.util.Date;

public class ChapterKnowledgeExchange {
	private int id;
	private String knowledgeContext;
	private String chapterId;
	private String studentId;
	private Date createTime;
	private Date modifyTime;
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public void chapterKnowledgeExchange(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKnowledgeContext() {
		return knowledgeContext;
	}

	public void setKnowledgeContext(String knowledgeContext) {
		this.knowledgeContext = knowledgeContext;
	}

	public String getChapterId() {
		return chapterId;
	}

	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}
