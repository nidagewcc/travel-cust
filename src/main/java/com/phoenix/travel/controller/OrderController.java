package com.phoenix.travel.controller;

import com.phoenix.travel.common.model.TravelResult;
import com.phoenix.travel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 订单controller
 *
 * @author Weishuo Zhang
 * @create 2018/10/11
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;

    /**
     * 列表查询
     *
     * @param handleSts
     * @param curPage
     * @param pageSize
     * @return
     */
    @GetMapping("/list")
    public TravelResult list(@RequestParam int handleSts, @RequestParam int curPage, @RequestParam int pageSize) {
        return orderService.listOrder(handleSts, curPage, pageSize);
    }


    /**
     * 根据订单号查询订单
     *
     * @param orderNo
     * @return
     */
    @GetMapping("/search")
    public TravelResult search(@RequestParam String orderNo) {
        return orderService.getOrderByNo(orderNo);
    }


    /**
     * 查看
     *
     * @param orderId
     * @return
     */
    @GetMapping("/view")
    public TravelResult view(@RequestParam int orderId) {
        return orderService.getOrderById(orderId);
    }

    /**
     * 处理订单
     *
     * @param handleParam
     * @return
     */
    @PostMapping("/handle")
    public TravelResult handle(@RequestBody Map<String, Object> handleParam) {
        int orderId = (int) handleParam.get("orderId");
        String remark = (String) handleParam.get("remark");
        return orderService.handleOrder(orderId, remark);
    }
}
