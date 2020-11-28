package com.demo.ems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
// 相当于@Controller+@ResponseBody两个注解的结合
// 返回json数据不需要在方法前面加@ResponseBody注解了
// 但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
public class TestController {
    @GetMapping("test")
    public String test(){
        System.out.println("test invoked!");
        return "testing...";
    }
}
