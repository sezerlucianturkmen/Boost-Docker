package com.boost.dockertrial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/docker")
public class DockertrialApplication {

	@GetMapping("")
	public String hello(){
		return "Hello Docker";
	}


	public static void main(String[] args) {
		SpringApplication.run(DockertrialApplication.class, args);
	}

}
