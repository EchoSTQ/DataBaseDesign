package com.se17e.service;

import com.se17e.bean.TempChange;
import com.se17e.dao.impl.CustomerDaoImpl;
import com.se17e.dao.inter.CustomerDaoInter;

public class CustomerService {
    public static boolean setTemp(TempChange temp) {
        CustomerDaoInter dao = new CustomerDaoImpl();

        return dao.setCentralAcPara(temp);
    }
}
