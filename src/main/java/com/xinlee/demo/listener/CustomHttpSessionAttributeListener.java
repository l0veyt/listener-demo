package com.xinlee.demo.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by xin.lee on 2017/3/3.
 * 自定义的HTTP会话属性监听器
 */
public class CustomHttpSessionAttributeListener implements HttpSessionAttributeListener {
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("在HttpSession中添加了属性");
    }
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("在HttpSession中替换了属性");
    }
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("在HttpSession中删除了属性");
    }

}
