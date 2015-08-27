package com.hp.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run("classpath:spring-config.xml", args);
    }

    public void run(String... args) throws Exception{
        Logger logger = LoggerFactory.getLogger(Application.class);
        logger.info("Application is running...");
    }
}