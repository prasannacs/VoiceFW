package com.voicefw.alexa.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.voicefw.alexa.utilities.BuildAlexaVOUtility;
import com.voicefw.alexa.vo.AlexaRequestVO;
import com.voicefw.alexa.vo.AlexaVO;
import com.voicefw.alexa.vo.DroidVO;

@Service
public class DroidService {
	
	public AlexaVO droidCommandService(AlexaRequestVO input)	{
		System.out.println("Droid Service -- input received "+input.getVersion());
		System.out.println("Droid Service Color Keyset  --"+input.getRequest().getIntent().getSlots().keySet());
		// parse command
		String command = input.getRequest().getIntent().getName();
		System.out.println("Command : "+command);
		
		if(command.equals("RollDroid"))
			command = "rolldroid";
		else if(command.equals("SpinDroid"))
			command = "spindroid";
		else
			command = "changedroidcolor";

		RestTemplate restTemplate = new RestTemplate();
		String uri = new String("https://" + "95c9e68f.ngrok.io" + "/" +command);
		DroidVO req = new DroidVO();
		req.setAlexaAppId(input.getSession().getApplication().getApplicationId());
		req.setDirection(input.getRequest().getIntent().getSlotValue("Direction"));
		req.setDuration(input.getRequest().getIntent().getSlotValue("Duration"));
		req.setColor(input.getRequest().getIntent().getSlotValue("Color"));
        
        DroidVO res = restTemplate.postForObject(uri,req,DroidVO.class);
        System.out.println("------- Droid Response "+res.toString());
		
		String intent = input.getRequest().getIntent().getName();
		if(intent != null)
			return BuildAlexaVOUtility.getAlexaVO(res);
		else
			return BuildAlexaVOUtility.getErrorAlexaVO("Failure in Droid Service. Please check logs");
	}
	


}
