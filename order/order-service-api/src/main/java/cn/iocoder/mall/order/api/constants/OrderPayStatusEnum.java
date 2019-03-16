package cn.iocoder.mall.order.api.constants;

/**
 * 订单状态 status
 *
 * @author Sin
 * @time 2019-03-16 14:32
 */
public enum OrderPayStatusEnum {

    WAITING_PAYMENT(0, "等待支付"),
    SUCCESSFUL_PAYMENT(1, "支付成功"),
    REFUND_PAYMENT(2, "退款成功"),

    ;


    private final int value;

    private final String text;

    OrderPayStatusEnum(int value, String text) {
        this.value = value;
        this.text = text;
    }
}