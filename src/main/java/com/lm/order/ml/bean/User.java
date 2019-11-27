package com.lm.order.ml.bean;

import com.lm.order.ml.impl.DefaultWeChatService;

/**
 * @Author limeng
 * @Description
 * @Date @Date: 2019/5/16 16:33
 * @Modified by :
 **/
public abstract class User {

    public String name;

    public Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * subscribe Official Account
     * @param weChat
     */
    abstract void followWeChat(DefaultWeChatService weChat);

    /**
     * subscribe Official Account
     * @param weChat
     */
    abstract void login(DefaultWeChatService weChat);
}
