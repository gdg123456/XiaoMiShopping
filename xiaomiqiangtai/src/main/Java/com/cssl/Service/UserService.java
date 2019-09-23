package com.cssl.Service;

import com.cssl.Pojo.Yhb;

public interface UserService {
    /**
     * 登录
     * @return
     */
    public int denglu(Yhb yh);

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
