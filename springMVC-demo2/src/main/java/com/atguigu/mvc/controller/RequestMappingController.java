package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lixiaodao
 * @create 2022-04-06 - 17:02
 */
@Controller
//@RequestMapping("/test")
public class RequestMappingController {
//    @RequestMapping("/testRequestMapping")
    @RequestMapping(value = {"/testRequestMapping","test"})
    public String success(){
        return "success";
    }

    @RequestMapping(
            value = {"/testRequestMapping1","/test1"}
//            method = {RequestMethod.GET,RequestMethod.POST}
    )
    public String testRequestMapping(){
        return "success";
    }
}
