package com.spring.mapper.main;

import com.spring.model.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface ClientMapper {

    /*Integer addClient(String id,String idy, String bannerCode,String name,    //,String emailAddress,String gender,String headshot,
         String companyName,String pwd,String startDate,String endDate,   //,String phoneNum,String role,String industry
         String dataDateStart,String dataDateEnd);*/

    Integer addClient(Client client);
   /* Integer addClient(Map paramMap);*/
   // Integer addClient(String client_id,String idy);   //多参数，索引  ,测试ok.


    Integer updateClient(Client client);
    Integer deleteClientByName(String id);
    Client findClientById(String id );
    List<Client> indistinctClient(@Param("name") String clientName, @Param("companyName") String companyName);
    //  BI前端接口
    List<Client> findClientByName(String name);

    //返回clientId和Identity.
    Map<String,String> findIdAndIdentity(@Param("clientName") String clientName, @Param("password") String password);
    Map<String,String> findIdIdentityByEmail(@Param("emailAddress") String emailAddress, @Param("password") String password);

    //返回clientId
    String findId(@Param("clientName") String clientName, @Param("password") String password);
    String findIdByEmail(@Param("emailAddress") String emailAddress, @Param("password") String password);

    //返回clientId和banner_code.
    Map<String,String> findIdBanner(@Param("clientName") String clientName, @Param("password") String password);
    Map<String,String> findIdByEmailBanner(@Param("emailAddress") String emailAddress, @Param("password") String password);


    //返回clientId和banner_code,identity. datadate
    Client findIdBannerIdentity(@Param("clientName") String clientName, @Param("password") String password);
    Client findIdByEmailBannerIdentity(@Param("emailAddress") String emailAddress, @Param("password") String password);

    Client validate(Client client);   //数据库密码写成密文。
    Client validateByEmail(Client client);

    //验证用户登录日期有效
    String isDateUseful(@Param("clientName") String clientName, @Param("password") String password);
    String isDateUsefulByEmail(@Param("emailAddress") String emailAddress, @Param("password") String password);

}

















