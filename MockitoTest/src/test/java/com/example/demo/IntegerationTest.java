package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class IntegerationTest {
	 @LocalServerPort
	    private int port;
	    
	    @Autowired
	    private TestRestTemplate restTemplate = new TestRestTemplate();
	 
		@Test
		public void getUser() {
			String url ="http://localhost:"+port+"/get/users";
		     HttpEntity<String>entity=new HttpEntity<String>(null,null);
		     UriComponentsBuilder builder=UriComponentsBuilder.fromUriString(url);
		     ResponseEntity<String> repository=restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, String.class);
		     System.out.println(repository);
			
		}
	 
		
}
