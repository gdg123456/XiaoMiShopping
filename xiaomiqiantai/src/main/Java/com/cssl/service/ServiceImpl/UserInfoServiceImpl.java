package com.cssl.service.ServiceImpl;

import com.cssl.dao.UserInfoDao;
import com.cssl.pojo.Yhb;
import com.cssl.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Enzo Cotter on 19-9-26.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired(required = false)
    private UserInfoDao userInfoDao;

    @Override
    public Yhb findUserInfo(Integer userId) {
        return userInfoDao.selectById(userId);
    }
}
