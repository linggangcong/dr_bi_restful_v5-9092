package com.spring.controller;

import com.spring.mapper.main.MessageClientRelMapper;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/message_client_rel")
//加上这个注解，使得支持事务
@Transactional
public class MessageClientRelController {

    @Autowired
    private MessageClientRelMapper messageClientRelMapper;

    @PutMapping(value="/update_show")
    @ResponseBody
    public CommonResponse updateShow( int clientId,int messageId){
         int num=messageClientRelMapper.updateShow(clientId,messageId);
        return ResponseUtil.success(num);
    }
    @PutMapping(value="/update_status")
    @ResponseBody
    public CommonResponse updateStatus(int clientId ,int messageId){
        int num=messageClientRelMapper.updateStatus(clientId , messageId);
        return ResponseUtil.success(num);
    }


}
