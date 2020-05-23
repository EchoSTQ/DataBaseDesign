package com.se17e.dao.inter;

public interface ScheduleDaoInter {
	//初始化服务队列和等待队列，即清空数据库WaitingQueue表和ServedQueue表
	public int initQueue(String sql, Object[] params);
}
