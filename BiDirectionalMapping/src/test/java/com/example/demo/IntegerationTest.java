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

import com.example.demo.Entity.AccountEntity;
import com.example.demo.Entity.StudentEntities;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class IntegerationTest {
	 @LocalServerPort
	    private int port;
	    
	    @Autowired
	    private TestRestTemplate restTemplate = new TestRestTemplate();
	 
		@Test
		public void getByStudName() {
			String url ="http://localhost:"+port+"/get/{studName}";
		     HttpEntity<String>entity=new HttpEntity<String>(null,null);
		     UriComponentsBuilder builder=UriComponentsBuilder.fromUriString(url);
		     ResponseEntity<String> repository=restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, String.class);
		     System.out.println(repository);	
		}
	
      @Test
		public void getByStudAccountNo() {
			String url ="http://localhost:"+port+"/get/{accoNo}";
		     HttpEntity<String>entity=new HttpEntity<String>(null,null);
		     UriComponentsBuilder builder=UriComponentsBuilder.fromUriString(url);
		     ResponseEntity<String> repository=restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, String.class);
		     System.out.println(repository);	
		}
      @Test
		public void insertStudentDetails() {
			String url ="http://localhost:"+port+"/post/student";
		     StudentEntities student = new StudentEntities(1,"Sakthi", "sakthigv@gmail.com", "civil");
		     HttpEntity<StudentEntities>entity=new HttpEntity<StudentEntities>(student,null);
		     UriComponentsBuilder builder=UriComponentsBuilder.fromUriString(url);
		     ResponseEntity<String> repository=restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, String.class);
		     System.out.println(repository);	
		}
      @Test
    		public void insertAccountDetails() {
    			String url ="http://localhost:"+port+"/post/account";
    			AccountEntity account = new AccountEntity(1234567890,"StateBankofIndia" , "Current", "SBIN0000111");
    		 HttpEntity<AccountEntity>entity=new HttpEntity<AccountEntity>(account,null);
    		     UriComponentsBuilder builder=UriComponentsBuilder.fromUriString(url);
    		     ResponseEntity<String> repository=restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, String.class);
    		     System.out.println(repository);	
    		}
          
	 
	 

}
