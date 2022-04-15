package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lixiaodao
 * @create 2022-04-12 - 14:58
 */
@Controller
public class TestController {
    @RequestMapping("/**/testInterceptor")
    public String testInterceptor(){
        return  "success";
    }
}
