package adapter.log.v1.api;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import adapter.log.v1.entity.LogModel;
/**
 * 日志文件的操作API接口
 * @author admin
 *
 */
public interface LogFileOPerateApi {
	
	public void writeLog(List<LogModel> list) throws FileNotFoundException, IOException;
	public List<LogModel> readLog() throws FileNotFoundException, IOException;

}
