package com.joybike.server.api.ThirdPayService;
import com.joybike.server.api.model.RedirectParam;
import com.joybike.server.api.model.ThirdPayBean;
import com.joybike.server.api.model.WxNotifyOrder;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LongZiyuan on 2016/10/20.
 */
public interface ThirdPayService {
    /**
     * 执行支付请求
     * @param payOrder
     */
    public String execute(ThirdPayBean payOrder);

    /**
     * 查询支付结果
     * @param payOrder
     * @return
     */
    public String queryPayResult(ThirdPayBean payOrder);

    /**
     * 支付回调请求
     * @param wxNotifyOrder
     * @return
     */
    public String callBack(WxNotifyOrder wxNotifyOrder);


    /**
     * 执行退款请求
     * @param payBean
     * @return
     */
    public String executeRefund(ThirdPayBean payBean);
}
