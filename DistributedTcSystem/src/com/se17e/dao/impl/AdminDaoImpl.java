package com.se17e.dao.impl;

import com.se17e.bean.CacPara;
import com.se17e.dao.inter.AdminDaoInter;
import com.se17e.util.DBUtil;

public class AdminDaoImpl implements AdminDaoInter {

    @Override
    public boolean setCentralAcPara(CacPara cacPara) {
        try {
            String sql = "update cacpara set mode=?,speed=?,temphighlimit=?,"
                    + "templowlimit=?,defaulttargettemp=?,feerateh=?,"
                    + "feeratem=?,feeratel=? where id=1;";
            int result = DBUtil.executeUpdate(sql, new Object[]{cacPara.getSpeed(),
                    cacPara.getTempHighLimit(), cacPara.getTempHighLimit(), cacPara.getDefaultTargetTemp(),
                    cacPara.getFeeRateH(), cacPara.getFeeRateM(), cacPara.getFeeRateL(),});

            return result == 1;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
