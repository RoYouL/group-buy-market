package cn.bugstack.domain.trade.service.refund.business;

import cn.bugstack.domain.trade.model.entity.TradeRefundOrderEntity;
import cn.bugstack.domain.trade.model.valobj.TeamRefundSuccess;

public interface IRefundOrderStrategy {
    void refundOrder(TradeRefundOrderEntity tradeRefundOrderEntity) throws Exception;

    void reverseStock(TeamRefundSuccess teamRefundSuccess) throws Exception;
}
