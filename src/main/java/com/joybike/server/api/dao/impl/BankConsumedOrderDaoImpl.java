package com.joybike.server.api.dao.impl;

import com.joybike.server.api.Enum.ConsumedStatus;
import com.joybike.server.api.Infrustructure.Reository;
import com.joybike.server.api.dao.BankConsumedOrderDao;
import com.joybike.server.api.model.bankConsumedOrder;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lishaoyong on 16/10/19.
 */
@Repository("BankConsumedOrderDao")
public class BankConsumedOrderDaoImpl extends Reository<bankConsumedOrder> implements BankConsumedOrderDao {

    /**
     * 获取用户消费明细
     *
     * @param userId
     * @param status
     * @return
     */
    final String getBankConsumedOrderListSql = "select * from bankConsumedOrder where userId = ? and status = ?";

    @Override
    public List<bankConsumedOrder> getBankConsumedOrderList(long userId, ConsumedStatus consumedStatus) {
        Object[] object = new Object[]{userId, consumedStatus.getValue()};
        List<bankConsumedOrder> list = this.jdbcTemplate.getJdbcOperations().query(getBankConsumedOrderListSql, object, new BeanPropertyRowMapper(bankConsumedOrder.class));
        return list;
    }
}
