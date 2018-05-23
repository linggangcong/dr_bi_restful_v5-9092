package com.spring.service.impl;


import com.spring.mapper.main.UserMapper;
import com.spring.model.User;
import com.spring.service.UserService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LogManager.getLogger(UserService.class);
    @Autowired
    UserMapper mapper;
       /* @Autowired
        private JwtUtil jwt;*/

        /*@Override
        public CommonResponse login(HttpServletRequest request, HttpServletResponse response, User user){
            try {
                if(!"admin".equals(user) || !"123456".equals(user)){
                    return ResponseUtil.exception("账号或者密码错误");
                }
                user.setRoleId(1);
                String subject = JwtUtil.generalSubject(user);
                String token = jwt.createJWT(Constant.JWT_ID, subject, Constant.JWT_TTL);
                String refreshToken = jwt.createJWT(Constant.JWT_ID, subject, Constant.JWT_REFRESH_TTL);
                JSONObject jo = new JSONObject();
                jo.put("token", token);
                jo.put("refreshToken", refreshToken);
                return ResponseUtil.success(jo);
            } catch (Exception e) {
                logger.error(e);
                return ResponseUtil.unKonwException();
            }
        }*/

    @Override
    public Integer addUser(User user) {
        return mapper.addUser(user);
    }

    @Override
    public Integer update(User user) {
        return mapper.updateUser(user);
    }

    @Override
    public Integer updatePwd(String pwd,Integer userId) {
        return mapper.updatePwd(pwd,userId);
    }

    @Override
    public Integer deleteByName(int id) {
        return mapper.deleteUserByName(id);
    }

    @Override
    public List<User> findByName(String name) {
        return mapper.findUserByName(name);
    }

    @Override
    public User  login(String name ,String pwd) {
        return mapper.login(name ,pwd);

    }

    @Override
    public boolean validate(User user) {
        //就是用户名登录
        if (null != mapper.validate(user)) {
            return true;
        } else {
            return false;
        }
    }
}