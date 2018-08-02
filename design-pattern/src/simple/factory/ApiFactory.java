package simple.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import simple.factory.api.Api;

/**
 * 简单工厂模式
 * @author admin
 *
 */
public class ApiFactory {
	
	public static Api getInstance() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		Api api = null;
		Properties p = new Properties();
		InputStream in = ApiFactory.class.getResourceAsStream("factory.properties");
		p.load(in);
		//这里传入的参数是获取API的具体的实现类,可以在运行时从内存中动态获取或者从数据库读取
		api = (Api) Class.forName(p.getProperty("ApiImplA")).newInstance();
		return api;
	}

}
