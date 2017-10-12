
$("#loginBtn").click(function(e){
	e.preventDefault();

	var uId=$("#uId").val();
	var uPwd=$("#uPwd").val();
	$("#loginAlert").show();
	if(uId=="" ||uPwd =="" ){
		
		if($('#loginAlert #alertRes').length == 1){
			$('#alertRes').remove();
		}
		
		if($('#alertbarLogin').length == 0){
			$("#loginAlert").append('<div id="alertbarLogin" class="alertbar">');
		}
		$("#alertbarLogin").text("All fields are mandatory can't be blank.");
		return;
	}
	var data="uId="+uId+"&uPwd="+uPwd;
	makeAjaxCall("login", "#loginAlert", "POST", data);
	
});



$("#uId,#uPwd").change(function() {
	$('#alertbarLogin').css('background','red');
	$("#loginAlert").hide();
});

$("#name,#password,#role,#mobile").change(function() {
	$('#alertbarRegister').css('background','red');
	$("#registerAlert").hide();
});


$("#registeruserBtn").click(function(e){
	
	e.preventDefault();
	
	var name=$("#name").val();
	var password=$("#password").val();
	var role=$('select[name=role]').val();
	var mobile=$("#mobile").val();	
	$("#registerAlert").show();
	
	if(mobile=="" || name=="" || role=="" || password==""){
		if($('#registerAlert #alertRes').length == 1){
			$('#alertRes').remove();
		}
		
		if($('#alertbarRegister').length == 0){
			$("#registerAlert").append('<div id="alertbarRegister" class="alertbar">');
		}
		$("#alertbarRegister").text("All fields are mandatory can't be blank.");
		return;
	}
	
	var data="name="+name+"&password="+password+"&role="+role+"&mobile="+mobile;
	makeAjaxCall("registerUser", "#registerAlert","POST",data);
	$("#name").val("");
	$("#password").val("");
	$('select[name=role]').val();
	$("#mobile").val("");	
});


$("#searchTeacher").click(function(e){
	makeAjaxCall("SearchTeacher.jsp", "#mainContent","GET","");
});

$("#techrSetProfile").click(function(e){
	makeAjaxCall("TeacherProfile.jsp", "#mainContent","GET","");
});


$("#tchrSaveProfile").click(function(e){
	e.preventDefault();
	var maxStudent=$("#maxStudent").val();
	
	if(maxStudent==undefined || maxStudent==""){
		$('#err').text("Max Student is required field..");
		return;
	}
	var subject=$('select[name=subject]').val();
	var data="subject="+subject+"&maxStudent="+maxStudent;
	makeAjaxCall("saveTeacherProfile", "#mainContent","POST",data);
});


$("#tchrAllStd").click(function(e){
	var data='action=teacherPage';
	makeAjaxCall("allStudent", "#mainContent","GET",data);
});

$("#stdAlltchr").click(function(e){
	var data='action=studentPage';
	makeAjaxCall("allStudent", "#mainContent","GET",data);
});



$("#srchTchr").click(function(e){
	e.preventDefault();
	
	var subject=$('select[name=subject]').val();
	var data="subject="+subject;
	makeAjaxCall("searchTeacher", "#mainContent","POST",data);
});




$(".teacherRequest").click(function(e){
	e.preventDefault();
	var tid=$(this).attr('tid');
	var subjectType=$(this).attr('subjectType');
	
	var data="tid="+tid+"&subjectType="+subjectType;
	makeAjaxCall("requestTeacher", "#mainContent","POST",data);
});



$("#getTeacherNotification").click(function(e){
	e.preventDefault();
	
	var data="action=teacher";
	makeAjaxCall("notification", "#mainContent","POST",data);
});


$("#getStudentNotification").click(function(e){
	e.preventDefault();
	
	var data="action=student";
	makeAjaxCall("notification", "#mainContent","POST",data);
});


$(".teacherReject").click(function(e){
	e.preventDefault();
	var sendTo=$(this).attr('sendTo');
	var course=$(this).attr('course');
	var action="reject";
	var data="sendTo="+sendTo+"&action="+action+"&course="+course;
	makeAjaxCall("notificationDetail", "#mainContent","POST",data);
});

$(".teacherApproved").click(function(e){
	e.preventDefault();
	var sendTo=$(this).attr('sendTo');
	var course=$(this).attr('course');
	var action="approved";
	var data="sendTo="+sendTo+"&action="+action+"&course="+course;
	makeAjaxCall("notificationDetail", "#mainContent","POST",data);
});


function makeAjaxCall(url,id,method,data){
	
	if(method==undefined || method=="")
		method="GET";
	
	if(data==undefined || data==""){
		data="";
	}
	
	 $.ajax({
		 	type: method,
		 	url: url, 
		 	data:data,
		 	success: function(result){
	        $(id).html(result);
	    },
	    error: function(XMLHttpRequest, textStatus, errorThrown) { 
	        alert("Status: " + textStatus+" "+"Error: " + errorThrown);
	    }    
	    });
}
