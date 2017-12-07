package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@RequestMapping("toTeacher")
	public String toTeacher(@RequestParam ("teacherId") String teacherId ,Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_index";
	}

	/**
	 * 创建学生账号
	 * 
	 * @return
	 */
	@RequestMapping("/toCreateStudent")
	public String toCreateStudent(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_create_student";
	}

	/**
	 * 学生信息
	 * 
	 * @return
	 */
	@RequestMapping("/toStudentInfo")
	public String toStudentInfo(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_student_info";
	}
	
	/**
	 * 创建班级
	 * 
	 * @return
	 */
	@RequestMapping("/toCreateClass")
	public String toCreateClass(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_create_class";
	}
	
	/**
	 * 班级信息
	 * 
	 * @return
	 */
	@RequestMapping("/toClassInfo")
	public String toClassInfo(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_class_info";
	}

	/**
	 * 课程信息
	 * 
	 * @return
	 */
	@RequestMapping("/tocourse")
	public String tocourse(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_course";
	}

	/**
	 * 章节信息
	 * 
	 * @return
	 */
	@RequestMapping("/toChapter")
	public String toChapter(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_chapter";
	}

	/**
	 * 上传教程
	 * 
	 * @return
	 */
	@RequestMapping("/toChapterUpload")
	public String toChapterUpload(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_chapter_material_upload";
	}

	/**
	 * 教程信息
	 * 
	 * @return
	 */
	@RequestMapping("/toChapterMaterial")
	public String toChapterMaterial(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_chapter_material";
	}

	/**
	 * 作业上传
	 * 
	 * @return
	 */
	@RequestMapping("/toAssignmentUpload")
	public String toAssignmentUpload(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_assignment_upload";
	}

	/**
	 * 作业信息
	 * 
	 * @return
	 */
	@RequestMapping("/toAssignmentInfo")
	public String toAssignmentInfo(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_assignment_info";
	}

	/**
	 * 修改密码
	 * 
	 * @return
	 */
	@RequestMapping("/toUpdatePass")
	public String toUpdatePass(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_updatePass";
	}
}
