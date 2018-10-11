package com.phoenix.travel.service;

import com.phoenix.travel.common.model.TravelResult;

/**
 * 订单
 *
 * @author Weishuo Zhang
 * @create 2018/10/11
 */
public interface OrderService {

    /**
     * 查询订单列表
     *
     * @param handleSts
     * @param curPage
     * @param pageSize
     * @return
     */
    TravelResult listOrder(Integer handleSts, Integer curPage, Integer pageSize);

    /**
     * 根据订单号查询订单
     *
     * @param orderNo
     * @return
     */
    TravelResult getOrderByNo(String orderNo);

    /**
     * 根据订单ID查询订单信息
     *
     * @param orderId
     * @return
     */
    TravelResult getOrderById(Integer orderId);


    /**
     * 处理订单
     *
     * @param orderId
     * @param remark
     * @return
     */
    TravelResult handleOrder(Integer orderId, String remark);
}
