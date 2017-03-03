package com.xinlee.demo.pojo;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * Created by xin.lee on 2017/3/3.
 * 用户实体类
 */
public class User implements Serializable, HttpSessionBindingListener, HttpSessionActivationListener {
    private String username;

    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("钝化：User对象被序列化到${CATALINA_HOME}/work/Catalina/localhost/${project_name}/SESSIONS.ser文件中");
    }

    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("激活：从SESSIONS.ser文件中反序列化User对象到内存中");
    }

    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("绑定：User对象被绑定到了HttpSession会话中了");
    }

    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("解绑：User对象已经从HttpSession会话中解绑了");
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
