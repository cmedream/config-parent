package com.cme.config.configserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 加上@EnableConfigServer注解开启配置服务器的功能
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    private final static Logger log = LoggerFactory.getLogger(ConfigServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
        log.info("配置服务器启动成功");
    }

}
