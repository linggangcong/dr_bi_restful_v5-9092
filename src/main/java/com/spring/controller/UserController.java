package com.spring.controller;

import com.spring.model.User;
import com.spring.service.UserService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/protected/user")
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);

    /*@PostMapping (value = "login" ,produces="application/json;charset=UTF-8" )
    public CommonResponse login(javax.servlet.http.HttpServletRequest request, HttpServletResponse response, @ModelAttribute User user){
        return userService.login(request, response, user);
    }*/

    @Resource
    private UserService userService;

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addUser(User user){
        int num=userService.addUser(user);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateUser( User user){
        int num=userService.update(user);
        return ResponseUtil.success(num);
    }
    @PutMapping(value="/update_pwd")
    @ResponseBody
    public CommonResponse updateUser( String pwd ,Integer userId){
        int num=userService.updatePwd(pwd,userId);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteUser( @Param("id")int id){
        int num= userService.deleteByName(id);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@Param("name") String name){
        List<User> list= userService.findByName(name);
        return ResponseUtil.success(list);
    }

    @GetMapping(value="/login")
    @ResponseBody
    public CommonResponse login( String name ,String pwd){
        User user= userService.login(name ,pwd);

        if (user != null){
           return ResponseUtil.success("true" ,user);
        }else {

            return ResponseUtil.success("false");
        }
    }
    @GetMapping(value="/find_id")
    @ResponseBody
    public CommonResponse findId(User user){
        String id = userService.findId(user);
        return ResponseUtil.success(id);
    }


}