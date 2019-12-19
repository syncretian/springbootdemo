package com.offcn.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/** webjar示例
 * @author sunny
 * */
@Controller
public class WebJarsDemoController {
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
}