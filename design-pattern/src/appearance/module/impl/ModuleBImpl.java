package appearance.module.impl;

import java.io.IOException;

import appearance.config.ConfigManager;
import appearance.config.ConfigModel;
import appearance.module.ModuleB;

public class ModuleBImpl implements ModuleB {

	@Override
	public void bussiness(String msg) throws IOException {
		ConfigManager.getInstance();
		ConfigModel model = 
				ConfigManager.getConfigData();
		if(model.isNeedBussiness()){
			System.out.println("正在生成bussiness的代码..............");
		}
		System.out.println("moduleB:"+msg);
	}

}
