package com.phoenix.travel.controller;

import com.phoenix.travel.common.model.TravelResult;
import com.phoenix.travel.common.model.dto.ScenicDTO;
import com.phoenix.travel.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 景点
 *
 * @author Weishuo Zhang
 * @create 2018/10/12
 */
@RestController
@RequestMapping("/scenic")
public class ScenicController {


    @Autowired
    private ScenicService scenicService;

    /**
     * 创建景点
     *
     * @param createScenic
     * @return
     */
    @PostMapping("/create")
    public TravelResult create(@RequestBody ScenicDTO createScenic) {
        return scenicService.add(createScenic);
    }

    /**
     * 详情
     *
     * @param scenicId
     * @return
     */
    @GetMapping("/info")
    public TravelResult info(@RequestParam int scenicId) {
        return scenicService.info(scenicId);
    }

    /**
     * 编辑
     *
     * @param editScenic
     * @return
     */
    @PostMapping("/edit")
    public TravelResult edit(@RequestBody ScenicDTO editScenic) {
        return scenicService.update(editScenic);
    }

    /**
     * 状态更新，生效失效
     *
     * @param stsParam
     * @return
     */
    @PostMapping("/status/update")
    public TravelResult updateSts(@RequestBody Map<String, Object> stsParam) {
        List<Integer> ids = (List<Integer>) stsParam.get("ids");
        int sts = (int) stsParam.get("sts");
        return scenicService.updateSts(sts, ids);
    }


}
