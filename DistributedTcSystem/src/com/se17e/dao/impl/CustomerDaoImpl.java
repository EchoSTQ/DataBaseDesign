package com.se17e.dao.impl;

import com.se17e.bean.TempChange;
import com.se17e.bean.TempChange;
import com.se17e.dao.inter.CustomerDaoInter;
import com.se17e.util.DBUtil;

public class CustomerDaoImpl implements CustomerDaoInter {

	@Override
	public boolean setCentralAcPara(TempChange temp) {
		try {
			String sql = "update cacpara set mode=?,speed=?,temphighlimit=?,"
					+ "templowlimit=?,defaulttargettemp=?,feerateh=?,"
					+ "feeratem=?,feeratel=? where id=1;";
			int result = DBUtil.executeUpdate(sql, new Object[]{temp.getTargetTemp(),});
			
			return result == 1;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
