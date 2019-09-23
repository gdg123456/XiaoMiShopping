package com.cssl.Service.ServiceImpl;

import com.cssl.Dao.UserDao;
import com.cssl.Pojo.Yhb;
import com.cssl.Service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao dlzccz;//实例化用户操作
    /**
     * 登录
     * @param yh
     * @return
     */
    @Override
    public int denglu(Yhb yh) {
        return dlzccz.denglu(yh);
    }

    /**
     * 注册
     * @param yh
     * @return
     */
    @Override
    public int zhuche(Yhb yh) {
        return dlzccz.zhuche(yh);
    }

    /**
     * 注册验证
     * @param admin
     * @return
     */
    @Override
    public int zhucheyz(String admin) {
        return dlzccz.zhucheyz(admin);
    }
}
