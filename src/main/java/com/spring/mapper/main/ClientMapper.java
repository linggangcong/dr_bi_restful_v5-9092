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

    Integer addClient(Client client);

    Integer updateClient(Client client);

    Integer deleteClientByName(String id);
    Client findClientById(String id );

    List<Client> indistinctClient(@Param("name") String clientName);
    // BI前端接口
    List<Client> findClientByName(String name);
    List<Client> findAll();

    //返回clientId和Identity.
    Map<String,String> findIdAndIdentity(@Param("clientName") String clientName, @Param("password") String password);
    Map<String,String> findIdIdentityByEmail(@Param("emailAddress") String emailAddress, @Param("password") String password);

    //返回clientId
    String findId(@Param("clientName") String clientName, @Param("password") String password);
    String findIdByEmail(@Param("emailAddress") String emailAddress, @Param("password") String password);

    //返回clientId
    Client getDate(@Param("clientName") String clientName, @Param("password") String password);
    Client getDateByEmail(@Param("emailAddress") String emailAddress, @Param("password") String password);

    //返回clientId和banner_code.
    Map<String,String> findIdBanner(@Param("clientName") String clientName, @Param("password") String password);
    Map<String,String> findIdByEmailBanner(@Param("emailAddress") String emailAddress, @Param("password") String password);


    //返回clientId和banner_code,identity. datadate
    Client findIdBannerIdentity(@Param("clientName") String clientName, @Param("password") String password);
    Client findIdByEmailBannerIdentity(@Param("emailAddress") String emailAddress, @Param("password") String password);

    Client validate(Client client);     //数据库密码写成密文。
    Client validateByEmail(Client client);

    //验证用户登录日期有效
    String isDateUseful(@Param("clientName") String clientName, @Param("password") String password);
    String isDateUsefulByEmail(@Param("emailAddress") String emailAddress, @Param("password") String password);

    List<Map<String,String>> findDataStatusByName(String clientName);

}

















