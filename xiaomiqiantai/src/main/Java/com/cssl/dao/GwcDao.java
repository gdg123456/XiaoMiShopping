package com.cssl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cssl.pojo.MyGwc;
import com.cssl.vo.Ygsp;

import java.util.List;

/**
 * 购物车操作
 */
public interface GwcDao  extends BaseMapper<MyGwc> {

    /**
     * 查询一个用户的购物车里所有商品
     * @param gwc_yhid
     * @return
     */
    List<Ygsp> select(int gwc_yhid);

}
