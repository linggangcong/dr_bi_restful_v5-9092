package com.spring.mapper.main;

import com.spring.model.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by SAM on 2017/10/11.
 */
@Mapper
public interface MessageMapper {

    Integer addMessage(Message message);

    Integer updateMessage(Message message);

    Integer deleteMessage(String id);

    Message findById(String  id);

    List<Message> findUnreadEvent(String clientName);
    List<Message> findAll();
    //List<Message> findAll(int pageSize,int offset);

    List<Message> findUnreadMessage(String clientName);
    List<Message> findUnreadToall(String clientName);

    List<Message> findValidToall(String clientName);

    List<Message> findValidEvent(String clientName);

    List<Message> findValidMassage(String clientName);




}