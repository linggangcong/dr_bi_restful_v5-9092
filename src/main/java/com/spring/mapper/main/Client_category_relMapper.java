package com.spring.mapper.main;

import com.spring.model.Client_category_rel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Client_category_relMapper {

    Integer updateClient_category_rel(Client_category_rel client_category_rel);

    Integer addClient_category_rel(Client_category_rel client_category_rel);

    Integer deleteClient_category_relByName( int clientId);

    List<Client_category_rel> findClient_category_relByName(int clientId);

}

















