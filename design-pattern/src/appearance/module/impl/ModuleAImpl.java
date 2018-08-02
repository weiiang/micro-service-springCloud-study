package appearance.module.impl;

import java.io.IOException;

import appearance.config.ConfigManager;
import appearance.config.ConfigModel;
import appearance.module.ModuleA;

public class ModuleAImpl implements ModuleA {

	@Override
	public void dao(String msg) throws IOException {
		ConfigManager.getInstance();
		ConfigModel model = 
				ConfigManager.getConfigData();
		if(model.isNeedDao()){
			//生成Dao的代码
			System.out.println("正在生成Dao的代码...................");
		}
		System.out.println("moduleA:"+msg);
	}

}
