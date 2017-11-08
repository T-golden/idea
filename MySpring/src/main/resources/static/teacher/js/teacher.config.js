var basePath = "http://localhost:8081/";
var teacherId = $("#teacherId").val();
console.log(teacherId);

$(function(){
	getTeacherInfo();
})

function getTeacherInfo(){
	$.ajax({
		   type : "get",  //提交方式  
		   url :  basePath+"teacherApi/getTeacherInfo?teacherId="+teacherId,	//路径  
		   async:true,    //或false,是否异步
		   data : "jsonResult",//数据，这里使用的是Json格式进行传输  
		   success : function(res) {//返回数据根据结果进行相应的处理 
			   var data = res.data;
			   $(".teacherId").text(data.teacherId);
			   $(".teacherName").text(data.teacherName);
			   var teacherSex = data.teacherSex;
			   if(teacherSex == 1){
				   $(".teacherSexVal").text("男");
			   }
			   if(teacherSex == 2){
				   $(".teacherSexVal").text("女");
			   }
			   $(".teacherAge").text(data.teacherAge);
			   
			   $(".teacherEmail").text(data.teacherEmail);
			   $(".teacherPhone").text(data.teacherPhone);
			   $(".teacherQQ").text(data.teacherQQ);
			   
			   
			   var createTime = new Date(data.createTime);
			   var _createTime = createTime.getFullYear() + '-' + (createTime.getMonth() + 1) + '-' + createTime.getDate() + ' ' + createTime.getHours() + ':' + createTime.getMinutes() + ':' + createTime.getSeconds();
			   var modifyTime = new Date(data.modifyTime);
			   var _modifyTime = modifyTime.getFullYear() + '-' + (modifyTime.getMonth() + 1) + '-' + modifyTime.getDate() + ' ' + modifyTime.getHours() + ':' + modifyTime.getMinutes() + ':' + modifyTime.getSeconds();
			   $(".createTime").text(_createTime);
			   $(".modifyTime").text(_modifyTime);
		   }
	});
}
//1.
$("#toCreateStudent").click(function(){
	var url =  basePath + "teacher/toCreateStudent?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
//	$.ajax({
//		type : "get", 
//		url : url, 
//		data : "", 
//		async : false,   //注意：此处是同步，不是异步
//		success : function(data){ 
//			if(data =="delete"){
//	　　　　　　　　window.location.href="/regist_sys/sectionInfo";//需要跳转的地址
//	　　　　　　}
//	　　   　　} 
//	　　   }); 
//	});
})

//2.
$("#toStudentInfo").click(function(){
	var url =  basePath + "teacher/toStudentInfo?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})

//3.
$("#tocourse").click(function(){
	var url =  basePath + "teacher/tocourse?teacherId=" + teacherId ;
	console.log(url);
	window.location.href=url;
})
//4.
$("#toChapter").click(function(){
	var url =  basePath + "teacher/toChapter?teacherId=" + teacherId ;
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
$("#toteacher").click(function(){
	var url =  basePath + "teacher/index?teacherId=" + teacherId ;
	console.log(url);
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









	 