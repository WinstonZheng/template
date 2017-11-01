package com.winston.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * author: winston
 * date: 10/29/2017.
 * description:
 */
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class Application {

    public static void main(String[] args){
        SpringApplication.run( Application.class, args);
    }

}
