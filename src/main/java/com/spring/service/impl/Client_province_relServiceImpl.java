package com.spring.service.impl;

import com.spring.mapper.main.Client_province_relMapper;
import com.spring.model.Client_province_rel;
import com.spring.service.Client_province_relService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Client_province_relServiceImpl implements Client_province_relService {
    @Autowired
    Client_province_relMapper client_province_relMapper;
    @Override
    public Integer  addClient_province_rel(Client_province_rel client_province_rel){
        return client_province_relMapper.addClient_province_rel(client_province_rel);

    }

    @Override
    public Integer update(Client_province_rel client_province_rel){
        return client_province_relMapper.updateClient_province_rel(client_province_rel);
    }

    @Override
    public Integer deleteByName(int clientId)    {
        return client_province_relMapper.deleteClient_province_relByName(clientId);
    }

    @Override
    public Client_province_rel findByName(int clientId) {
        return client_province_relMapper.findClient_province_relByName(clientId);
    }
}
