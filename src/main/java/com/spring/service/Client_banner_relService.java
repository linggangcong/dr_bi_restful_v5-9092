package com.spring.service;

import com.spring.model.Client_banner_rel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Client_banner_relService {
   
   Integer  addClient_banner_rel(Client_banner_rel client_banner_rel);

   Integer update(Client_banner_rel client_banner_rel);

   Integer deleteByName(String clientName);
//
//   Client_banner_rel findByName(int clientId);


}
