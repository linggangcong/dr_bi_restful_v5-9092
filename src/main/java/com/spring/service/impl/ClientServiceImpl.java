package com.spring.service.impl;

import com.spring.mapper.main.ClientMapper;
import com.spring.model.Client;
import com.spring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientMapper clientMapper;

    /*@Override
    public Integer  addClient(String client_id,String idy,String banner_code,String client_name,   //,String email_address,String gender,String headshot_image,
                              String company_name,String pass_word,String start_date,String end_date,  //,String phonenumber,String role,String industry
                              String data_date_start,String data_date_end){
        Integer num=clientMapper.addClient(client_id,idy,  banner_code, client_name,   //,email_address,gender, headshot_image
                company_name, pass_word,  start_date,end_date,   //phonenumber, role,industry,
                data_date_start,data_date_end);
        if(num == 0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }*/


    /*public Integer  addClient(String client_id,String idy){
        Integer num=clientMapper.addClient(client_id,idy);
        if(num == 0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }*/

    public Integer add(Client client){
        return clientMapper.addClient(client);
    }

    @Override
    public Integer update(Client client){
        return clientMapper.updateClient(client);
    }

    @Override
    public Integer deleteByName(String id) {
        return clientMapper.deleteClientByName(id);
    }



    @Override
    public List<Client> findByName(String name) {
        return clientMapper.findClientByName(name);
    }

    @Override
    public Client findById(String id) {
        return clientMapper.findClientById(id);
    }

    @Override
    public List<Client> indistinctClient(String name, String companyName) {
        return clientMapper.indistinctClient(name,companyName);
    }

    @Override
    public boolean validate(Client client) {
        String  name = client.getName();
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        if(name.matches(em)){                 //邮箱登录
            if (null != clientMapper.validateByEmail(client)) {
                return true;
            } else {
                return false;
            }
        }else {                              //就是用户名登录
            if (null != clientMapper.validate(client)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String findId( String name, String password) {
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        if(name.matches(em)) {                        //邮箱登录
            return clientMapper.findIdByEmail(name, password);
        }else{
            return  clientMapper.findId(name, password);
        }
    }

    @Override
    public boolean isDateUseful( String name, String password) {
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        boolean isUseful=false;
        if(name.matches(em)) {//邮箱登录
            String id=clientMapper.isDateUsefulByEmail(name, password);
           if(id !=null ) isUseful= true;
        }else{
            String id= clientMapper.isDateUseful(name, password);
            if(id !=null ) isUseful= true;
        }
        return  isUseful;
    }

    @Override
    public Map<String,String> findIdAndIdentity( String name, String password) {
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        if(name.matches(em)) {                        //邮箱登录
            return clientMapper.findIdIdentityByEmail(name, password);
        }else{
            return  clientMapper.findIdAndIdentity(name, password);
        }

    }
    @Override
    public Map<String,String> findIdBanner(String name, String password) {
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        if(name.matches(em)) {                        //邮箱登录
            return clientMapper.findIdByEmailBanner(name, password);
        }else{
            return  clientMapper.findIdBanner(name, password);
        }
    }
    // 两种登录方法，获取clientId和banner_code,identity. datadate
    @Override
    public Client findIdBannerIdentity(String name, String password) {
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        if(name.matches(em)) {                                   //邮箱登录
            return clientMapper.findIdByEmailBannerIdentity(name, password);
        }else{
            return  clientMapper.findIdBannerIdentity(name, password);
        }
    }
}
