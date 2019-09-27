package com.cssl.listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;

@WebListener()
public class UserListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    private ServletContext application;

    // -------------------------------------------------------
    // application创建
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
             application=sce.getServletContext();
             application.setAttribute("listusers",new ArrayList<String>());
    }

    /**
     * application销毁
     * @param sce
     */
    public void contextDestroyed(ServletContextEvent sce) {

    }

    // -------------------------------------------------------
    // 创建Session时触发
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
             //在这里把session里的所有用户全部拿出来一个一个对比
        HttpSession session =se.getSession();
        //要销毁的用户
        String useradmin= (String) session.getAttribute("useradmin");
        //从redis里面查询出来进行对比
        List<String> users= (List<String>) application.getAttribute("listusers");
        if(users.contains(useradmin)){
            //用户已经存在
           users.remove(useradmin);
        }
        ((List<String>) application.getAttribute("listusers")).add(useradmin);
    }

    /**
     * session销毁时触发
     * @param se
     */
    public void sessionDestroyed(HttpSessionEvent se) {

    }

}
