package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.JsonResult;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("/studentApi")
public class StudentApiController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="getStudentInfo")
	@ResponseBody
	public JsonResult getStudentInfo(@RequestParam("studentId") String studentId , HttpServletRequest request) {
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = studentService.selectByPrimaryKey(studentId);
		} catch (Exception e) {
			jsonResult.setMsg("学生信息查询异常");
			jsonResult.setStatus(0);
		}
		return jsonResult;
	}
}