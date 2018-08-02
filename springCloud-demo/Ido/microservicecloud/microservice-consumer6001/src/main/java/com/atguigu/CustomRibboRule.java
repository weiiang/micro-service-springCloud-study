package com.atguigu;

import java.util.List;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

public class CustomRibboRule extends AbstractLoadBalancerRule{

	private int total = 0;//当前服务调用次数
	private int currentIndex = 0;//调用到了那个服务
	
	@Override
	public Server choose(Object arg0) {
		ILoadBalancer LB = super.getLoadBalancer();
		
		Server server = null;
		if(LB == null){
			return null;
		}
		while(server == null){
			List<Server> upList = LB.getReachableServers();
			List<Server> allList = LB.getAllServers();
			int serverCount = allList.size();
			if(Thread.interrupted()){
				return server;
			}
			if (serverCount == 0) {
				return server;
			}
			if (total < 5) {
				total ++;
				return upList.get(currentIndex);
			}else{
				currentIndex ++;
				total = 0;
				if (currentIndex >= upList.size()){
					currentIndex = 0;
				}
			}
			
		}
		
		
		return null;
	}

	
	

	@Override
	public void initWithNiwsConfig(IClientConfig arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
