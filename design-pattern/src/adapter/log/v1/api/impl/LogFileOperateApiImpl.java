package adapter.log.v1.api.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import adapter.log.v1.api.LogFileOPerateApi;
import adapter.log.v1.entity.LogModel;

public class LogFileOperateApiImpl implements LogFileOPerateApi {
	
	private String logFilePath = "adapter.log";
	public  LogFileOperateApiImpl(String logFilePath) {
		if(logFilePath != null && logFilePath.trim().length() > 0){
			this.logFilePath = logFilePath;
		}
	}

	@Override
	public void writeLog(List<LogModel> list) throws FileNotFoundException, IOException {
		File file = new File(logFilePath);
		if(!file.exists()){
			file.createNewFile();
		}
		ObjectOutputStream ois = null;
		ois = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(file)));
		ois.writeObject(list);
		ois.close();
		
	}

	@SuppressWarnings({"unchecked" })
	@Override
	public List<LogModel> readLog() throws FileNotFoundException, IOException {
		List<LogModel> list = new ArrayList<>();
		ObjectInputStream ois = null;
		File file = new File(logFilePath);
		ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(file)));
		try {
			list = (List<LogModel>) ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			ois.close();
		}
		return list;
	}

}
