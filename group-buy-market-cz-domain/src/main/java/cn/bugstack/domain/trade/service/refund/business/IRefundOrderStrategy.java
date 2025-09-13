package cn.bugstack.domain.trade.service.refund.business;

import cn.bugstack.domain.trade.model.entity.TradeRefundOrderEntity;

public interface IRefundOrderStrategy {
    void refundOrder(TradeRefundOrderEntity tradeRefundOrderEntity);
}
