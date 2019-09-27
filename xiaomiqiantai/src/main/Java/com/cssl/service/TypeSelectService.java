package com.cssl.service;

import com.cssl.pojo.Spxxb;

import java.util.List;

/**
 * 类型查询接口
 */
public interface TypeSelectService {
    //根据类型查询
    List<Spxxb> Bytype(String type);
    //热销
    List<Spxxb> Sellwell();
}
