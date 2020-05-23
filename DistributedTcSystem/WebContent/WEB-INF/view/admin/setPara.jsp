<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="shortcut icon" href="favicon.ico"/>
<link rel="bookmark" href="favicon.ico"/>
<link href="h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="h-ui/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="h-ui/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="h-ui/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">

<script type="text/javascript" src="easyui/jquery.min.js"></script> 
<script type="text/javascript" src="h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="h-ui/lib/icheck/jquery.icheck.min.js"></script> 

<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#submitBtn").click(function(){
			var speedType=$("input[name=speedType]").val();
			var modeType=$("input[name=modeType]").val();
			var tempHighLimit=$("input[name=tempHighLimit]").val();
			var tempLowLimit=$("input[name=tempLowLimit]").val();
			var defaultTargetTemp=$("input[name=defaultTargetTemp]").val();
			var FeeRateH=$("input[name=FeeRateH]").val();
			var FeeRateM=$("input[name=FeeRateM]").val();
			var FeeRateL=$("input[name=FeeRateL]").val();
			
			$.ajax({
				type: "post",
				url: "AdminServlet?method=SetPara",
				dataType: "text", //返回数据类型
				data:{"speedType":speedType,"modeType":modeType,"tempHighLimit":tempHighLimit,"tempLowLimit":tempLowLimit,
					"defaultTargetTemp":defaultTargetTemp,"FeeRateH":FeeRateH,"FeeRateM":FeeRateM,"FeeRateL":FeeRateL},
				success: function(msg){
					if("setError" == msg){
						$.messager.alert("消息提醒", "设置错误!", "warning");
					} else if("setSuccess" == msg){
						$.messager.alert("消息提醒", "设置成功!", "warning");
					}
				}
				
			});
		});
		
		//设置复选框
		$(".skin-minimal input").iCheck({
			radioClass: 'iradio-blue',
			increaseArea: '25%'
		});
	})
</script> 
<title>Insert title here</title>
</head>
<body>
	<br/>
	<p style="font-size: 25px; line-height: 30px; height: 30px;">&nbsp;&nbsp;当前工作模式</p>
	&nbsp;&nbsp;&nbsp;&nbsp;
  	模式：${speed}
  	风速：
  	最高温度限制：
	最低温度限制：
	目标温度：
	高费率：
	中费率：
	低费率：
	<!-- mode,tempHighLimit,
		tempLowLimit,
		defaultTargetTemp,
		FeeRateH,FeeRateM,FeeRateL -->
	    <form id="form" class="form form-horizontal" method="post">

	      <div class="mt-20 skin-minimal" style="text-align: center;">
	      	<div class="row cl">
				<div class="radio-box">
					<input type="radio" id="radio-1" name="speedType" value="1" />
					<label for="radio-1">高风速</label>
				</div>
				<div class="radio-box">
					<input type="radio" id="radio-2" name="speedType" checked value="2" />
					<label for="radio-2">中风速</label>
				</div>
				<div class="radio-box">
					<input type="radio" id="radio-3" name="speedType" value="3" />
					<label for="radio-3">低风速</label>
				</div>
			</div>
		  </div>
		  
		  <div class="row cl">
	        <label class="form-label col-5"><i class="Hui-iconfont">&#xe60e;</i></label>
	        <div class="formControls col-5">
	          <input id="" name="modeType" type="text" placeholder="工作模式（1：制冷，2：制热） " class="input-text size-L" style="width: 300px;">
	        </div>
	      </div>
	      
	      <div class="row cl">
	        <label class="form-label col-5"><i class="Hui-iconfont">&#xe60e;</i></label>
	        <div class="formControls col-5">
	          <input id="" name="tempHighLimit" type="text" placeholder="最高温度（度） " class="input-text size-L" style="width: 300px;">
	        </div>
	      </div>
	      
	      <div class="row cl">
	        <label class="form-label col-5"><i class="Hui-iconfont">&#xe60e;</i></label>
	        <div class="formControls col-5">
	          <input id="" name="tempLowLimit" type="text" placeholder="最低温度（度）" class="input-text size-L" style="width: 300px;">
	        </div>
	      </div>
	      
	      <div class="row cl">
	        <label class="form-label col-5"><i class="Hui-iconfont">&#xe60e;</i></label>
	        <div class="formControls col-5">
	          <input id="" name="defaultTargetTemp" type="text" placeholder="默认目标温度（度）" class="input-text size-L" style="width: 300px;">
	        </div>
	      </div>
	      
	      <div class="row cl">
	        <label class="form-label col-5"><i class="Hui-iconfont">&#xe60e;</i></label>
	        <div class="formControls col-5">
	          <input id="" name="FeeRateH" type="text" placeholder="高费率（分钟/元）" class="input-text size-L" style="width: 300px;">
	        </div>
	      </div>
	      
	      <div class="row cl">
	        <label class="form-label col-5"><i class="Hui-iconfont">&#xe60e;</i></label>
	        <div class="formControls col-5">
	          <input id="" name="FeeRateM" type="text" placeholder="中费率（分钟/元）" class="input-text size-L" style="width: 300px;">
	        </div>
	      </div>
	      
	      <div class="row cl">
	        <label class="form-label col-5"><i class="Hui-iconfont">&#xe60e;</i></label>
	        <div class="formControls col-5">
	          <input id="" name="FeeRateL" type="text" placeholder="低费率（分钟/元）" class="input-text size-L" style="width: 300px;">
	        </div>
	      </div>
	   
	      
	      <div class="row">
	        <div class="formControls col-8 col-offset-5">
	          <input id="submitBtn" type="button" class="btn btn-success radius size-L" value="&nbsp;更&nbsp;改&nbsp;设&nbsp;置&nbsp;">
	        </div>
	      </div>
	    </form>
</body>
</html>