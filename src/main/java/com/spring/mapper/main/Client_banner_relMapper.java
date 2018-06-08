package com.spring.mapper.main;

import com.spring.model.Client_banner_rel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Client_banner_relMapper {

    Integer updateClient_banner_rel(Client_banner_rel client_banner_rel);
    Integer addClient_banner_rel(Client_banner_rel client_banner_rel);
    Integer deleteClient_banner_relByName(String clientName);  //依据用户名删除全部条目
    Client_banner_rel findClient_banner_relByName(int clientId);

}

















