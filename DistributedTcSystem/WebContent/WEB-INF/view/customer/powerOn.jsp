<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
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
            //开启电源
            $("#submitBtn").click(function(){
                $.ajax({
                    type: "post",
                    url: "CustomerServlet?method=PowerOn",
                    success: function(msg){
                        if("initError" == msg){
                            $.messager.alert("消息提醒", "空调开启失败!", "warning");
                        } else if("initSuccess" == msg){
                            $.messager.alert("消息提醒", "空调开启成功!", "warning");
                        }
                    }
                });
            })
        })
    </script>
    <script type="text/javascript">
        $(function(){
            //关闭电源
            $("#closeBtn").click(function(){
                $.ajax({
                    type: "post",
                    url: "CustomerServlet?method=PowerOn",
                    success: function(msg){
                        if("initError" == msg){
                            $.messager.alert("消息提醒", "空调关闭失败!", "warning");
                        } else if("initSuccess" == msg){
                            $.messager.alert("消息提醒", "空调关闭成功!", "warning");
                        }
                    }
                });
            })
        })
    </script>
</head>
<body>
<div class="row">
    <br/>
    <div class="formControls col-8 col-offset-1">
        <input id="submitBtn" type="button" class="btn btn-success radius size-L" value="&nbsp;开&nbsp;启&nbsp;电&nbsp;源&nbsp;">
    </div>
</div>
<br/>
<br/>
<div class="row">
    <br/>
    <div class="formControls col-8 col-offset-1">
        <input id="closeBtn" type="button" class="btn btn-success radius size-L" value="&nbsp;关&nbsp;闭&nbsp;电&nbsp;源&nbsp;">
    </div>
</div>
</body>
</html>