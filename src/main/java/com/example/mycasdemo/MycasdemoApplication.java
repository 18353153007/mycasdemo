package com.example.mycasdemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ImportResource(locations = {"classpath:application-security2.xml"})
@EnableWebSecurity
public class MycasdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycasdemoApplication.class, args);
    }

}
