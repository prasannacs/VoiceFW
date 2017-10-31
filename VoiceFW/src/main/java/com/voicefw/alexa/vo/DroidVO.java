package com.voicefw.alexa.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DroidVO {
	
	private String responseMessage;
	private String alexaAppId;
	private String duration;
	private String direction;
	private String color;
	
	
	
    public String getResponseMessage() {
		return responseMessage;
	}



	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}



	public String getAlexaAppId() {
		return alexaAppId;
	}



	public void setAlexaAppId(String alexaAppId) {
		this.alexaAppId = alexaAppId;
	}



	public String getDuration() {
		return duration;
	}



	public void setDuration(String duration) {
		this.duration = duration;
	}



	public String getDirection() {
		return direction;
	}



	public void setDirection(String direction) {
		this.direction = direction;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	@Override
    public String toString() {
        return "DroidResponseVO{" +
                "responseMessage='" + responseMessage + '\'' +
                ", alexaAppId=" + alexaAppId +
                '}';
    }	

}
