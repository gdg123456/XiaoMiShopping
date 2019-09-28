package com.cssl.service;

import com.cssl.pojo.Yhb;

public interface UserService {
    /**
     * 登录
     * @return
     */
     Yhb denglu(Yhb yh);

    /**
     * 注册
     * @return
     */
     int zhuche(Yhb yh);

    /**
     * 注册验证
     * @return
     */
     int zhucheyz(String admin);
}
