package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
class CrudApplicationTests {

	@Test
	void contextLoads() {
	}
//	@Autowired
//	WebApplicationContext webapplicationcontext;
//	@Autowired
//	MockMvc mockmvc;
//	
//	@Before
//	public void setup() {
//		mockmvc =MockMvcBuilders.webAppContextSetup(webapplicationcontext).build();
//	}
//	@Test
//	public void testEmployee() throws Exception {
//		mockmvc.perform(get("/student/detail")).andExpect(status().isOk()).andExpect(content()
//				.contentType("application/json;charset=UTF-11"))
//		        .andExpect(jsonPath("$.regno").value(1))
//		        .andExpect(jsonPath("$.name").value("prakash"))
//		        .andExpect(jsonPath("$.cgpa").value(8))
//		        .andExpect(jsonPath("$.Dept").value("Mech"));
//		        
//	}


}
