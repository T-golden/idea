package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.JsonResult;
import com.example.demo.service.TeacherService;

@Controller
@RequestMapping("/teacherApi")
public class TeacherApiController {
	
	@Autowired
	private TeacherService teacherService;
	
	/**
	 * 查询教师个人信息
	 * @param teacherId
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getTeacherInfo")
	@ResponseBody
	public JsonResult getTeacherInfo(@RequestParam("teacherId") String teacherId , HttpServletRequest request) {
		System.out.println(teacherId);
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = teacherService.getTeacherInfo(teacherId);
		} catch (Exception e) {
			jsonResult.setStatus(1);
			jsonResult.setMsg("教师信息异常");
		}
		return jsonResult;
	}
}
