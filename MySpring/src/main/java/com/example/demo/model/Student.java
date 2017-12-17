package com.example.demo.model;

import java.util.Date;

/**
 * 学生
 * @author john
 *
 */
public class Student {

	private int id;
	private String studentId;
	private String studentName;
	private String studentPik;
	private int studentSex;
	private String studentEmail;
	private String studentPhone;
	private String studentQQ;
	private String teacherId;
	private String classId;
	private Date createTime;
	private Date modifyTime;
	
	private String teacherName;
	private String className;

	public void student() {

	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPik() {
		return studentPik;
	}

	public void setStudentPik(String studentPik) {
		this.studentPik = studentPik;
	}

	public int getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(int studentSex) {
		this.studentSex = studentSex;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
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

	public String getStudentQQ() {
		return studentQQ;
	}

	public void setStudentQQ(String studentQQ) {
		this.studentQQ = studentQQ;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
