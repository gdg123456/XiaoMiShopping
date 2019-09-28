package com.cssl.service.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.cssl.dao.UserDao;
import com.cssl.pojo.Yhb;
import com.cssl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Service层的组件
@Service
//事物
@Transactional
public class UserServiceImpl implements UserService {

    //把dao接口注入到这里来
    @Autowired
    private UserDao usercz;

    /**
     * 登录
     * @param yh
     * @return
     */
    @Override
    public Yhb denglu(Yhb yh) {
        QueryWrapper<Yhb> tj=new QueryWrapper<Yhb>();
        //tj.eq("Yh_admin",yh.getYhadmin());
        //tj.eq("Yh_pwd",yh.getYhpwd());
        tj.eq("Yh_admin",yh.getYhAdmin());
        tj.eq("Yh_pwd",yh.getYhPwd());
        Yhb yhb = usercz.selectOne(tj);
        System.out.println("打印对象"+yhb);
        return yhb;
    }

    /**
     * 注册
     * @param yh
     * @return
     */
    @Override
    public int zhuche(Yhb yh) {
        return  usercz.insert(yh) ;
    }

    /**
     * 注册验证
     * @param admin
     * @return
     */
    @Override
    public int zhucheyz(String admin) {
        QueryWrapper tj=new QueryWrapper();
        tj.eq("Yh_admin",admin);
        return usercz.selectCount(tj);
    }


}
