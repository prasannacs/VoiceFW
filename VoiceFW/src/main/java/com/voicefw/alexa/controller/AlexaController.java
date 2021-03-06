package com.voicefw.alexa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.voicefw.alexa.vo.AlexaRequestVO;
import com.voicefw.alexa.vo.AlexaVO;
import com.voicefw.alexa.vo.Card;
import com.voicefw.alexa.vo.OutputSpeech;
import com.voicefw.alexa.vo.Reprompt;
import com.voicefw.alexa.vo.Response;

@RestController
@RequestMapping("/carcommand")
public class AlexaController {

	@RequestMapping(method = RequestMethod.GET)
    public AlexaVO alexaCarCommand() {
		return getAlexaVO();
    }
	
	private AlexaVO getAlexaVO()	{
    	AlexaVO vo = new AlexaVO();
    	vo.setVersion("1.0");
    	OutputSpeech outputSpeech = new OutputSpeech();
    	outputSpeech.setText("Today will provide you a new learning opportunity.  Stick with it and the possibilities will be endless. Can I help you with anything else?");
    	outputSpeech.setType("PlainText");
    	Card card = new Card();
    	card.setTitle("Car");
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
	
    
    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody AlexaRequestVO input) {
    	System.out.println("input version ## "+input.getVersion());
    	return new ResponseEntity<AlexaVO>(getAlexaVO(), HttpStatus.OK);
    	
    }

}