package com.dubbo.api.service;

import com.dubbo.api.model.Address;
import com.dubbo.api.model.User;

/**
 * @AUTHOR: 小于
 * @DATE: [2019/4/4  23:08]
 * @DESC:
 */
public interface UserService {
    User queryUser(User user);

    Address queryUser(String userId);
}
