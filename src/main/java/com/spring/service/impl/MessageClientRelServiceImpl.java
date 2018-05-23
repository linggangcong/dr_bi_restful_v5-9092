package com.spring.service.impl;

import com.spring.mapper.main.MessageClientRelMapper;
import com.spring.service.MessageClientRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class MessageClientRelServiceImpl implements MessageClientRelService {
    @Autowired
    MessageClientRelMapper  messageClientRelMapper;

    @Override
    public Integer updateShow(int clientId,int messageId){
        return messageClientRelMapper.updateShow(clientId,messageId);
    }

    @Override
    public Integer updateStatus(int clientId ,int messageId){
        return messageClientRelMapper.updateStatus(clientId , messageId);
    }
}
