package com.lvce.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient 
@RestController
public class ServiceHi {
	public static void main(String[] args) {
		SpringApplication.run(ServiceHi.class, args);
	}
	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "forezp") String name){
		System.out.println("123");
		System.out.println("234");
		System.out.println("234");
		System.out.println("456");
		return "hi "+name+",i am from port:" +port;
	}
}
