package com.spring.service.impl;

import com.spring.mapper.main.Client_category_relMapper;
import com.spring.model.Client_category_rel;
import com.spring.service.Client_category_relService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Client_category_relServiceImpl implements Client_category_relService {
    @Autowired
    Client_category_relMapper client_category_relMapper;
    @Override
    public Integer  addClient_category_rel(Client_category_rel client_category_rel){
        return client_category_relMapper.addClient_category_rel(client_category_rel);

    }

    @Override
    public Integer update(Client_category_rel client_category_rel){
        return client_category_relMapper.updateClient_category_rel(client_category_rel);
    }

    @Override
    public Integer deleteByName(int clientId)    {
        return client_category_relMapper.deleteClient_category_relByName(clientId);
    }

    @Override
    public List<Client_category_rel> findByName(int clientId) {
        return client_category_relMapper.findClient_category_relByName(clientId);
    }
}
