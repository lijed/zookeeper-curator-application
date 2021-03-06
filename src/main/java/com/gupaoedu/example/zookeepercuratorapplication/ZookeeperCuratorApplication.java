package com.gupaoedu.example.zookeepercuratorapplication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties
@SpringBootApplication
@MapperScan("com.gupaoedu.example.zookeepercuratorapplication.dal.mapper")
public class ZookeeperCuratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperCuratorApplication.class, args);
    }

}
