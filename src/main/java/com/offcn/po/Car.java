package com.offcn.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data //get 、set
@AllArgsConstructor //所有参数的有参数构造函数
@NoArgsConstructor  //无参数构造函数
public class Car {
    private Integer id;
    private String name;
    private Float price;

    private Date createdate;

    private String mobile;

}
