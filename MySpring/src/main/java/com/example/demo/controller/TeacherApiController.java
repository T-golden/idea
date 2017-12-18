package com.example.demo.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Classes;
import com.example.demo.model.Course;
import com.example.demo.model.JsonResult;
import com.example.demo.model.Student;
import com.example.demo.model.StudentAccount;
import com.example.demo.model.Teacher;
import com.example.demo.service.ClassesService;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;
import com.example.demo.util.PageTool;

@Controller
@RequestMapping("/teacherApi")
public class TeacherApiController {
	
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private ClassesService classesService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private StudentService studentService;
	PageTool<Classes> classPage = new PageTool<Classes>(10);
	PageTool<Student> studentPage = new PageTool<Student>(10);
	PageTool<Course> coursePage = new PageTool<Course>(10);
	
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
	public JsonResult updateTeacherInfo(@RequestParam("teacherId") String teacherId , Teacher teacher , @RequestParam("teacherPik") MultipartFile teacherPik , HttpServletRequest request) {
		JsonResult jsonResult = new JsonResult();
		System.out.println(teacherPik);
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
		try {
			jsonResult = classesService.selectByClassId(classId);
		} catch (Exception e) {
			jsonResult.setMsg("班级信息异常！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
	
	/**
	 * 分页班级信息
	 * @param pageno
	 * @param teacherId
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getClassPageByTeacherId")
	@ResponseBody
	public PageTool<Classes> getClassPageByTeacherId(@RequestParam(value="pageno",defaultValue = "1") int pageno , @RequestParam("teacherId") String teacherId , HttpServletRequest request ){
		classPage.setPageNo(pageno);
		classPage = classesService.selectPageByteacherId(classPage, teacherId);
		return classPage;
	}
	
	/**
	 * 分页学生信息
	 * @param pageno
	 * @param teacherId
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getStudentPageByTeacherId")
	@ResponseBody
	public PageTool<Student> getStudentPageByTeacherId(@RequestParam(value="pageno",defaultValue = "1") int pageno , @RequestParam("teacherId") String teacherId , HttpServletRequest request ){
		studentPage.setPageNo(pageno);
		studentPage = studentService.selectStudentPageByteacherId(studentPage, teacherId);
		return studentPage;
	}
	
	/**
	 * 创建学生账号信息
	 * @param teacherId
	 * @param classId
	 * @param studentAccount
	 * @param classNum
	 * @param request
	 * @return
	 */
	@RequestMapping(value="createStudentAccount")
	@ResponseBody
	public JsonResult createStudentAccount(@RequestParam("teacherId") String teacherId , @RequestParam("classId") String classId , StudentAccount studentAccount , @RequestParam("classNum") int classNum , HttpServletRequest request) {
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = teacherService.createStudentAccount(teacherId, classId , studentAccount, classNum);
		} catch (Exception e) {
			jsonResult.setStatus(1);
			jsonResult.setMsg("学生账号信息创建异常");
		}
		return jsonResult;
	}
	
	/**
	 * 班级编号查询学生信息
	 * @return
	 */
	@RequestMapping(value="selectStudentByClassId")
	@ResponseBody
	public JsonResult selectStudentByClassId(@RequestParam("classId") String classId , HttpServletRequest request){
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = studentService.selectStudentByClassId(classId);
		} catch (Exception e) {
			jsonResult.setMsg("学生信息查询异常");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
	
	//创建课程信息
	@RequestMapping(value="createCourse")
	@ResponseBody
	public JsonResult createCourse(@RequestParam("teacherId") String teacherId , Course course , HttpServletRequest request) {
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = courseService.createCourse(course);
		} catch (Exception e) {
			jsonResult.setMsg("课程信息创建异常！");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
	
	/**
	 * 分页课程信息
	 * @param pageno
	 * @param teacherId
	 * @param request
	 * @return
	 */
	@RequestMapping(value="selectCoursePageByTeacherId")
	@ResponseBody
	public PageTool<Course> selectCoursePageByTeacherId(@RequestParam(value="pageno",defaultValue = "1") int pageno , @RequestParam("teacherId") String teacherId , HttpServletRequest request ){
		coursePage.setPageNo(pageno);
		coursePage = courseService.selectCoursePageByTeacherId(coursePage, teacherId);
		return coursePage;
	}
	
	/**
	 * 删除学生账号信息
	 * 先删除学生信息
	 * 再删除账号信息
	 * @param teacherId
	 * @param studentId
	 * @param request
	 * @return
	 */
	@RequestMapping(value="deleteStudentAccount")
	@ResponseBody
	public JsonResult deleteStudentAccount(@RequestParam("teacherId") String teacherId , @RequestParam("studentId") String studentId , HttpServletRequest request ){
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = teacherService.deleteStudentAccount(teacherId, studentId);
		} catch (Exception e) {
			jsonResult.setMsg("学生账号信息删除异常");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
	
	/**
	 * 删除班级信息
	 * @param classId
	 * @param request
	 * @return
	 */
	@RequestMapping(value="deleteClassByClassId")
	@ResponseBody
	public JsonResult deleteClassByClassId(@RequestParam("classId") String classId ,  HttpServletRequest request ){
		JsonResult jsonResult = new JsonResult();
		try {
			jsonResult = classesService.deleteClass(classId);
		} catch (Exception e) {
			jsonResult.setMsg("班级信息删除异常");
			jsonResult.setStatus(1);
		}
		return jsonResult;
	}
}