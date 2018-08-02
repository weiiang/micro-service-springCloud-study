package appearance.client;

import java.io.IOException;

import appearance.facade.Facade;

public class Client {
	public static void main(String[] args) throws IOException {
		new Facade().doCode();
	}

}
