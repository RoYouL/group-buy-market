package cn.bugstack.domain.trade.model.valobj;

import lombok.*;

/**
 * 拼团退单消息
 *
 * @author xiaofuge bugstack.cn @小傅哥
 * 2025/7/29 09:15
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeamRefundSuccess {

    /**
     * 退单类型
     */
    private String type;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 拼单组队ID
     */
    private String teamId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 预购订单ID
     */
    private String orderId;

}
