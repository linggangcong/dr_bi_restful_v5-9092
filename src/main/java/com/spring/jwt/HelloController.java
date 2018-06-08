package com.spring.jwt;

import com.spring.model.Client;
import com.spring.model.User;
import com.spring.service.ClientService;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.spring.jwt.JwtUtil.HEADER_STRING;
import static com.spring.jwt.JwtUtil.TOKEN_PREFIX;

/**
 * Created by SAM on 2017/12/4.
 */
@Controller
@RequestMapping("/test")
public class HelloController {
    @Autowired
    ClientService clientService;
    @Autowired
    UserService userService;

    @PostMapping(value="/login")
    @ResponseBody
    public String login(HttpServletResponse response, @RequestBody Client client) throws IOException {
        //client.setPassword(Md5Util.parseStrToMd5L32(client.getPassword()));    //用户输入的字符串加密，然后验证。
        if(clientService.validate(client)) {                                    //验证用户,确认用户存在于dim_client，返回令牌头字段。 0518日期
            String jwt = JwtUtil.generateToken(client.getName());
            response.setHeader("Access-Control-Allow-Origin", "*");   //根据david添加。
            response.setHeader("Access-Control-Allow-Methods", "*");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "*");
            response.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + jwt);          //响应头设置token，并放入主体。
            return jwt;
        }else
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Wrong client");
            return null;
    }

    @PostMapping(value="/inner_user_login")
    @ResponseBody
    public String innerUserLogin(HttpServletResponse response, @RequestBody User user) throws IOException {
        if(userService.validate(user)) {
            String jwt = JwtUtil.generateToken(user.getName());
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Methods", "*");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "*");
            response.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + jwt);
            return jwt;
        }else
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Wrong client");
        return null;
    }

}
