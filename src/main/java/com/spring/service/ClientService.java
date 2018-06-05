package com.spring.service;

import com.spring.model.Client;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface ClientService {

   Integer add(Client client);
   Integer update(Client client);

   Integer deleteByName(String id);

   List<Client> findByName(String name);

   Client findById(String id);

   String[] getDate(String name,  String password);

   List<Client> indistinctClient(String name , String companyName);

   boolean validate(Client client);


   String findId( String name,  String password);
   boolean isDateUseful( String name,  String password);

   Map<String,String> findIdAndIdentity( String name,  String password);

   Map<String,String> findIdBanner(String name, String password);

   Client  findIdBannerIdentity(String name, String password);
}
