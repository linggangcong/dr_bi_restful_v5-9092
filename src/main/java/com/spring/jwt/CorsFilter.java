
package com.spring.jwt;


import org.springframework.core.annotation.Order;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Order(1)
@WebFilter(urlPatterns={"/*"}, filterName="aa")
public class CorsFilter implements Filter {

    static final String HEADER_STRING = "Authorization";
    private final String protectUrlPattern="/test/**";
    private static final PathMatcher pathMatcher = new AntPathMatcher();

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin,x-requested-with,Content-Type,Authorization,Accept,token");

        HttpServletRequest request = (HttpServletRequest) req;
        String webpath=request.getServletPath();
        String token = request.getHeader(HEADER_STRING);
        String tokenResult= JwtUtil.validateToken(token);
        //String aa=request.getServletPath();
        if(tokenResult ==null){
            if(pathMatcher.match(protectUrlPattern, webpath)) {
                System.out.println("this is login page ");
                chain.doFilter(req, res);
            }else {
                System.out.println("not login page and no token ,or username in token is null");
                //throw new ServletException("Wrong token without username");
               // throw new IOException("Wrong token without username");
            }
           // response.sendError(401, "miss token");
        }
        if(tokenResult!=null)
        {
            chain.doFilter(req, res);
        }

    }

    public void init(FilterConfig filterConfig) {}

    public void destroy() {}

}

