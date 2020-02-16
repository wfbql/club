

function login(){
	$.ajax({
		type:"post",
		url:"user/login.do",
		data:{
			"username":$("#u").val(),
			"password":$("#p").val(),
		},
		success : function(result){
		    alert("hello world!")
            console.log(result);
            window.location.href="/club/pages/layout/top-nav.html";

		},
        error:function(){
            console.log("获取错误");
            return "error";
        },
        async:false
	});

/*    $.post("user/login.do",
        { "username":$("#u").val(),
            "password":$("#p").val()
        },
        function(result){
            console.log(result);
        }, "json");*/
}
