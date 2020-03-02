package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s! %s";
	private final String var1 = "Jenny";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name, 
							 @RequestParam(value = "data", defaultValue = "LOL") String data){
		return new Greeting(counter.incrementAndGet(), String.format(template, data, name), String.format(var1));
	}
}
