package com.spring.service.impl;

import com.spring.mapper.main.Client_banner_relMapper;
import com.spring.model.Client_banner_rel;
import com.spring.service.Client_banner_relService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Client_banner_relServiceImpl implements Client_banner_relService {
        @Autowired
        Client_banner_relMapper client_banner_relMapper;
        @Override
    public Integer  addClient_banner_rel(Client_banner_rel client_banner_rel){
        Integer num=client_banner_relMapper.addClient_banner_rel(client_banner_rel);
            if(num==0){
                ExceptionUtil.dataNotExistException("增加失败");
            }
            return num;
    }

    @Override
    public Integer update(Client_banner_rel client_banner_rel){
        return client_banner_relMapper.updateClient_banner_rel(client_banner_rel);
    }

    @Override
    public Integer deleteByName(String clientName) {
        return client_banner_relMapper.deleteClient_banner_relByName(clientName);
    }

/*    @Override
    public Client_banner_rel findByName(int clientId) {
        return client_banner_relMapper.findClient_banner_relByName(clientId);
    }*/
}
