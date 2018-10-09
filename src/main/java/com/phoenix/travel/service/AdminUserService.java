package com.phoenix.travel.service;

import com.phoenix.travel.common.model.TravelResult;

/**
 * @author Weishuo Zhang
 * @create 2018/10/8
 */
public interface AdminUserService {

    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return
     */
    TravelResult login(String userName, String password);
}
