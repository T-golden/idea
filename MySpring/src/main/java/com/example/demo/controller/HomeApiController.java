package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.JsonResult;
import com.example.demo.service.TeacherService;

@Controller
@RequestMapping("/homeApi")
public class HomeApiController {
	@Autowired
	private TeacherService teacherService;
	
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
}