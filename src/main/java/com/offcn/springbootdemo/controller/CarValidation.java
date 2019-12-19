package com.offcn.springbootdemo.controller;

import com.offcn.po.Car;
import com.offcn.po.ValidCar;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/java003")
public class CarValidation {
    @RequestMapping("/getcarvalidation1")
    public ValidCar getcarvalidation1(@RequestBody @Validated ValidCar car) {

        return car;
    }

    @RequestMapping("/carvalid2")
    public String getcarvalidation4(@Validated ValidCar car, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        }
        return car.toString();
    }

    @InitBinder
    private void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
    }
}