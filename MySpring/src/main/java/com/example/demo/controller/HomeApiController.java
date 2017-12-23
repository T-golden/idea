package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Course;
import com.example.demo.model.JsonResult;
import com.example.demo.model.Teacher;
import com.example.demo.service.CourseService;
import com.example.demo.service.TeacherService;
import com.example.demo.util.PageTool;

@Controller
@RequestMapping("/homeApi")
public class HomeApiController {
	
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private CourseService courseService;
	
	PageTool<Teacher> teacherPage = new PageTool<>();
	PageTool<Course> coursePage = new PageTool<>();
	
	@RequestMapping(value="getFiveTeacher")
	@ResponseBody
	public JsonResult getFiveTeacher() {
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = teacherService.selectFiveTeacher();
		} catch (Exception e) {
			jsonResult.setMsg("教师信息异常");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
	
	@RequestMapping(value="getSixCourse")
	@ResponseBody
	public JsonResult getSixCourse() {
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = courseService.selectSixCourse();
		} catch (Exception e) {
			jsonResult.setMsg("课程信息异常");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
	
	
	@RequestMapping(value="getTeacherPage")
	@ResponseBody
	public PageTool<Teacher> getTeacherPage(@RequestParam(value="pageno",defaultValue = "1") int pageno,HttpServletRequest request){
		teacherPage.setPageNo(pageno);
		teacherPage = teacherService.getTeacherPage(teacherPage);
		return teacherPage;
	}
}