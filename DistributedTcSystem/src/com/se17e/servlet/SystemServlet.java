package com.se17e.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SystemServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        if("LoginOut".equals(method)){ //退出系统
            loginOut(request, response);
        } else if("toAdminView".equalsIgnoreCase(method)){ //到管理员界面
            request.getRequestDispatcher("/WEB-INF/view/admin/admin.jsp").forward(request, response);
        } else if("toCustomerView".equals(method)){ //到用户界面
            request.getRequestDispatcher("/WEB-INF/view/customer/customer.jsp").forward(request, response);
        } else if("toTeacherView".equals(method)){ //到前台界面
            request.getRequestDispatcher("/WEB-INF/view/teacher/receptionist.jsp").forward(request, response);
        }
//		else if("toAdminPersonalView".equals(method)){ //到系统管理员系统设置界面
//			request.getRequestDispatcher("/WEB-INF/view/admin/adminPersonal.jsp").forward(request, response);
//		}
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void loginOut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //退出系统时清除系统登录的用户
        request.getSession().removeAttribute("user");
        String contextPath = request.getContextPath();
        //转发到登录界面
        response.sendRedirect(contextPath+"/index.jsp");
    }

}
