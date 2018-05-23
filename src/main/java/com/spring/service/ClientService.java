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
   
   /*Integer  addClient(String client_id,String idy, String banner_code,String client_name,   //,String email_address,String gender,String headshot_image
                      String company_name,String pass_word,String start_date,String end_date,  //,String phonenumber,String role,String industry
                      String data_date_start,String data_date_end);*/
   Integer add(Client client);
   Integer update(Client client);

   Integer deleteByName(String id);

   List<Client> findByName(String name);

   Client findById(String id);

   List<Client> indistinctClient(String name , String companyName);

   boolean validate(Client client);

   String findId( String name,  String password);
   boolean isDateUseful( String name,  String password);

   Map<String,String> findIdAndIdentity( String name,  String password);

   Map<String,String> findIdBanner(String name, String password);

   Client  findIdBannerIdentity(String name, String password);
}
