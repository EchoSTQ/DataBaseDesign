package com.se17e.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerViewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        if(method.equalsIgnoreCase("toPowerOnView")) {
            request.getRequestDispatcher("/WEB-INF/view/customer/powerOn.jsp").forward(request, response);
        } else if(method.equalsIgnoreCase("toSetTempView")){
            request.getRequestDispatcher("/WEB-INF/view/customer/setTemp.jsp").forward(request, response);
        } else if(method.equalsIgnoreCase("toSetWindView")) {
            request.getRequestDispatcher("/WEB-INF/view/customer/setWind.jsp").forward(request, response);
        } else if(method.equalsIgnoreCase("toQueryBillView")){
            request.getRequestDispatcher("/WEB-INF/view/customer/queryBill.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
