package com.lm.order.service.impl;

import com.lm.order.common.OrderRespCode;
import com.lm.order.dao.entity.User;
import com.lm.order.dao.repository.UserRepository;
import com.lm.order.exception.ClientException;
import com.lm.order.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author limeng
 * @Description
 * @Date @Date: 2019/2/13 10:41
 * @Modified by :
 **/
@Service("userService")
public class UserServiceImpl implements IUserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    /**
     * 登录
     * @param accessKey 用户名
     * @param accessSecret 密码
     */
    @Override
    public void login(String accessKey, String accessSecret) {
        User user = userRepository.getUserByAccessKey(accessKey);
        // 校验用户 密码
        if (user == null || !user.getAccessSecret().equals(accessSecret)) {
            throw new ClientException(OrderRespCode._010000);
        }
    }
}
