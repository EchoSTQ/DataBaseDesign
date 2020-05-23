package com.se17e.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.se17e.bean.User;
import com.se17e.dao.inter.LoginDaoInter;
import com.se17e.util.DBUtil;

public class LoginDaoImpl implements LoginDaoInter{

	//查找管理员是否存在，返回结果是一条记录
	@Override
	public User getAdminObject(String sql, Object[] params) {
		
		//使用user接收查询结果
		User user = null;
		ResultSet rs = null;
		
		try {
			rs = DBUtil.executeQuery(sql, params);
			
			rs.next();//第一次debug,忘了写这一行
			String idnumber = rs.getString("IDnumber");
			String pwd = rs.getString("password");
			
			user = new User(idnumber, pwd);
			
			return user;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(rs != null) rs.close();
				if(DBUtil.connection != null) DBUtil.connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	//查找顾客是否存在,后发现没有必要定义这个
	@Override
	public User getCustomerObject(String sql, Object[] params) {
		return null;
	}

	//查找前台是否存在,后发现没有必要定义这个
	@Override
	public User getReceptionistObject(String sql, Object[] params) {
		return null;
	}

}
