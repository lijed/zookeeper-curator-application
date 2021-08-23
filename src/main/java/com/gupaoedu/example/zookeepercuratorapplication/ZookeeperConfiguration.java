/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupaoedu.example.zookeepercuratorapplication;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/8/22
 **/
@Data
@ConfigurationProperties(prefix = "zookeeper.server")
@Configuration
public class ZookeeperConfiguration {

    private String connectionString;
}
