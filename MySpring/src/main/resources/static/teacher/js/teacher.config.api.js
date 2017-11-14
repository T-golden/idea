var basePath = "http://localhost:8081/";
var teacherId = $("#teacherId").val();

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
