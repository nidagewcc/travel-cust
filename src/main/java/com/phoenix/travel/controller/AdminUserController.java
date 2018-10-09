package com.phoenix.travel.controller;

import com.phoenix.travel.common.model.TravelResult;
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


    /**
     * 后台登录
     *
     * @param loginParam
     * @return
     */
    @PostMapping("/login")
    public TravelResult login(@RequestBody Map<String, String> loginParam) {
        //TODO
        return TravelResult.ok();
    }
}
