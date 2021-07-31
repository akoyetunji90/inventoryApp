package com.zeedlabs.topupbox.apiconsumption;

import java.awt.PageAttributes.MediaType;
import java.net.http.HttpHeaders;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
	@Autowired
	RestTemplate restTemplate;
	
	public BaseResponse getMessage() {
	     BaseResponse baseResponse = new BaseResponse();
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity(headers);
	      
	      Object apiObj= restTemplate.exchange("http://pickerschoice-backend.herokuapp.com/api/v1/products", HttpMethod.GET, entity, String.class).getBody();
	      baseResponse.setData(apiObj);
	      return baseResponse;	
	}
		
}
