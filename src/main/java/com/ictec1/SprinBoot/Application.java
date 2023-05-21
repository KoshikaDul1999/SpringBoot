package com.ictec1.SprinBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Value("${type}")
    private String type;
    public static void main(String[] args) {
        SpringApplication.run(com.ictec.SpringBoot.Application.class, args);
    }

    @Bean
    public UrlConfig createUrlConfig(){
        if (this.type.equals("local")){
            return new UrlConfig("http", "loacalhost", "8080");
        }else {
            return new UrlConfig("https","ailab.com");
        }
    }

}
