package simple.factory.api.impl;

import simple.factory.api.Api;

public class ApiImplA implements Api{

	@Override
	public void operation(String operation) {
			System.out.println("ImplA:"+operation);
	}

}
