package com.einfo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class DemospringtestingApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	void testController() throws Exception {
		mockMvc.perform(get("/hello")).andExpect(status().isOk());
	}

	@Test
	void negativeController() throws Exception {
		mockMvc.perform(get("/hey")).andExpect(status().isNotFound());
	}

	@Test
	void checkValue() throws Exception {
		mockMvc.perform(get("/index")).andExpect(MockMvcResultMatchers.status().isNotFound())
				.andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("")));
	}

}
