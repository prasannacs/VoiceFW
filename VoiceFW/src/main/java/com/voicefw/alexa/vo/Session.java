package com.voicefw.alexa.vo;

import java.util.List;

public class Session {
	
	private boolean new_sesssion;
	private String sessionId;
	private Application application;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isNew_sesssion() {
		return new_sesssion;
	}
	public void setNew_sesssion(boolean new_sesssion) {
		this.new_sesssion = new_sesssion;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
		
}
