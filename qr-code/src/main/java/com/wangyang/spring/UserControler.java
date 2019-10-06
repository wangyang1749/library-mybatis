package com.wangyang.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserControler {

    @RequestMapping("setSession")
    public void setSession(HttpSession session){
        session.setAttribute("user","张三");
    }
    @RequestMapping("getSession")
    public void getSession(HttpSession session){
        String str = ((String)session.getAttribute("user"));
        System.out.println(str);
    }
}
