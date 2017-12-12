var basePath = "http://localhost:8081/";
var teacherId = $("#teacherId").val();

//1.
$("#toCreateStudent").click(function(){
	var url =  basePath + "teacher/toCreateStudent?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})

//2.
$("#toStudentInfo").click(function(){
	var url =  basePath + "teacher/toStudentInfo?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})

//3.
$("#toCreateCourse").click(function(){
	var url =  basePath + "teacher/toCreateCourse?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
//4.
$("#toCreateChapter").click(function(){
	var url =  basePath + "teacher/toCreateChapter?teacherId=" + teacherId ;
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
//8.
$("#toAssignmentInfo").click(function(){
	var url =  basePath + "teacher/toAssignmentInfo?teacherId=" + teacherId ;
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
$("#toTeacher").click(function(){
	var url =  basePath + "teacher/toTeacher?teacherId=" + teacherId ;
	window.location.href=url;
})
//11.
$("#toCreateClass").click(function(){
	var url =  basePath + "teacher/toCreateClass?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
//12.
$("#toClassInfo").click(function(){
	var url =  basePath + "teacher/toClassInfo?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})









	 