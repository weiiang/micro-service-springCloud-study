package appearance.facade;

import java.io.IOException;

import appearance.module.impl.ModuleAImpl;
import appearance.module.impl.ModuleBImpl;
import appearance.module.impl.ModuleCImpl;

/**
 * 外观模式
 * 外观
 * @author admin
 *
 */
public class Facade {
	
	public void doCode() throws IOException{
		new ModuleAImpl().dao("facade dao");
		new ModuleBImpl().bussiness("facade business");
		new ModuleCImpl().controller("facade controller");
	}
	
}
