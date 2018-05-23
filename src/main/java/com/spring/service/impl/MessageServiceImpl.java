package com.spring.service.impl;

import com.spring.dao.MessageDao;
import com.spring.mapper.main.MessageMapper;
import com.spring.model.Message;
import com.spring.service.MessageService;
import com.spring.util.ExceptionUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by SAM on 2017/10/13.
 */

@Service
@Scope("prototype")
public class MessageServiceImpl implements MessageService{
    @Resource
    MessageMapper messageMapper;
    @Resource
    MessageDao messageDao;

    @Override
    public Integer addMessage(Message message) {
       Integer num=messageMapper.addMessage(message);
       if(num==0){
           ExceptionUtil.dataNotExistException("增加失败");
       }
        return num;
    }
    @Override
    public Integer update(Message message) {
        Integer num=messageMapper.updateMessage(message);
        if(num==0){
            ExceptionUtil.dataNotExistException("更新失败");
        }
        return num;
    }

    @Override
    public Message findById(String  id) {
       return messageMapper.findById(id);
    }

    /*@Override
    public List<Message> findAllMessage() {
       List<Message>  list=messageMapper.findAll();
        return list;
    }*/
    @Override
    public List<Message> findAllMessage(int pageSize,int offset){
        return messageDao.findAll(pageSize, offset);
    }


    @Override
    public Integer deleteById(String  id) {
        Integer num=messageMapper.deleteMessage(id);
        if(num==0){
            ExceptionUtil.dataNotExistException("删除失败");
        }
        return num;
    }

    @Override
    public List<Message> findUnreadEvent(String clientName) {
        List<Message> listEvent=messageMapper.findUnreadEvent(clientName);
        if(listEvent==null){
            ExceptionUtil.dataNotExistException("查找失败");
        }
        return listEvent;
    }

    @Override
    public List<Message> findUnreadMessage(String clientName) {
        List<Message> listEvent=messageMapper.findUnreadMessage(clientName);
        if(listEvent==null){
            ExceptionUtil.dataNotExistException("查找失败");
        }
        return listEvent;
    }

    @Override
    public List<Message> findUnreadToall(String clientName) {
        List<Message> listEvent=messageMapper.findUnreadToall(clientName);
        if(listEvent==null){
            ExceptionUtil.dataNotExistException("查找失败");
        }
        return listEvent;
    }
    @Override
    public List<Message> findValidToall(String clientName) {
        List<Message> listEvent=messageMapper.findValidToall(clientName);
        if(listEvent==null){
            ExceptionUtil.dataNotExistException("查找失败");
        }
        return listEvent;
    }
    @Override
    public List<Message> findValidEvent(String clientName) {
        List<Message> listEvent=messageMapper.findValidEvent(clientName);
        if(listEvent==null){
            ExceptionUtil.dataNotExistException("查找失败");
        }
        return listEvent;
    }
    @Override
    public List<Message> findValidMassage(String clientName) {
        List<Message> listEvent=messageMapper.findValidMassage(clientName);
        if(listEvent==null){
            ExceptionUtil.dataNotExistException("查找失败");
        }
        return listEvent;
    }





}
