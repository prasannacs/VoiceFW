package com.voicefw.alexa.service;

import org.springframework.stereotype.Service;

import com.voicefw.alexa.vo.AlexaRequestVO;
import com.voicefw.alexa.vo.AlexaVO;
import com.voicefw.alexa.vo.Card;
import com.voicefw.alexa.vo.Intent;
import com.voicefw.alexa.vo.OutputSpeech;
import com.voicefw.alexa.vo.Reprompt;
import com.voicefw.alexa.vo.Response;

@Service
public class DroidService {
	
	public AlexaVO droidCommandService(AlexaRequestVO input)	{
		System.out.println("Droid Service -- input received "+input.getVersion());
		// parse command
		String intent = input.getRequest().getIntent().getName();
		if(intent != null)
			return getAlexaVO(input.getRequest().getIntent());
		else
			return errorAlexaVO();
	}
	
	private AlexaVO getAlexaVO(Intent intent)	{
    	AlexaVO vo = new AlexaVO();
    	vo.setVersion("1.0");
    	OutputSpeech outputSpeech = new OutputSpeech();
    	outputSpeech.setText("Sending command "+ intent.getName()  +" to BB8 Droid");
    	outputSpeech.setType("PlainText");
    	Card card = new Card();
    	card.setTitle("BB8 Droid Command");
    	card.setType("Simple");
    	card.setContent("Today will provide you a new learning opportunity.  Stick with it and the possibilities will be endless.");
    	Response response = new Response();
    	response.setOutputSpeech(outputSpeech);
    	response.setCard(card);
    	vo.setResponse(response);
    	Reprompt reprompt = new Reprompt();
    	OutputSpeech outputSpeech1 = new OutputSpeech();
    	outputSpeech1.setType("PlainText");
    	outputSpeech1.setText("Can I help you with anything else?");
    	reprompt.setOutputSpeech(outputSpeech1);
    	response.setReprompt(reprompt);
    	response.setShouldEndSession(false);
        return vo;
		
	}
	
	private AlexaVO errorAlexaVO()	{
    	AlexaVO vo = new AlexaVO();
    	vo.setVersion("1.0");
    	OutputSpeech outputSpeech = new OutputSpeech();
    	outputSpeech.setText("Cannot understand your command. Check your request object in service. Can I help you with anything else?");
    	outputSpeech.setType("PlainText");
    	Card card = new Card();
    	card.setTitle("BB8 Droid Command");
    	card.setType("Simple");
    	card.setContent("Today will provide you a new learning opportunity.  Stick with it and the possibilities will be endless.");
    	Response response = new Response();
    	response.setOutputSpeech(outputSpeech);
    	response.setCard(card);
    	vo.setResponse(response);
    	Reprompt reprompt = new Reprompt();
    	OutputSpeech outputSpeech1 = new OutputSpeech();
    	outputSpeech1.setType("PlainText");
    	outputSpeech1.setText("Can I help you with anything else?");
    	reprompt.setOutputSpeech(outputSpeech1);
    	response.setReprompt(reprompt);
    	response.setShouldEndSession(false);
        return vo;
		
	}


}