package com.cssl.service;

import com.cssl.pojo.MyGwc;
import com.cssl.vo.Ygsp;

import java.util.List;

public interface GwcService {

    /**
     * 增加一个商品到购物车
     * @param addgwc
     * @return
     */
    int add(MyGwc addgwc);

    /**
     * 在购物车里删除一个商品
     * @param gwcid
     * @return
     */
    int delete(int gwcid);


    /**
     * 在购物车里修改一个商品
     * @param xggwc
     * @return
     */
    int xiogai(MyGwc xggwc);


    /**
     * 查询一个用户的购物车里所有商品
     * @param yhid
     * @return
     */
    List<Ygsp> select(int yhid);


}
