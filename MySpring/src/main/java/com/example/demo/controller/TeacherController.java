package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@RequestMapping("")
	public String toIndex() {
		return "teacher/teacher_index";
	}
	
	/**
	 * 创建学生账号
	 * @return
	 */
	@RequestMapping("/toCreateStudent")
	public String toCreateStudent() {
		return "teacher/teacher_create_student";
	}
	
	/**
	 * 学生信息
	 * @return
	 */
	@RequestMapping("/toStudentInfo")
	public String toStudentInfo() {
		return "teacher/teacher_student_info";
	}
	
	/**
	 * 课程信息
	 * @return
	 */
	@RequestMapping("/tocourse")
	public String tocourse() {
		return "teacher/teacher_course";
	}
	
	/**
	 * 章节信息
	 * @return
	 */
	@RequestMapping("/toChapter")
	public String toChapter() {
		return "teacher/teacher_chapter";
	}
	
	/**
	 * 上传教程
	 * @return
	 */
	@RequestMapping("/toChapterUpload")
	public String toChapterUpload() {
		return "teacher/teacher_chapter_material_upload";
	}
	
	/**
	 * 教程信息
	 * @return
	 */
	@RequestMapping("/toChapterMaterial")
	public String toChapterMaterial() {
		return "teacher/teacher_chapter_material";
	}
	
	/**
	 * 作业上传
	 * @return
	 */
	@RequestMapping("/toAssignmentUpload")
	public String toAssignmentUpload() {
		return "teacher/teacher_assignment_upload";
	}
	
	/**
	 * 作业信息
	 * @return
	 */
	@RequestMapping("/toAssignmentInfo")
	public String toAssignmentInfo() {
		return "teacher/teacher_assignment_info";
	}
	
	/**
	 * 修改密码
	 * @return
	 */
	@RequestMapping("/toUpdatePass")
	public String toUpdatePass() {
		return "teacher/teacher_updatePass";
	}
	
	
	
	
	
	
	@RequestMapping("createStudent")
	public String createStudent(@RequestParam("teacherId") String teacherId , @RequestParam("num") int num , Model model) {
		return "";
	}
}
