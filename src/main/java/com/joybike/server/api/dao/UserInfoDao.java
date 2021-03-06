package com.joybike.server.api.dao;

import com.joybike.server.api.Infrustructure.IRepository;
import com.joybike.server.api.dto.UserDto;
import com.joybike.server.api.model.userInfo;



/**
 * Created by 58 on 2016/10/12.
 */
public interface UserInfoDao extends IRepository<userInfo> {


    /**
     * 获取用户基本信息
     * @param userId
     * @return
     */
    userInfo getUserInfo(long userId) throws Exception;


    /**
     * 根据用户号码获取用户信息
     * @param phone
     * @return
     */
    userInfo getInfoByPhone(String phone) throws Exception;

    /**
     * 获取用户信息根据用户id
     * @param userId
     * @return
     * @throws Exception
     */
    UserDto getUserInfoById(long userId) throws Exception;

}
