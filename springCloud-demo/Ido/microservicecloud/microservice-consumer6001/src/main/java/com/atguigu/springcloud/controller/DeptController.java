package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entity.Dept;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController {
	private static final String REST_URL = "http://PROVIDER";
	@Autowired
	private RestTemplate template;
	
	
	@SuppressWarnings("unchecked")
	@GetMapping("/list")
	public List<Dept> getList(){
		return template.getForObject(REST_URL+"/dept/list", List.class);
	}
	
	
	
}
