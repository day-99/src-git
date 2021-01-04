package com.sm.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.sm.cn.mapper")
@EnableTransactionManagement//开启事务
public class CrmGetApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrmGetApplication.class);
    }
}
