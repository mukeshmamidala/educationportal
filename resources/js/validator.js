function check()
{
	$("#loginAlert").show();
	
	if($('#alertbarLogin').length == 1){
		$('#alertbarLogin').remove();
	}
	
	if($('#alertbarLogin').length == 0){
		$("#loginAlert").append('<div id="alertbarLogin" class="alertbar" style="background:yellow" ><label id="err"></label></div>');
	}

	var message = $('#alertbarLogin #err')[0];

   var goodColor = "Green";
    var badColor = 'red';

    if(uId.value.length!=10){

    	//username.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Minimum 10 Digits are required !!";
    }
    if(uId.value.length==0){
    	
        message.innerHTML = "";
   }
  if(uId.value.length==10){
	  message.style.color = goodColor;
        message.innerHTML = "Correct";
   }
    
    if(uId.value.length>10){
    	 message.style.color = badColor;
         message.innerHTML = "More than 10 digits!";
    }

}

function checkReg()
{
	$("#registerAlert").show();
	
	if($('#alertbarRegister').length == 1){
		$('#alertbarRegister').remove();
	}
	
	if($('#alertbarRegister').length == 0){
		$("#registerAlert").append('<div id="alertbarRegister" style="background:yellow" class="alertbar"><label id="err"></label></div>');
	}
	

      var message = $('#alertbarRegister #err')[0];

   var goodColor = "Green";
    var badColor = 'red';

    if(mobile.value.length!=10){

    	//username.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Minimum 10 Digits are required !!";
    }
    if(mobile.value.length==0){
    	
        message.innerHTML = "";
   }
  if(mobile.value.length==10){
	  message.style.color = goodColor;
        message.innerHTML = "Correct";
   }
    
    if(mobile.value.length>10){
    	 message.style.color = badColor;
         message.innerHTML = "More than 10 digits!";
    }

}