package com.springboot.shardingjdbcmasterslave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
/*分库分表加上，其他不用*/
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@EnableConfigurationProperties
@SpringBootApplication
public class ShardingJdbcMasterSlaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcMasterSlaveApplication.class, args);
    }

}
