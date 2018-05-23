package com.spring.service;

import com.spring.model.Client_brand_rel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Client_brand_relService {
   
   Integer  addClient_brand_rel(Client_brand_rel client_brand_rel);

   Integer update(Client_brand_rel client_brand_rel);

   Integer deleteByName(int clientId);

   Client_brand_rel findByName(int clientId);


}
