package com.phoenix.travel.controller;

import com.phoenix.travel.common.model.TravelResult;
import com.phoenix.travel.common.model.dto.ScenicDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 景点
 *
 * @author Weishuo Zhang
 * @create 2018/10/12
 */
@RestController
@RequestMapping("/scenic")
public class ScenicController {


    /**
     * 创建景点
     *
     * @param createScenic
     * @return
     */
    @PostMapping("/create")
    public TravelResult create(@RequestBody ScenicDTO createScenic) {

        return TravelResult.ok();
    }


}
