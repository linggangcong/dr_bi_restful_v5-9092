package com.spring.service.impl;

import com.spring.mapper.main.Client_brand_relMapper;
import com.spring.model.Client_brand_rel;
import com.spring.service.Client_brand_relService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Client_brand_relServiceImpl implements Client_brand_relService {
        @Autowired
        Client_brand_relMapper client_brand_relMapper;
        @Override
    public Integer  addClient_brand_rel(Client_brand_rel client_brand_rel){
        Integer num=client_brand_relMapper.addClient_brand_rel(client_brand_rel);
            if(num==0){
                ExceptionUtil.dataNotExistException("增加失败");
            }
            return num;
    }

    @Override
    public Integer update(Client_brand_rel client_brand_rel){
        return client_brand_relMapper.updateClient_brand_rel(client_brand_rel);
    }

    @Override
    public Integer deleteByName(int clientId) {
        return client_brand_relMapper.deleteClient_brand_relByName(clientId);
    }

    @Override
    public Client_brand_rel findByName(int clientId) {
        return client_brand_relMapper.findClient_brand_relByName(clientId);
    }
}
