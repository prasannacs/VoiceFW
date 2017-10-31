package com.voicefw.alexa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.voicefw.alexa.service.DroidService;
import com.voicefw.alexa.vo.AlexaRequestVO;
import com.voicefw.alexa.vo.AlexaVO;

@RestController
@RequestMapping("/droid")
public class DroidController {
	
	@Autowired
	DroidService service;
	
    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody AlexaRequestVO input) {
    	System.out.println("Input "+input.toString());
    	return new ResponseEntity<AlexaVO>(service.droidCommandService(input), HttpStatus.OK);
    	
    }

}
