var basePath = "http://localhost:8081/";
var teacherId = $("#teacherId").val();


//增
$("#toCreateClass").click(function(){
	var url =  basePath + "teacher/toCreateClass?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
$("#toCreateStudent").click(function(){
	var url =  basePath + "teacher/toCreateStudent?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
$("#toCreateCourse").click(function(){
	var url =  basePath + "teacher/toCreateCourse?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
$("#toCreateChapter").click(function(){
	var url =  basePath + "teacher/toCreateChapter?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})


//查
$("#toTeacherInfo").click(function(){
	var url =  basePath + "teacher/toTeacherInfo?teacherId=" + teacherId ;
	window.location.href=url;
})
$("#toClassInfo").click(function(){
	var url =  basePath + "teacher/toClassInfo?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
//12.
$("#toStudentInfo").click(function(){
	var url =  basePath + "teacher/toStudentInfo?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
$("#toCourseInfo").click(function(){
	var url =  basePath + "teacher/toCourseInfo?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
$("#toChapterInfo").click(function(){
	var url =  basePath + "teacher/toChapterInfo?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
//8.
$("#toAssignmentInfo").click(function(){
	var url =  basePath + "teacher/toAssignmentInfo?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})




//5.
$("#toChapterUpload").click(function(){
	var url =  basePath + "teacher/toChapterUpload?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
//6.
$("#toChapterMaterial").click(function(){
	var url =  basePath + "teacher/toChapterMaterial?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
//7.
$("#toAssignmentUpload").click(function(){
	var url =  basePath + "teacher/toAssignmentUpload?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})


//9.
$("#toUpdatePass").click(function(){
	var url =  basePath + "teacher/toUpdatePass?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
//10.











	 