package com.greedy.jpa.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.greedy.jpa")    //mybatis config에서 @MapperScan 사용했듯
public class JPAConfiguration {
}
