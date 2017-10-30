package com.example.demo.model;

import java.util.Date;

public class Teacher {
	private int id;
	private String teacherId;
	private String teacherPik;
	private String teacherName;
	private int teacherSex;
	private int teacherAge;
	private String teacherEmail;
	private String teacherPhone;
	private Date createTime;
	private Date modifyTime;

	public void teacher() {

	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherPik() {
		return teacherPik;
	}

	public void setTeacherPik(String teacherPik) {
		this.teacherPik = teacherPik;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getTeacherSex() {
		return teacherSex;
	}

	public void setTeacherSex(int teacherSex) {
		this.teacherSex = teacherSex;
	}

	public int getTeacherAge() {
		return teacherAge;
	}

	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
