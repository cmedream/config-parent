package com.cme.config.configclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientApplication {

    private final static Logger log = LoggerFactory.getLogger(ConfigClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
        log.info("ConfigClient 启动成功");
    }

}
