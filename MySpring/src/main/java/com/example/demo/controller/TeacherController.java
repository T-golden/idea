package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Chapter;
import com.example.demo.model.Classes;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.model.StudentAccount;
import com.example.demo.service.ChapterService;
import com.example.demo.service.ClassesService;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;


@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private ClassesService classesService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private ChapterService chapterService;
	
	@RequestMapping("toTeacherInfo")
	public String toTeacherInfo(@RequestParam ("teacherId") String teacherId ,Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_info";
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
	 * 创建课程信息
	 * 
	 * @return
	 */
	@RequestMapping("/toCreateCourse")
	public String tocourse(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_create_course";
	}
	
	/**
	 * 创建章节信息
	 * 
	 * @return
	 */
	@RequestMapping("/toCreateChapter")
	public String toChapter(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_create_chapter";
	}
	
	/**
	 * 班级信息
	 * 
	 * @return
	 */
	@RequestMapping("/toClassInfo")
	public String toClassInfo(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_info_class";
	}


	/**
	 * 学生信息
	 * 
	 * @return
	 */
	@RequestMapping("/toStudentInfo")
	public String toStudentInfo(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_info_student";
	}
	
	/**
	 * 课程信息
	 * @param teacherId
	 * @param model
	 * @return
	 */
	@RequestMapping("/toCourseInfo")
	public String toCourseInfo(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_info_course";
	}
	
	/**
	 * 章节信息
	 * @param teacherId
	 * @param model
	 * @return
	 */
	@RequestMapping("/toChapterInfo")
	public String toChapterInfo(@RequestParam("teacherId") String teacherId , Model model) {
		model.addAttribute("teacherId", teacherId);
		return "teacher/teacher_info_chapter";
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
	 * 修改班级信息
	 * 
	 * @return
	 */
	@RequestMapping("/toUpdateClass")
	public String toUpdateClass(@RequestParam("teacherId") String teacherId , @RequestParam("classId") String classId , Model model) {
		Classes classes = classesService.selectClassesByClassId(classId);
		model.addAttribute("teacherId", teacherId);
		model.addAttribute("classes", classes);
		return "teacher/teacher_update_class";
	}
	
	/**
	 * 修改学生信息
	 * 
	 * @return
	 */
	@RequestMapping("/toUpdateStudent")
	public String toUpdateStudent(@RequestParam("teacherId") String teacherId , @RequestParam("studentId") String studentId , Model model) {
		Student student = studentService.selectStudentInfo(studentId);
		StudentAccount studentAccount = studentService.selectByStudentId(studentId);
		Classes classes = classesService.selectClassesByClassId(student.getClassId());
		model.addAttribute("teacherId", teacherId);
		model.addAttribute("student", student);
		model.addAttribute("studentAccount", studentAccount);
		model.addAttribute("classes", classes);
		return "teacher/teacher_update_student";
	}
	
	/**
	 * 修改课程信息
	 * @param courseId
	 * @param model
	 * @return
	 */
	@RequestMapping("/toUptateCourse")
	public String toUptateCourse(@RequestParam("teacherId") String teacherId , @RequestParam("courseId") String courseId , Model model){
		Course course = courseService.selectByCourseId(courseId);
		Classes classes = classesService.selectClassesByClassId(course.getClassId());
		model.addAttribute("teacherId", teacherId);
		model.addAttribute("course", course);
		model.addAttribute("classes", classes);
		return "teacher/teacher_update_course";
	}
	
	/**
	 * 修改章节信息
	 * @param teacherId
	 * @param chapterId
	 * @param model
	 * @return
	 */
	@RequestMapping("toUpdateChapter")
	public String toUpdateChapter(@RequestParam("teacherId") String teacherId , @RequestParam("chapterId") String chapterId , Model model){
		Chapter chapter = chapterService.selectByPrimaryKey(chapterId);
		Course course = courseService.selectByCourseId(chapter.getCourseId());
		model.addAttribute("teacherId", teacherId);
		model.addAttribute("chapter", chapter);
		model.addAttribute("course", course);
		return "teacher/teacher_update_chapter";
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
