package com.spring.mapper.main;

import com.spring.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Mapper
public interface UserMapper {


    Integer updateUser(User user);
    Integer updatePwd( String  pwd, Integer userId);

    Integer addUser(User user);

    Integer deleteUserByName(int id);

    List<User> findUserByName(String name);

    User login(@Param("name") String name, @Param("pwd") String pwd);

    User validate(User user);


}
