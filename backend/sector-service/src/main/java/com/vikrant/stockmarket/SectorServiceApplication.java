package com.vikrant.stockmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author vikrant
 * 04-11
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SectorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SectorServiceApplication.class, args);
    }

}
