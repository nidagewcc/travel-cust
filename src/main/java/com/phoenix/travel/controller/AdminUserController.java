package com.phoenix.travel.controller;

import com.phoenix.travel.common.component.SessionComponent;
import com.phoenix.travel.common.model.TravelResult;
import com.phoenix.travel.po.AdminUser;
import com.phoenix.travel.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Weishuo Zhang
 * @create 2018/10/8
 */
@RestController
@RequestMapping("/admin")
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @Autowired
    private SessionComponent session;

    /**
     * 后台登录
     *
     * @param loginParam
     * @return
     */
    @PostMapping("/login")
    public TravelResult login(@RequestBody Map<String, String> loginParam) {
        String userName = loginParam.get("userName");
        String password = loginParam.get("password");

        TravelResult result = adminUserService.login(userName, password);
        AdminUser adminUser = (AdminUser) result.getData();

        // 保存session
        session.setLoginUser(adminUser);

        return TravelResult.ok(adminUser.getUserName());
    }

    /**
     * 登出
     *
     * @return
     */
    @PostMapping("/logout")
    public TravelResult logout() {
        session.removeLoginUser();
        return TravelResult.ok();
    }
}
