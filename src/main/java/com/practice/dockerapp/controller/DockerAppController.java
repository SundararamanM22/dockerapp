package com.practice.dockerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerAppController {
	@GetMapping(value = "/display")
	public String display() {
		return "Docker App is ON";
	}
}
