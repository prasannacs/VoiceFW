package com.voicefw.alexa.vo;

import java.util.List;

public class AlexaVO {
	
	private String version;
	private List<String> sessionAttributes;
	private Response response;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public List<String> getSessionAttributes() {
		return sessionAttributes;
	}
	public void setSessionAttributes(List<String> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}

}
