package com.se17e.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		if(method.equalsIgnoreCase("toPowerOnView")) {
			request.getRequestDispatcher("/WEB-INF/view/admin/powerOn.jsp").forward(request, response);
		} else if(method.equalsIgnoreCase("toSetParaView")){
			request.getRequestDispatcher("/WEB-INF/view/admin/setPara.jsp").forward(request, response);
		} else if(method.equalsIgnoreCase("toServeOnView")){
			request.getRequestDispatcher("/WEB-INF/view/admin/serveOn.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
