package com.offcn.springbootdemo.controller;

import com.offcn.po.Car;
import org.springframework.cache.CacheManager;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/findone")
    public Car findOneCar(){
        Car car = new Car(1, "toyo", 1999.99F,new Date(),"13567890001");


        return car;
    }

    @RequestMapping("/getall")
    public List<Car> getAll(){
        List<Car> list=new ArrayList<>();
        Car car1 = new Car(1, "toyo", 1999.99F,new Date(),"13567890001");
        Car car2= new Car(2, "dazhong", 2999.99F,new Date(),"13567890001");
        Car car3 = new Car(3, "fengtian", 3999.99F,new Date(),"13567890001");
        Car car4 = new Car(4, "benchi", 4999.99F,new Date(),"13567890001");


        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);

        return list;

    }

    @RequestMapping("/getcar2/{name}")
    public Car getCarById(@RequestParam(name="id") Integer id, @PathVariable(name="name") String name) {
        Car car = new Car();
        car.setId(id);
        car.setName(name);
        car.setPrice(100000.99F);
        car.setCreatedate(new Date());

        return car;
    }

    @RequestMapping("/getcar3")
    public Car getCarById(@RequestBody Car car) {
        return car;
    }

    @RequestMapping("/getcar4")
    public Car getCarById2(Car car) {
        return car;
    }

    @InitBinder
    private void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
    }
}
