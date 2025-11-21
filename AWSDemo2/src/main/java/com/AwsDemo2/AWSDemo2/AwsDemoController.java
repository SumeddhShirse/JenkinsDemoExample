package com.AwsDemo2.AWSDemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AwsDemoController {
	
	@GetMapping("/home")
	public String home() {
		return "Hi WelCome to Elastic beanstalk";
	}

}
