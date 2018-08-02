package simple.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import simple.factory.api.Api;

/**
 * �򵥹���ģʽ
 * @author admin
 *
 */
public class ApiFactory {
	
	public static Api getInstance() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		Api api = null;
		Properties p = new Properties();
		InputStream in = ApiFactory.class.getResourceAsStream("factory.properties");
		p.load(in);
		//���ﴫ��Ĳ����ǻ�ȡAPI�ľ����ʵ����,����������ʱ���ڴ��ж�̬��ȡ���ߴ����ݿ��ȡ
		api = (Api) Class.forName(p.getProperty("ApiImplA")).newInstance();
		return api;
	}

}
