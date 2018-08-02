package adapter.log.v2;

import java.util.List;

import adapter.log.v1.entity.LogModel;

public interface LogOperateApiOnDB {
	public void createLog(LogModel model);
	public boolean updateLog(LogModel model);
	public boolean delete(LogModel mdoel);
	public List<LogModel> getList();

}
