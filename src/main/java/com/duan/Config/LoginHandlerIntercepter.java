package com.duan.Config;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginHandlerIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //登录成功之后
        //Object loginUser = request.getSession().getAttribute("loginUser");
        if(request.getSession().getAttribute("loginUser") == null){
            request.setAttribute("msg","没有权限，请先登录");
            request.getRequestDispatcher("/index.html").forward(request,response);
           return false;
        }
        else {
            return true;
        }
    }
}
