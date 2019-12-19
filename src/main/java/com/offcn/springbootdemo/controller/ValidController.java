package com.offcn.springbootdemo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@RestController
@Validated
public class ValidController {

    @RequestMapping("/valid/{group:[a-zA-Z0-9_]+}/{userid}")
    public String getCarById3(@PathVariable("group")String group,
                              @PathVariable("userid")String userid) {
        return group+""+userid;

    }

    @RequestMapping("/valid2")
    public String param(@NotBlank(message = "group不能为空")
                        @RequestParam("group") String group,

                        @NotBlank(message = "email不能为空")
                        @Email(message="不符合邮箱规格")
                        @RequestParam("email") String email) {
        return group + ":" + email;
    }
}
