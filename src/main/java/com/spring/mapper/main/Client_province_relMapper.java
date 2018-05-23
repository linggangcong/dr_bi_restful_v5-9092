package com.spring.mapper.main;

import com.spring.model.Client_province_rel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Client_province_relMapper {

        Integer updateClient_province_rel(Client_province_rel client_province_rel);

        Integer addClient_province_rel(Client_province_rel client_province_rel);

        Integer deleteClient_province_relByName(int clientId);

        Client_province_rel findClient_province_relByName(int clientId);

}

















