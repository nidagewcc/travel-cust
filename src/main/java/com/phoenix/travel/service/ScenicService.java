package com.phoenix.travel.service;

import com.phoenix.travel.common.model.TravelResult;
import com.phoenix.travel.common.model.dto.ScenicDTO;

import java.util.List;

/**
 * @author Weishuo Zhang
 * @create 2018/10/12
 */
public interface ScenicService {

    /**
     * 新增景点
     *
     * @param scenic
     * @return
     */
    TravelResult add(ScenicDTO scenic);

    /**
     * 景点详情
     *
     * @param scenicId
     * @return
     */
    TravelResult info(Integer scenicId);

    /**
     * 更新/编辑
     *
     * @param scenic
     * @return
     */
    TravelResult update(ScenicDTO scenic);

    /**
     * 更新状态（可批量）
     *
     * @param scenicSts 0：生效 1：失效
     * @param scenicId
     * @return
     */
    TravelResult updateSts(Integer scenicSts, List<Integer> scenicId);
}
