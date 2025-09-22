package com.atguigu.gulimall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyy
 * @version v1.0.0
 * @date 2025/9/16 00:13
 * @description
 */
@MapperScan("com.atguigu.gulimall.ware.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallWareApplication.class, args);
    }

}
