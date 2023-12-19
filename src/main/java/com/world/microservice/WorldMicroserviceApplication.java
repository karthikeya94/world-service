package com.world.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class WorldMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldMicroserviceApplication.class, args);
	}

	@Autowired
	private Environment environment;

	@GetMapping("/world")
	public String getWorld(){
		return "world: "+environment.getProperty("local.server.port");
	}

}
