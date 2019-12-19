package com.offcn.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

@Data //get 、set
@AllArgsConstructor //所有参数的有参数构造函数
@NoArgsConstructor  //无参数构造函数
public class ValidCar {
    @Max(value=100,message="id不能大于100")
    private Integer id;
    @NotBlank(message="用户名不能为空")
    @Length(min = 2, max = 10, message = "用户名 长度必须在 {min} - {max} 之间")
    private String name;
    @DecimalMin(value="1.0",message="价格最低1元")
    @DecimalMax(value="10.0",message="价格最高10元")
    private Float price;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd hh:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createdate;

    //忽略字段，不转换为json
    @JsonIgnore
    private String memo;

    //当属性值为空时候，不转换为json
    @JsonInclude
    @NotNull(message="属性字段不能为空")
    @NotBlank(message="属性字段不能为空白")
    private String isnull;


    @Pattern(regexp = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$",
            message = "手机号格式不合法")
    private String mobile;

    //验证邮箱格式
    @Pattern(regexp = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$",
            message = "邮箱格式不合法")
    private String email;

}
