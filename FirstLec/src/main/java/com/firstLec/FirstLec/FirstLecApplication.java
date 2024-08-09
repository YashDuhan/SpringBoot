package com.firstLec.FirstLec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstLecApplication implements CommandLineRunner {

//	The Autowire tells Spring to automatically inject a bean
	@Autowired
	Apple apple1;

	@Autowired
	Apple apple2;

//	This is a static function, and we can't initialise the bean object here
	public static void main(String[] args) {
		SpringApplication.run(FirstLecApplication.class, args);
	}


//	This will create a non-static function to use the bean object
	@Override
	public void run(String... args) throws Exception {
		apple1.eatApple();
		apple2.eatApple();
	}
}
