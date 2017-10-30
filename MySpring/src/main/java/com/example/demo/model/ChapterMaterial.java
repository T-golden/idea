package com.example.demo.model;

import java.util.Date;

public class ChapterMaterial {
	
	private int id;
	private String chapterMaterialId;
	private String materialContext;
	private String chapterId;
	private String teacherId;
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

	public void chapterMaterial() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChapterMaterialId() {
		return chapterMaterialId;
	}

	public void setChapterMaterialId(String chapterMaterialId) {
		this.chapterMaterialId = chapterMaterialId;
	}

	public String getMaterialContext() {
		return materialContext;
	}

	public void setMaterialContext(String materialContext) {
		this.materialContext = materialContext;
	}

	public String getChapterId() {
		return chapterId;
	}

	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
}
