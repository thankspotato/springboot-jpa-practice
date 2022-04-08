package com.greedy.jpa.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.greedy.jpa")
public class BeanConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        /* Service에서 의존성 주입을 해주려면 ModelMapper객체가 Bean으로 생성되어 관리할 수 있어야함 */
        return new ModelMapper();
    }
}
