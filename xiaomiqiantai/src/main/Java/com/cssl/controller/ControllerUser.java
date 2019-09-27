package com.cssl.controller;

import com.cssl.pojo.Yhb;
import com.cssl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class ControllerUser {

      @Autowired
      private UserService yhcz;
      //实现用户的登录---------用session来储存用户名验证--------用aplication来储存所有的用户对象

      //用户登录注册需要实现一个用户只能登录一次，第二次登录将会把第一次的挤下线，还要实现注册时手机号码验证
      //用户后端验证实现友好体验，

    /**
     * 登录操作
     * @param yh1
     * @return
     */
      @PostMapping("/denlu.html")
      public String denLu(Yhb yh1,HttpSession session){
          Yhb yh=yhcz.denglu(yh1);
          if(yh != null){
              //登录成功
              session.setAttribute("useradmin",yh.getYh_admin());
              return "index";
          }
          //后端验证----------登录失败--账户密码错误
          return "redirect:login.html";
      }

    /**
     * 用户名验证
     * @return
     */
      @ResponseBody
      @GetMapping("/yhmyz.html")
      public int yhmyz(String yhm){
          System.out.println(yhcz.zhucheyz(yhm));
          return  yhcz.zhucheyz(yhm);
      }

    /**
     * 注册操作
     * @return
     */
    @PostMapping("/zhuche.html")
      public String zhuchecz(Yhb yh1, HttpSession session){
        yh1.setYh_lxid(1);
        int pdz=yhcz.zhuche(yh1);
        if(pdz>0){
            //注册成功
            session.setAttribute("useradmin",yh1.getYh_admin());
            return  "index";
        }else{
            //注册失败
            System.out.println("注册失败！");
            return  "register";
        }
      }
}
