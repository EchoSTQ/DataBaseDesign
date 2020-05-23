package com.se17e.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.se17e.bean.CacPara;
import com.se17e.service.SchedulingService;
import com.se17e.service.ServedService;
import com.se17e.service.AdminService;

public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		if(method.equalsIgnoreCase("PowerOn")) {
			//创建调度对象和服务对象
			boolean initSche = SchedulingService.init();
			boolean initServed = ServedService.init();
			//调度对象中初始化等待队列和服务队列
			String msg = (initSche == true && initServed == true) ? "initSuccess":"initError";
			
			//返回初始化消息
			response.getWriter().write(msg);
		} 
		else if(method.equalsIgnoreCase("SetPara")){
			//boolean setPara = SetCentralAcPara.setCacPara(mode, tempHighLimit, tempLowLimit, defaultTargetTemp, FeeRateH, FeeRateL)
//		} else if(method.equalsIgnoreCase("toServeOnView")){
//			request.getRequestDispatcher("/WEB-INF/view/admin/serveOn.jsp").forward(request, response);
//		}
//			String[] parameterValues = request.getParameterValues("para[]");
//			if(parameterValues != null) {
//				for(String parameterValue: parameterValues) {
//					System.out.println("getParameterValues:" + parameterValue);
//				}
//			}
			int speed = Integer.parseInt(request.getParameter("speedType"));
			int mode = Integer.parseInt(request.getParameter("modeType"));
			int tempHighLimit = Integer.parseInt(request.getParameter("tempHighLimit"));
			int tempLowLimit = Integer.parseInt(request.getParameter("tempLowLimit"));
			int defaultTargetTemp = Integer.parseInt(request.getParameter("defaultTargetTemp"));
			int FeeRateH = Integer.parseInt(request.getParameter("FeeRateH"));
			int FeeRateM = Integer.parseInt(request.getParameter("FeeRateM"));
			int FeeRateL = Integer.parseInt(request.getParameter("FeeRateL"));
			CacPara cacPara = new CacPara(speed,mode,tempHighLimit,tempLowLimit,defaultTargetTemp,FeeRateH,FeeRateM,FeeRateL);
			
			String msg = AdminService.setCacPara(cacPara)? "setSuccess":"setError";
			
			request.setAttribute("speed", speed);
			
			response.getWriter().write(msg);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
