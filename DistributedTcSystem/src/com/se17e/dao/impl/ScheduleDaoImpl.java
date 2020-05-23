package com.se17e.dao.impl;

import com.se17e.dao.inter.ScheduleDaoInter;
import com.se17e.util.DBUtil;

public class ScheduleDaoImpl implements ScheduleDaoInter{
	@Override
	public int initQueue(String sql, Object[] params) {
				
		try {
			return DBUtil.executeUpdate(sql,params);
		} catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
}
