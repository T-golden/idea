package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.StudentAccount;
import com.example.demo.model.TeacherAccount;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;

@Controller
@RequestMapping("/")
public class HomeController {
	@Resource
	private TeacherService teacherService;
	@Resource
	private StudentService studentService;

	@RequestMapping()
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("tologin")
	public String tologinPage(@RequestParam("status") int status, Model model){
		model.addAttribute("status", status);
		return "login";
	}

	@RequestMapping("login")
	public String login(@RequestParam("status") int status, @RequestParam("account") String account, @RequestParam("password") String password, Model model) {
		if (status == 1) {
			TeacherAccount teacherAccount = teacherService.teacherLogin(account, password);
			model.addAttribute("teacherAccount", teacherAccount);
			return "teacher/teacher_index";
		} else if (status == 2) {
			StudentAccount studentAccount = studentService.studentLogin(account, password);
			model.addAttribute("studentAccount", studentAccount);
			return "student/student_index";
		}
		return "login";
	}
}
