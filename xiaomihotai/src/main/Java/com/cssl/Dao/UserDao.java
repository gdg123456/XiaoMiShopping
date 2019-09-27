package com.cssl.dao;

/**
 * 用户登录，注册，退出
 */
public interface UserDao {

    /**
     * 登录
     * @return
     */
    public int denglu();

    /**
     * 注册
     * @return
     */
    public int zhuche();

    /**
     * 注册验证
     * @return
     */
    public int zhucheyz(String admin);

}
