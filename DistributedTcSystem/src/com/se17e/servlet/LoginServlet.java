package com.se17e.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.se17e.bean.User;
import com.se17e.service.LoginService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LoginService service = new LoginService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		login(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取用户输入的身份证号
		String IDnumber = request.getParameter("IDnumber");
		//获取用户输入的密码
		String pwd = request.getParameter("password");
		//获取用户输入的验证码
		//String vcode = request.getParameter("vcode");
		//获取登录类型
		int type = Integer.parseInt(request.getParameter("type"));
		
		//返回消息
		String msg = "";
		
		//获取session中的验证码
//		String sVcode = (String) request.getSession().getAttribute("vcode");
//		if(!sVcode.equalsIgnoreCase(vcode)){//先判断验证码是否正确
//			msg = "vcodeError";
//		} else{	//判断用户名和密码是否正确
		
		//封装账户和密码
		User user = new User();
		user.setIDnumber(IDnumber);
		user.setPassword(pwd);
		user.setType(type);
		
		//查询管理员是否存在，若存在则进入管理员页面
		if(type == 3) {
			User loginUser = service.checkAdmin(user);
			if(loginUser == null) {
				msg = "loginError";
			}else {	//正确
				msg = "admin";
				//将该用户名保存到session中
				request.getSession().setAttribute("user", loginUser);
			}
		}else if(type == 2) {
			User loginUser = service.checkCustomer(user);
			if(loginUser == null) {
				msg = "loginError";
			}else {	//正确
				msg = "customer";
				//将该用户名保存到session中
				request.getSession().setAttribute("user", loginUser);
			}
		}else {
			User loginUser = service.checkReceptionist(user);
			if(loginUser == null) {
				msg = "loginError";
			}else {	//正确
				msg = "receptionlist";
				//将该用户名保存到session中
				request.getSession().setAttribute("user", loginUser);
			}
		}
		//返回登录消息
		response.getWriter().write(msg);
//		}
	}

}
