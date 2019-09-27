package com.cssl.service;

import com.cssl.pojo.Yhb;

/**
 * Created by Enzo Cotter on 19-9-26.
 */
public interface UserInfoService {
    Yhb findUserInfo(Integer userId);
}
