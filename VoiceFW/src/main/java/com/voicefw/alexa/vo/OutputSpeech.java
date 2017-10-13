package com.voicefw.alexa.vo;

public class OutputSpeech {
	
	private String type;
	private String text;
	private String ssml;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSsml() {
		return ssml;
	}
	public void setSsml(String ssml) {
		this.ssml = ssml;
	}
	
}
