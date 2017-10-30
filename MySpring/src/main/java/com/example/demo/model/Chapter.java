package com.example.demo.model;

import java.util.Date;

public class Chapter {
	
	private int id;
	private String chapterId;
	private String chapterContext;
	private String courseId;
	private Date createTime;
	private Date modifyTime;
	
	public void chapter(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChapterId() {
		return chapterId;
	}

	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}

	public String getChapterContext() {
		return chapterContext;
	}

	public void setChapterContext(String chapterContext) {
		this.chapterContext = chapterContext;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

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
}
