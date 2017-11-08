package com.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xingguanghui
 * @create 2017-11-08 16:22
 **/
@SpringBootApplication
@EnableEurekaClient

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
