package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.mapper.DeptMapper;

@Service
public class DeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	public Dept getById(long deptno){
		return deptMapper.findById(deptno);
	}
	
	public List<Dept> list(){
		return deptMapper.findAll();
	}
	
	public Boolean add(Dept dept){
		return this.deptMapper.addDept(dept);
	}
	
	
	 
}
