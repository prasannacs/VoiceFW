package com.voicefw.alexa.utilities;

import com.voicefw.alexa.vo.AlexaVO;
import com.voicefw.alexa.vo.Card;
import com.voicefw.alexa.vo.DroidVO;
import com.voicefw.alexa.vo.OutputSpeech;
import com.voicefw.alexa.vo.Reprompt;
import com.voicefw.alexa.vo.Response;

public class BuildAlexaVOUtility {
	
	public static AlexaVO getAlexaVO(DroidVO res)	{
    	AlexaVO vo = new AlexaVO();
    	vo.setVersion("1.0");
    	OutputSpeech outputSpeech = new OutputSpeech();
    	outputSpeech.setText("Command "+ res.getResponseMessage()  +" sucessfully send to BB8 Droid");
    	outputSpeech.setType("PlainText");
    	Response response = new Response();
    	response.setOutputSpeech(outputSpeech);
    	response.setCard(getCard());
    	vo.setResponse(response);
    	response.setReprompt(getReprompt());
    	response.setShouldEndSession(false);
        return vo;
		
	}
	
	public static AlexaVO getErrorAlexaVO(String errorMessage)	{
    	AlexaVO vo = new AlexaVO();
    	vo.setVersion("1.0");
    	OutputSpeech outputSpeech = new OutputSpeech();
    	outputSpeech.setText(errorMessage);
    	outputSpeech.setType("PlainText");
    	Response response = new Response();
    	response.setOutputSpeech(outputSpeech);
    	response.setCard(getCard());
    	vo.setResponse(response);
    	response.setReprompt(getReprompt());
    	response.setShouldEndSession(false);
        return vo;
		
	}
	
	private static Reprompt getReprompt()	{
    	Reprompt reprompt = new Reprompt();
    	OutputSpeech outputSpeech = new OutputSpeech();
    	outputSpeech.setType("PlainText");
    	outputSpeech.setText("Can I help you with anything else?");
    	reprompt.setOutputSpeech(outputSpeech);
    	return reprompt;
	}
	
	private static Card getCard()	{
    	Card card = new Card();
    	card.setTitle("BB8 Droid Command");
    	card.setType("Simple");
    	card.setContent("Alexa Integration for BB8 Driod Commands");
    	return card;
	}


}
