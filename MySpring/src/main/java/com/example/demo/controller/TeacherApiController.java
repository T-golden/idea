package com.example.demo.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.JsonResult;
import com.example.demo.model.Teacher;
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
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = teacherService.getTeacherInfo(teacherId);
		} catch (Exception e) {
			jsonResult.setStatus(1);
			jsonResult.setMsg("教师信息获取异常");
		}
		return jsonResult;
	}
	
	/**
	 * 修改教师信息
	 * @param teacherId
	 * @param teacherName
	 * @param teacherPik
	 * @param teacherSex
	 * @param teacherAge
	 * @param teacherEmail
	 * @param teacherPhone
	 * @param teacherQQ
	 * @param request
	 * @return
	 */
	public JsonResult updataTeacherInfo(@RequestParam(value="teacherId") String teacherId , @RequestParam(value="teacherName", required=false) String teacherName , @RequestParam(value="teacherPik") String teacherPik , 
			@RequestParam(value="teacherSex",required=false) int teacherSex , @RequestParam(value="teacherAge",required=false) int teacherAge , @RequestParam(value="teacherEmail",required=false) String teacherEmail ,
			@RequestParam(value="teacherPhone",required=false) String teacherPhone , @RequestParam(value="teacherQQ",required=false) String teacherQQ , HttpServletRequest request) {
		JsonResult jsonResult = new JsonResult();
		Teacher teacher = new Teacher();
		teacher.setTeacherId(teacherId);
		teacher.setTeacherPik(teacherPik);
		teacher.setTeacherName(teacherName);
		teacher.setTeacherSex(teacherSex);
		teacher.setTeacherAge(teacherAge);
		teacher.setTeacherEmail(teacherEmail);
		teacher.setTeacherPhone(teacherPhone);
		teacher.setTeacherQQ(teacherQQ);
		teacher.setModifyTime(new Date());
		try {
			jsonResult = teacherService.updateTeacherInfo(teacher);
		} catch (Exception e) {
			jsonResult.setMsg("教师信息修改异常！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
}