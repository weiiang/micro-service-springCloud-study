package appearance.config;

/**
 * 配置文件Model
 * 存放配置数据
 * @author admin
 *
 */
public class ConfigModel {
	
	private boolean needDao = true;
	private boolean needBussiness = true;
	private boolean needController = true;
	public boolean isNeedDao() {
		return needDao;
	}
	public void setNeedDao(boolean needDao) {
		this.needDao = needDao;
	}
	public boolean isNeedBussiness() {
		return needBussiness;
	}
	public void setNeedBussiness(boolean needBussiness) {
		this.needBussiness = needBussiness;
	}
	public boolean isNeedController() {
		return needController;
	}
	public void setNeedController(boolean needController) {
		this.needController = needController;
	}
	

}
