package com.phoenix.travel.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.phoenix.travel.common.enums.DeleteFlagEnum;
import com.phoenix.travel.common.enums.HandleStsEnum;
import com.phoenix.travel.common.enums.RspCodeEnum;
import com.phoenix.travel.common.exception.TravelBizRuntimeException;
import com.phoenix.travel.common.model.PageResult;
import com.phoenix.travel.common.model.TravelResult;
import com.phoenix.travel.dao.OrderMapper;
import com.phoenix.travel.po.Order;
import com.phoenix.travel.po.OrderExample;
import com.phoenix.travel.service.OrderService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现
 *
 * @author Weishuo Zhang
 * @create 2018/10/11
 */
@Service
public class OrderServiceImpl implements OrderService {

    private static Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public TravelResult listOrder(Integer handleSts, Integer curPage, Integer pageSize) {

        // 分页
        PageHelper.startPage(curPage, pageSize);

        // 是否查询全部状态
        OrderExample example = new OrderExample();
        if (handleSts != HandleStsEnum.ALL.getCode()) {
            example.createCriteria().andOrderStsEqualTo(handleSts.byteValue());
        }

        example.setOrderByClause("order_sts ASC");
        List<Order> orders = orderMapper.selectByExample(example);

        PageInfo<Order> pageInfo = new PageInfo<>(orders);
        PageResult<Order> pageResult = new PageResult<>();
        pageResult.setTotal(pageInfo.getTotal());
        pageResult.setList(orders);

        return TravelResult.ok(pageResult);
    }

    @Override
    public TravelResult getOrderByNo(String orderNo) {

        OrderExample example = new OrderExample();
        example.createCriteria().andOrderNoEqualTo(orderNo).andDelFlagEqualTo(new Integer(DeleteFlagEnum.NORMAL
                .getCode()).byteValue());

        List<Order> orders = orderMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(orders)) {
            logger.error("订单号[{}]不存在", orderNo);
            throw new TravelBizRuntimeException(RspCodeEnum.ORDER_NOT_EXIST.getCode());
        }

        return TravelResult.ok(orders.get(0));
    }

    @Override
    public TravelResult getOrderById(Integer orderId) {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            logger.error("订单[{}]不存在", orderId);
            throw new TravelBizRuntimeException(RspCodeEnum.ORDER_NOT_EXIST.getCode());
        }

        return TravelResult.ok(order);
    }

    @Override
    public TravelResult handleOrder(Integer orderId, String remark) {

        Order order = new Order();
        order.setOrderId(orderId);
        order.setOrderSts(new Integer(HandleStsEnum.DONE.getCode()).byteValue());
        order.setRemark(remark);
        orderMapper.updateByPrimaryKey(order);

        logger.info("订单[{}]处理完成", orderId);

        return TravelResult.ok();
    }
}
