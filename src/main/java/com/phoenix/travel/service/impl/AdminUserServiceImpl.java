package com.phoenix.travel.service.impl;

import com.phoenix.travel.common.model.TravelResult;
import com.phoenix.travel.dao.AdminUserMapper;
import com.phoenix.travel.service.AdminUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Weishuo Zhang
 * @create 2018/10/8
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    private static Logger logger = LoggerFactory.getLogger(AdminUserServiceImpl.class);

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public TravelResult login(String userName, String password) {
        return null;
    }
}
