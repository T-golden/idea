package com.example.demo.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Classes;
import com.example.demo.model.JsonResult;
import com.example.demo.model.Teacher;
import com.example.demo.service.ClassesService;
import com.example.demo.service.TeacherService;

@Controller
@RequestMapping("/teacherApi")
public class TeacherApiController {
	
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private ClassesService classesService;
	
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
	@RequestMapping(value="updateTeacherInfo")
	@ResponseBody
	public JsonResult updateTeacherInfo(@RequestParam("teacherId") String teacherId , Teacher teacher , HttpServletRequest request) {
		JsonResult jsonResult = new JsonResult();
		teacher.setModifyTime(new Date());
		try {
			jsonResult = teacherService.updateTeacherInfo(teacher);
		} catch (Exception e) {
			jsonResult.setMsg("教师信息修改异常！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
	
	/**
	 * 创建班级信息
	 * @param teacherId
	 * @param classes
	 * @param request
	 * @return
	 */
	@RequestMapping(value="createClass")
	@ResponseBody
	public JsonResult createClass(@RequestParam("teacherId") String teacherId , Classes classes , HttpServletRequest request) {
		JsonResult jsonResult = new JsonResult();
		System.out.println(classes.getTeacherId() + ":::" + classes.getClassId() + ":::" + classes.getClassName() + ":::" + classes.getClassNum());
		try {
			jsonResult = classesService.createClass(classes);
		} catch (Exception e) {
			jsonResult.setMsg("班级信息创建异常！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
	
	/**
	 * 教师编号下班级信息
	 * @param teacherId
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getClassInfoByTeacherId")
	@ResponseBody
	public JsonResult getClassInfoByTeacherId(@RequestParam("teacherId") String teacherId ,HttpServletRequest request) {
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = classesService.selectByTeacherId(teacherId);
		} catch (Exception e) {
			jsonResult.setMsg("班级信息异常！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
	
	/**
	 * 班级信息
	 * @param classId
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getClassInfoByClassId")
	@ResponseBody
	public JsonResult getClassInfoByClassId(@RequestParam("classId") String classId ,HttpServletRequest request) {
		JsonResult jsonResult = new JsonResult();
		System.out.println(classId);
		try {
			jsonResult = classesService.selectByClassId(classId);
		} catch (Exception e) {
			jsonResult.setMsg("班级信息异常！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
}