package appearance.module.impl;

import java.io.IOException;

import appearance.config.ConfigManager;
import appearance.config.ConfigModel;
import appearance.module.ModuleC;

public class ModuleCImpl implements ModuleC {

	@Override
	public void controller(String msg) throws IOException {
		
		ConfigModel model = 
				ConfigManager.getInstance().getConfigData();
		if(model.isNeedController()){
			System.out.println("正在生成controller的代码.........");
		}
		System.out.println("moduleC:"+msg);
	}

}
