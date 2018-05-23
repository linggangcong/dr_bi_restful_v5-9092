package com.spring.service.impl;

import com.spring.mapper.main.ClientBannerRelMapper;
import com.spring.service.ClientBannerRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class ClientBannerRelServiceImpl implements ClientBannerRelService {
    @Autowired
    ClientBannerRelMapper clientBannerRelMapper;

    /*@Override
    public Integer  addClient(Client client){
        Integer num=clientMapper.addClient(client);
        if(num == 0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }

    @Override
    public Integer update(Client client){
        return clientMapper.updateClient(client);
    }

    @Override
    public Integer deleteByName(int id) {
        return clientMapper.deleteClientByName(id);
    }*/

    @Override
    public List<Map<String ,String>>  findBannerByClientName(String name) {
        return clientBannerRelMapper.findBannerByClientName(name);
    }

}
