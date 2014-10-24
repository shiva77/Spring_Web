package com.shiva.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public String main(){
		return "봉근 메롱";
	}
	
	@RequestMapping("/a")
	public String main2(){
		return "봉근 메롱";
	}
}
