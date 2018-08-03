package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptFeignClientService;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController {
	@Autowired
	private DeptFeignClientService service;
	
	
	@GetMapping("/list")
	public List<Dept> getList(){
		return service.getList();
	}
	
	
	
}
