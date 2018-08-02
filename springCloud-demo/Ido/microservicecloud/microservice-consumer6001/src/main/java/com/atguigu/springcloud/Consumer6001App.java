package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.atguigu.CustomRibboRule;

@EnableEurekaClient
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@RibbonClient(name="PROVIDER", configuration = CustomRibboRule.class)
public class Consumer6001App {
	
	public static void main(String[] args) {
		SpringApplication.run(Consumer6001App.class, args);
	}

}
