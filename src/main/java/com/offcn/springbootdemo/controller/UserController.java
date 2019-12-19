package com.offcn.springbootdemo.controller;

import com.offcn.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/users-test")
public class UserController {

    private List<User> listUser= Collections.synchronizedList(new ArrayList<User>());
    /***
     * 获取全部用户信息
     * @return
     */
    @GetMapping("/")
    public List<User> getUserList(){
        return listUser;
    }
}
