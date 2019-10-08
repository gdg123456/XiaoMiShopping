package com.cssl.dao;

import com.cssl.vo.Ddxq;
import com.cssl.vo.Ygsp;

import java.util.List;

public interface DdxqDao {

    /**
     * 查询一个订单总体详情
     * @param Ddbh
     * @return
     */
    public Ddxq selectDdxq(String Ddbh);

    /**
     * 查询一个订单的详细商品集合
     * @param Ddbh
     * @return
     */
    public List<Ygsp> selectSpjh(String Ddbh);

}
