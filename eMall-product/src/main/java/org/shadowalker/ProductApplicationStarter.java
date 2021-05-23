package org.shadowalker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Shadowalker
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplicationStarter.class, args);
    }
}
