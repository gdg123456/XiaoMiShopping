package com.cssl.service;

import com.cssl.pojo.Yhb;

public interface UserService {
    /**
     * 登录
     * @return
     */
    public Yhb denglu(Yhb yh);

    /**
     * 注册
     * @return
     */
    public int zhuche(Yhb yh);

    /**
     * 注册验证
     * @return
     */
    public int zhucheyz(String admin);
}
