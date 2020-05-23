package com.se17e.dao.inter;

import com.se17e.bean.User;

public interface LoginDaoInter {
	//查找管理员是否存在，返回结果是一条记录
	public User getAdminObject(String sql, Object[] params);
	
	//查找顾客是否存在,后发现没有必要定义这个
	public User getCustomerObject(String sql, Object[] params);
	
	//查找前台是否存在,后发现没有必要定义这个
	public User getReceptionistObject(String sql, Object[] params);
}
