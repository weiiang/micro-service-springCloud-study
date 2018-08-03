package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.atguigu.springcloud.entity.Dept;

@FeignClient(name = "PROVIDER")
public interface DeptFeignClientService {
	
	@GetMapping("/dept/list")
	public List<Dept> getList();
	
	@GetMapping("/dept/{id}")
	public Dept getById(@PathVariable("id")long id);
	
	@PostMapping("/dept/add")
	public boolean add(@RequestBody Dept dept);

}
