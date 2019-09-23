package com.cssl.Dao;

import com.cssl.Pojo.Yhb;
/**
 * 前台用户登录，注册，退出
 */
public interface UserDao {
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
