package com.offcn.po;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "testuser")
@Data
@ToString
public class TestUser {
    private String name;
    private String password;
    private String birthday;
}
