package com.se17e.service;

import com.se17e.bean.CacPara;
import com.se17e.dao.impl.AdminDaoImpl;
import com.se17e.dao.inter.AdminDaoInter;

public class AdminService {
	public static boolean setCacPara(CacPara cacPara) {
		AdminDaoInter dao = new AdminDaoImpl();
		
		return dao.setCentralAcPara(cacPara);
	}
}
