package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lixiaodao
 * @create 2022-04-10 - 16:43
 */
@Controller
public class JspController {
    @RequestMapping("/success")
    public String index(){
        return "success";
    }
}
