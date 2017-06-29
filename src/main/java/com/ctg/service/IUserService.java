package com.ctg.service;

import com.ctg.common.ServerResponse;
import com.ctg.pojo.User;

/**
 * Created by hfangjian on 2017/6/29.
 */
public interface IUserService {

    ServerResponse<User> login(String username,String password);

    ServerResponse<String> register(User user);

    /**
     * 验证
     * @param str
     * @param type
     * @return
     */
    ServerResponse<String> checkValid(String str,String type);
}
