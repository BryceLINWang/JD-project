package edu.xalead;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulServer
@SpringCloudApplication
public class JDGateway {
    public static void main(String[] args) {
        SpringApplication.run(JDGateway.class);
    }
}
