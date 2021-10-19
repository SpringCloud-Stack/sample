package com.sample;

import com.sample.entity.Company;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class SampleApplicationTests {

	@Test
	void contextLoads() {

		HashMap<String,Integer> map = new HashMap<>();
		map.put("a",1);

		System.out.println(map);


	}

}
