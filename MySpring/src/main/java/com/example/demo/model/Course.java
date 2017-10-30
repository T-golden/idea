package com.example.demo.model;

import java.util.Date;

public class Course {
	
	private int id;
	private String courseId;
	private String courseName;
	private String courseContext;
	private Date courseBeginTime;
	private Date courseOverTime;
	private String teacherId;
	private Date createTime;
	private Date modifyTime;

	public void course() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseContext() {
		return courseContext;
	}

	public void setCourseContext(String courseContext) {
		this.courseContext = courseContext;
	}

	public Date getCourseBeginTime() {
		return courseBeginTime;
	}

	public void setCourseBeginTime(Date courseBeginTime) {
		this.courseBeginTime = courseBeginTime;
	}

	public Date getCourseOverTime() {
		return courseOverTime;
	}

	public void setCourseOverTime(Date courseOverTime) {
		this.courseOverTime = courseOverTime;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
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
