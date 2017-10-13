package com.voicefw.alexa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

	@RequestMapping("/echo")
	public @ResponseBody String echo() {
		return "Echo from Alexa Voice Framework!..";
	}

}
