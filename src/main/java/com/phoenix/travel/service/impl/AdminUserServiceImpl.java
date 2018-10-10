package com.phoenix.travel.service.impl;

import com.phoenix.travel.common.component.SessionComponent;
import com.phoenix.travel.common.consts.GlobalConstants;
import com.phoenix.travel.common.enums.RspCodeEnum;
import com.phoenix.travel.common.enums.StatusEnum;
import com.phoenix.travel.common.exception.TravelBizRuntimeException;
import com.phoenix.travel.common.model.TravelResult;
import com.phoenix.travel.dao.AdminUserMapper;
import com.phoenix.travel.po.AdminUser;
import com.phoenix.travel.po.AdminUserExample;
import com.phoenix.travel.service.AdminUserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Weishuo Zhang
 * @create 2018/10/8
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    private static Logger logger = LoggerFactory.getLogger(AdminUserServiceImpl.class);

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Autowired
    private SessionComponent session;

    @Override
    public TravelResult login(String userName, String password) {

        AdminUserExample example = new AdminUserExample();
        example.createCriteria().andUserNameEqualTo(userName)
                .andUserStsEqualTo(new Integer(StatusEnum.NORMAL.getCode()).byteValue());
        // TODO 生成的PO里边tinyint类型到了java怎么就成了byte了呢

        List<AdminUser> adminUsers = adminUserMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(adminUsers)) {
            throw new TravelBizRuntimeException(RspCodeEnum.ADMIN_NOT_EXIST.getCode());
        }

        // 校验登录密码
        AdminUser adminUser = adminUsers.get(0);
        String loginPwd = DigestUtils.md5Hex(GlobalConstants.PWD_PREFIX + password);
        if (!adminUser.getPassword().equals(loginPwd)) {
            throw new TravelBizRuntimeException(RspCodeEnum.INCORRECT_PWD.getCode());
        }

        // 保存session
        session.setLoginUser(adminUser);

        return TravelResult.ok();
    }


}
