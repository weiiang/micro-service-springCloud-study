package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;

@RestController
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@Autowired
	private DiscoveryClient discoverCilent;
	
	
	@GetMapping("/list")
	public List<Dept> list(){
		return deptService.list();
	}
	
	@GetMapping("/{deptno}")
	public Dept getById(@PathVariable("deptno")Long deptno){
		return this.deptService.getById(deptno);
	}
	
	@PostMapping("/add")
	public Boolean add(@RequestBody Dept dept){
		return deptService.add(dept);
	}
	
	@GetMapping("/discovery")
	public Object discovery(){
		List<String> list = discoverCilent.getServices();
		System.out.println(list.toString());
		
		List<ServiceInstance> instanceList = discoverCilent.getInstances("PROVIDER8001");
		for(ServiceInstance intsance: instanceList){
			System.out.println(intsance.getServiceId()+"\n"+intsance.getHost()+"\n"+intsance.getPort());
		}
		return this.discoverCilent;
	}

}
