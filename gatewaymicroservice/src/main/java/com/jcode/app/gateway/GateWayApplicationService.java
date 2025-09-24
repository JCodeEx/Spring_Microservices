package com.jcode.app.gateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * Gateway Service
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateWayApplicationService
{
    public static void main( String[] args )
    {
        SpringApplication.run(GateWayApplicationService.class, args);
        System.out.println( "Hello World!" );
    }
}
