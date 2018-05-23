package com.spring.service;

import com.spring.model.Client_province_rel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Client_province_relService {

   Integer  addClient_province_rel(Client_province_rel client_province_rel);

   Integer update(Client_province_rel client_province_rel);

   Integer deleteByName(int clientId);

   Client_province_rel findByName(int clientId);


}
