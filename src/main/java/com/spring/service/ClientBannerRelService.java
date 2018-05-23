package com.spring.service;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface ClientBannerRelService {
   
   //Integer  addClient(Client client);

   //Integer update(Client client);

   //Integer deleteByName(int id);

   List<Map<String ,String>>  findBannerByClientName(String name);


}
