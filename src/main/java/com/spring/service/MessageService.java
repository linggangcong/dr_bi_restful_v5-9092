package com.spring.service;

import com.spring.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SAM on 2017/10/13.
 */
@Service
public interface MessageService {

    Integer addMessage(Message message);

    Integer update(Message message);

    Integer deleteById(String id);

    Message findById(String id);

    /*List<Message> findAllMessage();*/
    List<Message> findAllMessage(int pageSize,int offset);
    List<Message> findUnreadEvent(String clientName);

    List<Message> findUnreadMessage(String clientName);

    List<Message> findUnreadToall(String clientName);

    List<Message> findValidToall(String clientName);

    List<Message> findValidEvent(String clientName);

    List<Message> findValidMassage(String clientName);

    

}
