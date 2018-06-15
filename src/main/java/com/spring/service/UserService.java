package com.spring.service;

import com.spring.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserService {

    //CommonResponse login(HttpServletRequest request, HttpServletResponse response, User user);
    Integer  addUser(User user);

    Integer update(User user);
    Integer updatePwd(String pwd,Integer userId);

    Integer deleteByName(int id);

    List<User> findByName(String name);

    User login(String name,String pwd);

    boolean validate(User user);

    String findId(User user);
}
