package com.spring.mapper.main;

import com.spring.model.Client_city_rel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Client_city_relMapper {

        Integer updateClient_city_rel(Client_city_rel client_city_rel);

        Integer addClient_city_rel(Client_city_rel client_city_rel);

        Integer deleteClient_city_relByName(int clientId);

        Client_city_rel findClient_city_relByName(int clientId);

}

















