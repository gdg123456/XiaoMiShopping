package com.cssl.service.ServiceImpl;

import com.cssl.dao.UserDao;
import com.cssl.pojo.Yhb;
import com.cssl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao dlzccz;//实例化用户操作
    /**
     * 登录
     * @param yh
     * @return
     */
    @Override
    public Yhb denglu(Yhb yh) {
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
