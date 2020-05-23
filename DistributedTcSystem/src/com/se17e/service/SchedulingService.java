package com.se17e.service;

import com.se17e.dao.impl.ScheduleDaoImpl;
import com.se17e.dao.inter.ScheduleDaoInter;

public class SchedulingService {
	static ScheduleDaoInter dao = new ScheduleDaoImpl();
	//初始化等待队列和服务队列
	public static boolean init() {
		int init1 = dao.initQueue("delete from WaitingQueue;",new Object[]{});
		int init2 = dao.initQueue("delete from ServedQueue;",new Object[]{});
		return (init1 >= 0  && init2 >= 0);
	}
}
