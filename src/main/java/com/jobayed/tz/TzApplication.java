package com.jobayed.tz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.TimeZone;

@SpringBootApplication
public class TzApplication {

	public static void main(String[] args) {
		SpringApplication.run(TzApplication.class, args);
	}

	@PostConstruct
	public void init(){
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));   // It will set UTC timezone
		System.out.println("Spring boot application running in UTC timezone :"+new Date());
	}
}
