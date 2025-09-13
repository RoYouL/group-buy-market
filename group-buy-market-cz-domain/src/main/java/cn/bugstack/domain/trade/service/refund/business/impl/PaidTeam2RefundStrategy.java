package cn.bugstack.domain.trade.service.refund.business.impl;

import cn.bugstack.domain.trade.model.entity.TradeRefundOrderEntity;
import cn.bugstack.domain.trade.service.refund.business.IRefundOrderStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 发起退单（已成团&已支付），锁单量-1、完成量-1、组队订单状态更新、发送退单消息（MQ）
 *
 * @author xiaofuge bugstack.cn @小傅哥
 * 2025/7/8 07:45
 */
@Slf4j
@Service("paidTeam2RefundStrategy")
public class PaidTeam2RefundStrategy implements IRefundOrderStrategy {

    @Override
    public void refundOrder(TradeRefundOrderEntity tradeRefundOrderEntity) {

    }

}
