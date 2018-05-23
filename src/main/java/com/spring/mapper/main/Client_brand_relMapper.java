package com.spring.mapper.main;

import com.spring.model.Client_brand_rel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface    Client_brand_relMapper {

    Integer updateClient_brand_rel(Client_brand_rel client_brand_rel);

    Integer addClient_brand_rel(Client_brand_rel client_brand_rel);

    Integer deleteClient_brand_relByName(int clientId);

    Client_brand_rel findClient_brand_relByName(int clientId);

}

















