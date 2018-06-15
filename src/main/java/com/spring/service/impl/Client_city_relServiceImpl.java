package com.spring.service.impl;

import com.spring.mapper.main.Client_city_relMapper;
import com.spring.model.Client_city_rel;
import com.spring.service.Client_city_relService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Client_city_relServiceImpl implements Client_city_relService {
    @Autowired
    Client_city_relMapper client_city_relMapper;

    @Override
    public Integer  addClient_city_rel(Client_city_rel client_city_rel){
        return client_city_relMapper.addClient_city_rel(client_city_rel);
    }

    @Override
    public Integer update(Client_city_rel client_city_rel){
        return client_city_relMapper.updateClient_city_rel(client_city_rel);
    }

    @Override
    public Integer deleteByName(int clientId)    {
        return client_city_relMapper.deleteClient_city_relByName(clientId);
    }

    @Override
    public Client_city_rel findByName(int clientId) {
        return client_city_relMapper.findClient_city_relByName(clientId);
    }
}
