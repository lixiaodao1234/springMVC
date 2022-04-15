package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lixiaodao
 * @create 2022-04-09 - 11:28
 */
@Controller
public class TestController {

//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("/test_view")
    public String testView(){
        return "test_view";
    }
}
