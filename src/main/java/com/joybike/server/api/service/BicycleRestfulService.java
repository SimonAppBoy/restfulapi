package com.joybike.server.api.service;

import com.joybike.server.api.model.subscribeInfo;
import com.joybike.server.api.model.vehicle;
import com.joybike.server.api.model.vehicleHeartbeat;
import com.joybike.server.api.model.vehicleRepair;

import java.util.List;

/**
 * Created by lishaoyong on 16/10/23.
 * 车的服务
 */
public interface BicycleRestfulService {

    /**
     * 预约车辆
     *
     * @param userId      用户ID
     * @param bicycleCode 车辆code
     * @return
     */
    subscribeInfo vehicleSubscribe(long userId, String bicycleCode, int startAt) throws Exception;

    /**
     * 删除车辆预约信息,两种情况，1:取消预约，2:到达15分钟预约时间
     *
     * @param userId
     * @param vehicleId
     * @return
     */
    int deleteSubscribeInfo(long userId, String vehicleId) throws Exception;

    /**
     * 修改预约状态
     *
     * @param userId
     * @param vehicleId
     * @return
     */
    int updateSubscribeInfo(long userId, String vehicleId) throws Exception;

    /**
     * 根据用户ID查找预约信息
     *
     * @param userId
     * @return
     */
    subscribeInfo getSubscribeInfoByUserId(long userId)  throws Exception;

    /**
     * 根据车辆ID获取预约信息
     *
     * @param vehicleId
     * @return
     */
    subscribeInfo getSubscribeInfoByBicycleCode(String vehicleId)  throws Exception;

    /**
     * 获取骑行记录
     *
     * @param bicycleCode
     * @param beginAt
     * @param endAt
     * @return
     */
    List<vehicleHeartbeat> getVehicleHeartbeatList(String bicycleCode, int beginAt, int endAt) throws Exception;


    /**
     * 故障上报
     *
     * @param vehicleRepair
     * @return
     */
    long addVehicleRepair(vehicleRepair vehicleRepair) throws Exception;

    /**
     * 获取车辆使用状态
     *
     * @param bicycleCode
     * @return
     */
    int getVehicleUseStatusByBicycleCode(String bicycleCode) throws Exception;

    /**
     * 获取车辆状态
     *
     * @param bicycleCode
     * @return
     */
    int getVehicleStatusByBicycleCode(String bicycleCode) throws Exception;

    /**
     * 获取当前位置一公里内的车辆
     *
     * @param beginDimension
     * @param beginLongitude
     * @return
     */
    List<vehicle> getVehicleList(double beginDimension, double beginLongitude) throws Exception;
}