package adapter.log.v1.entity;

import java.io.Serializable;

public class LogModel implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String optUser;
	/**
	 * 操作时间
	 * 以字符串的形式保存 yyyy-MM-dd HH:mm:ss
	 */
	private String optTime;
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOptUser() {
		return optUser;
	}

	public void setOptUser(String optUser) {
		this.optUser = optUser;
	}

	public String getOptTime() {
		return optTime;
	}

	public void setOptTime(String optTime) {
		this.optTime = optTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "LogModel [id=" + id + ", optUser=" + optUser + ", optTime=" + optTime + ", content=" + content + "]";
	}

}
