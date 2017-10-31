package com.voicefw.alexa.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.voicefw.alexa.utilities.BuildAlexaVOUtility;
import com.voicefw.alexa.vo.AlexaVO;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
 
    @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class , HttpClientErrorException.class, NullPointerException.class, Exception.class })
    protected ResponseEntity<AlexaVO> handleConflict(RuntimeException exception, WebRequest request) {
    	System.out.println("Exception class "+exception.getClass()+" Exception is "+exception);
        if( exception.getClass().equals(HttpClientErrorException.class))	
        	return new ResponseEntity<AlexaVO>(BuildAlexaVOUtility.getErrorAlexaVO("Droid BLE service failure. Please check logs and retry"), HttpStatus.OK);
        if( exception.getClass().equals(NullPointerException.class))	
        	return new ResponseEntity<AlexaVO>(BuildAlexaVOUtility.getErrorAlexaVO("There is some error with data mapping. Please check logs and retry"), HttpStatus.OK);
        return new ResponseEntity<AlexaVO>(BuildAlexaVOUtility.getErrorAlexaVO("Command not successful. Plesae check logs"), HttpStatus.OK);
    }
    
   
}