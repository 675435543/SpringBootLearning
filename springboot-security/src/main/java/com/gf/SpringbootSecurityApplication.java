package com.gf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gf.mapper"})
public class SpringbootSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringbootSecurityApplication.class, args );
    }

}
