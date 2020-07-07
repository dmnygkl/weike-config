package com.weike.edu.edu.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WeikeCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeikeCloudConfigApplication.class, args);
	}

}
