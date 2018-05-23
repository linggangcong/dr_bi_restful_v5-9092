package com.spring.controller;

import com.github.pagehelper.PageHelper;
import com.spring.dao.MessageDao;
import com.spring.model.Message;
import com.spring.service.MessageService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/message")
@Transactional
public class MessageController {
    @Autowired
    private MessageService messageService;
    @Resource
    MessageDao messageDao;

    @PostMapping(value="/add")
    @ResponseBody
    public  CommonResponse addMessage(Message message){
        Integer num = 0;
        num = messageService.addMessage(message);
        return ResponseUtil.success(num);
    }

    @PutMapping("/update")
    @ResponseBody
    public CommonResponse updateMessage(Message message) {

        Integer num = 0;
        num = messageService.update(message);
        return ResponseUtil.success(num);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public CommonResponse deleteMessage(String  id) {
        Integer num = 0;
        num = messageService.deleteById( id);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_id")
    @ResponseBody
    public CommonResponse findByName( String  id){
        Message message = messageService.findById(id);
        if (message==null) {
            return ResponseUtil.exception("message_name不存在");
        }
        return ResponseUtil.success(message);
    }

    /*@GetMapping(value="/find_all")
    @ResponseBody
    public CommonResponse findByTier(  ){
        List<Message> listName = messageService.findAllMessage();
        if (listName==null) {
            return ResponseUtil.exception("message不存在");
        }
        return ResponseUtil.success(listName);
    }
*/
    @GetMapping(value="/find_all")
    @ResponseBody
    public CommonResponse findByTier(int pageSize,int offset) throws  Exception{
        List<Message> listName = messageDao.findAll( pageSize, offset);
        if (listName==null) {
            return ResponseUtil.exception("message不存在");
        }
        return ResponseUtil.success(listName);
    }



    @GetMapping(value="/unread_event_person")
    @ResponseBody
    public CommonResponse findUnreadEvent( String clientName ){
        List<Message> listEvent = messageService.findUnreadEvent(clientName);
        return ResponseUtil.success(listEvent);
    }

    @GetMapping(value="/unread_message_person")
    @ResponseBody
    public CommonResponse findUnreadMessage( String clientName ){
        List<Message> listMessage = messageService.findUnreadMessage(clientName);
        return ResponseUtil.success(listMessage);
    }
    @GetMapping(value="/unread_toall_person")
    @ResponseBody
    public CommonResponse findUnreadToall( String clientName ){
        List<Message> listToall = messageService.findUnreadToall(clientName);
        return ResponseUtil.success(listToall);
    }

    @GetMapping(value="/valid_toall_person")
    @ResponseBody
    public CommonResponse findValidToall( String clientName ){
        List<Message> listToall = messageService.findValidToall(clientName);
        return ResponseUtil.success(listToall);
    }

    @GetMapping(value="/valid_message_person")
    @ResponseBody
    public CommonResponse findValidMassage( String clientName ){
        List<Message> listToall = messageService.findValidMassage(clientName);
        return ResponseUtil.success(listToall);
    }


    @GetMapping(value="/valid_event_person")
    @ResponseBody
    public CommonResponse findValidEvent( String clientName ){
        List<Message> listToall = messageService.findValidEvent(clientName);
        return ResponseUtil.success(listToall);
    }

    @RequestMapping("/unread_event/{currentPage}")
    @ResponseBody
    public CommonResponse message(@PathVariable("currentPage") Integer currentPage, String clientName){
        if(currentPage!= null){
            PageHelper.startPage(currentPage, 2);
        }
        List<Message> messages = messageService.findUnreadEvent(clientName);
        return ResponseUtil.success(messages);
    }
    /*@RequestMapping("/all/{currentPage}")
    @ResponseBody
    public CommonResponse message(@PathVariable("currentPage") Integer currentPage){
        if(currentPage!= null){
            PageHelper.startPage(currentPage, 10);
        }
        List<Message> messages = messageService.findAllMessage();
        return ResponseUtil.success(messages);
    }*/

}
