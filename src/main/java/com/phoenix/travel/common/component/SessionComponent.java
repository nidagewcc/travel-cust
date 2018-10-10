package com.phoenix.travel.common.component;

import com.alibaba.fastjson.JSON;
import com.phoenix.travel.common.consts.GlobalConstants;
import com.phoenix.travel.po.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * @author Weishuo Zhang
 * @create 2018/10/10
 */
@Component
public class SessionComponent {

    @Autowired
    private HttpSession session;


    /**
     * 登录信息放入session
     *
     * @param adminUser
     */
    public void setLoginUser(AdminUser adminUser) {
        session.setAttribute(GlobalConstants.LOGIN_USER, JSON.toJSONString(adminUser));
    }

    /**
     * 从session中获取登录信息
     *
     * @return
     */
    public AdminUser getLoginUser() {
        Object loginUser = session.getAttribute(GlobalConstants.LOGIN_USER);
        return loginUser == null ? null : JSON.parseObject((String) loginUser, AdminUser.class);
    }

}
