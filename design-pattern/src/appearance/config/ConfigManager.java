package appearance.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ��ȡ��������,���󶨵�ConfigModel��ȥ
 * @author admin
 *
 */
public class ConfigManager {
	
	private static ConfigManager manager = null;
	private static ConfigModel model = null;
	
	
	//˽�л����췽��
	private ConfigManager(){
		
	}
	
	public static ConfigManager getInstance() throws IOException{
		if(manager == null){
			manager = new ConfigManager();
		}
		model = new ConfigModel();
		Properties p = new Properties();
		InputStream in = ConfigManager.class.getResourceAsStream("need.properties");
		p.load(in);
		model.setNeedBussiness(Boolean.parseBoolean(p.getProperty("isNeedBusiness")));
		model.setNeedController(Boolean.parseBoolean(p.getProperty("isNeedController")));
		model.setNeedDao(Boolean.parseBoolean(p.getProperty("isNeedDao")));
		return manager;
	} 
	
	public static ConfigModel getConfigData(){
		if (model == null) {
			model = new ConfigModel();
			//��ȡ�����ļ�����ֵ
		}
		return model;
	}

}
