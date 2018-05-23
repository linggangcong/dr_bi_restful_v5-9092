package com.spring.service;

import com.spring.model.Client_city_rel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Client_city_relService {

   Integer  addClient_city_rel(Client_city_rel client_city_rel);

   Integer update(Client_city_rel client_city_rel);

   Integer deleteByName(int clientId);

   Client_city_rel findByName(int clientId);


}
