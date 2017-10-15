package com.voicefw.alexa.vo;

public class AlexaRequestVO {

	private String version;
	private Session session;
	private Request request;
	
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	
	@Override
	public String toString()	{
		return "Version == "+version+" .. session "+session.getSessionId();
	}
	
}
