package com.zyz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by yongzhou.zhang on 2019/5/28.
 */
@SpringBootApplication
@EnableEurekaClient  //本服务启动后会自动注册进eureka服务中
public class DeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
