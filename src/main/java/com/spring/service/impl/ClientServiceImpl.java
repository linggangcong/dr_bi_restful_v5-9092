package com.spring.service.impl;

import com.spring.mapper.main.ClientMapper;
import com.spring.model.Client;
import com.spring.service.ClientService;
import com.spring.util.CalendarUtil;
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

   /* public Integer add1(Client client){   //接收参数
        Md5Util.parseStrToMd5L32(client.getPassword());
        return clientMapper.addClient(client);
    }*/

    @Override
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

    //用户名和邮箱登录，获取'数据展示结束日期'。
    @Override
    public String[] getDate(String name, String password) {
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String[] endDate =new String[2] ;
        if(name.matches(em)){
           Client c= clientMapper.getDateByEmail(name,password);
           endDate= CalendarUtil.getDate(c.getPublishType(),c.getDayOfMonth(),c.getDayOfWeek());
        }else {
            Client c1= clientMapper.getDate(name,password);
            endDate= CalendarUtil.getDate(c1.getPublishType(),c1.getDayOfMonth(),c1.getDayOfWeek());
        }
        return  endDate;
    }

    @Override
    public List<Client> findByName(String name) {
        return clientMapper.findClientByName(name);
    }
    @Override
    public List<Client> findAll() {
        return clientMapper.findAll();
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

    @Override
    public List<Map<String,String>> findDataStatusByName(String clientName) {
        return  clientMapper.findDataStatusByName(clientName);
    }
}
