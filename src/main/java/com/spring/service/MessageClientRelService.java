package com.spring.service;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface MessageClientRelService {
   


   Integer updateShow(int clientId,int messageId);
   Integer updateStatus(int clientId ,int messageId);




}
