package com.cssl.dao;


import com.cssl.pojo.Spxxb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类型查询接口
 * author:郭海宏
 */
public interface TypeSelect {
    //根据商品类型查询
    List<Spxxb> TypeSelect(@Param("type") String type);
    //热销
    List<Spxxb> Sellwell();
}
