package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author lixiaodao
 * @create 2022-04-08 - 16:14
 */
@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    public String  testServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username：" + username);
        System.out.println("password:" + password);
        return "success";

    }
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("username : " + username + "password" + password);
        return "success";
    }

//    @RequestMapping("/testForm")
//    public String testForm(HttpServletRequest request){
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String[] hobby= request.getParameterValues("hobby");
//        System.out.println("username：" + username);
//        System.out.println("password:" + password);
//        System.out.println("hobby" + Arrays.asList(hobby));
//        return "success";
//    }
    @RequestMapping("/testForm")
    public String testForm(
            @RequestParam(value = "user_name",required = false,defaultValue = "lixiaodao") String username,
            String password,
            String[] hobby,
            @RequestHeader(value = "Host",required = true,defaultValue = "haha") String host)
    {
        System.out.println("username: " + username + " password: " + password + " hobby: " + hobby);
        System.out.println("host: " + host);
        return "success";
    }

    @RequestMapping("/testBean")
    public String  testBean(User user){
        System.out.println(user);
        return "success";
    }
}
