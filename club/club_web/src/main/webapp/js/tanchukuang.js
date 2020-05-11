$(function(){
	var $el = $('.dialog');
	$el.hDialog();
	
	//带标题的
	$('.demo0').hDialog({title: '测试弹框标题',height: 300});
	
	//改变宽度
	$('.demo1').hDialog({width: 500});
	
	//改变高度
	$('.demo2').hDialog({height: 400});
	
	//改变宽和高
	$('.demo3').hDialog({width:600,height: 500});
	
	//改变位置
	$('.demo4').hDialog({positions: 'top'});
	
	//不清空表单
	$('.demo5').hDialog({resetForm: false});
	
	//遮罩不可关闭
	$('.demo6').hDialog({modalHide: false});
	
	//改变弹框背景色
	$('.demo7').hDialog({boxBg: '#eeeeee'});
	
	//改变遮罩背景色
	$('.demo8').hDialog({modalBg: 'rgba(255,255,255,0.7)'});
	
	//改变关闭背景色
	$('.demo9').hDialog({closeBg: '#4A74B5'});
	
	//错误文字提示
	$('.demo10').click(function(){
		$.tooltip('My God, 出错啦！！！');
	});
	
	//正确文字提示
	$('.demo11').click(function(){
		$.tooltip('OK, 操作成功！', 2500, true);
	});
	
	//显示加载
	$('.demo12').click(function(){
		//自定义文字： $.showLoading('玩命加载中...');
		//自定义宽高： $.showLoading('努力加载中...',140,40);
		$.showLoading();
	});
	
	//移除加载
	$('.demo13').click(function(){
		$.hideLoading();
	});
	
	//显示前的回调方法
	$('.demo14').hDialog({beforeShow: function(){
		alert('显示前执行');
	}});
	
	//隐藏后的回调方法
	$('.demo15').hDialog({afterHide: function(){
		alert('隐藏后执行');
	}});
	
	//fadeOut淡出关闭效果
	$('.demo16').hDialog({effect: 'fadeOut'});
	
	//悬浮触发
	$('.demo17').hDialog({triggerEvent: 'mouseenter'});
	
	//不显示关闭按钮
	$('.demo18').hDialog({closeHide: false});
	
	//提交并验证表单
	$('.submitBtn').click(function() {
		var EmailReg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/; //邮件正则
		var PhoneReg = /^0{0,1}(13[0-9]|15[0-9]|153|156|18[7-9])[0-9]{8}$/ ; //手机正则
		var $nickname = $('.nickname');
		var $email = $('.email'); 
		var $phone = $('.phone');
		if($nickname.val() == ''){
			$.tooltip('昵称还没填呢...'); $nickname.focus();
		}else if($phone.val() == ''){
			$.tooltip('手机还没填呢...'); $phone.focus();
		}else if(!PhoneReg.test($phone.val())){
			$.tooltip('手机格式错咯...'); $phone.focus();
		}else if($email.val() == ''){
			$.tooltip('邮箱还没填呢...'); $email.focus();
		}else if(!EmailReg.test($email.val())){
			$.tooltip('邮箱格式错咯...'); $email.focus();
		}else{
			$.tooltip('提交成功，2秒后自动关闭',2000,true);
			setTimeout(function(){ 
				//$el.hDialog('close',{box:'#HBox'},'http://smwell.sinaapp.com/');  //也可以加跳转链接哦~
				$el.hDialog('close',{box:'#HBox'}); 
			},2000);
		}
	});
	
});