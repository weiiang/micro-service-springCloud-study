package com.atguigu.springcloud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.atguigu.springcloud.entity.Dept;

@Mapper
public interface DeptMapper {
	
	
	List<Dept> findAll();
	
	Dept findById(@Param("deptno") Long deptno);
	
	Boolean addDept(Dept dept);

}
