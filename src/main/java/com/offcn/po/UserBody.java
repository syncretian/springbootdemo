package com.offcn.po;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="userbody")
@Data
@ToString
public class UserBody {
    private String name;
    private String password;
    private String birthday;
    private String mobile;
    private String address;

}