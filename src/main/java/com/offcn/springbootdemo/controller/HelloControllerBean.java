package com.offcn.springbootdemo.controller;

import com.offcn.po.TestUser;
import com.offcn.po.UserBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({UserBody.class,TestUser.class})
public class HelloControllerBean {
    @Autowired
    UserBody userbody;
    @Autowired
    TestUser testUser;

    @GetMapping("/getUser")
    public String getUser(){
        return userbody.toString();
    }

    @GetMapping("/gettestuser")
    public String gettestUser() {
        return testUser.toString();
    }
}