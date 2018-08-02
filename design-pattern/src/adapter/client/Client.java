package adapter.client;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import adapter.log.v1.api.LogFileOPerateApi;
import adapter.log.v1.api.impl.LogFileOperateApiImpl;
import adapter.log.v1.entity.LogModel;

public class Client {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		LogModel l1 = new LogModel();
		l1.setId(001L);
		l1.setContent("≤‚ ‘“«");
		l1.setOptTime("2018-07-06 14:27:23");
		l1.setOptUser("’≈»˝");
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(l1);
		LogFileOPerateApi operate = new LogFileOperateApiImpl(null);
		operate.writeLog(list);
		
		
		List<LogModel> list1 = operate.readLog();
		for (LogModel logModel : list1) {
			System.out.println(logModel.getContent());
			System.out.println(logModel.getId());
			System.out.println(logModel.getOptTime());
			System.out.println(logModel.getOptUser());
		}
	}

}
