package simple.factory.client;

import java.io.IOException;

import simple.factory.ApiFactory;
import simple.factory.api.Api;

public class Client {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException{
		Api apiA = ApiFactory.getInstance();
		Api apiB = ApiFactory.getInstance();
		apiA.operation("operation");
		apiB.operation("operation");
	}
}
