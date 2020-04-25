package com.example.gitdome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitdomeApplication {
	    @GetMapping(value = "hello")
		public String getStu(){

	    	return "hello world,fbiven";
		}


	public static void main(String[] args) {
		SpringApplication.run(GitdomeApplication.class, args);
	}

}
