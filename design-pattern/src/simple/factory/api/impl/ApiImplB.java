package simple.factory.api.impl;

import simple.factory.api.Api;

public class ApiImplB implements Api{

	@Override
	public void operation(String operation) {
		System.out.println("ImplB:"+operation);
	}

}
