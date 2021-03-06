package com.voicefw.alexa.vo;

import java.util.List;

public class Response {
	
	private OutputSpeech outputSpeech;
	private Card card;
	private Reprompt reprompt;
	private boolean shouldEndSession;
	private List<String> sessionAttributes;

	public OutputSpeech getOutputSpeech() {
		return outputSpeech;
	}

	public void setOutputSpeech(OutputSpeech outputSpeech) {
		this.outputSpeech = outputSpeech;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Reprompt getReprompt() {
		return reprompt;
	}

	public void setReprompt(Reprompt reprompt) {
		this.reprompt = reprompt;
	}

	public boolean isShouldEndSession() {
		return shouldEndSession;
	}

	public void setShouldEndSession(boolean shouldEndSession) {
		this.shouldEndSession = shouldEndSession;
	}

	public List<String> getSessionAttributes() {
		return sessionAttributes;
	}

	public void setSessionAttributes(List<String> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}
	

}
