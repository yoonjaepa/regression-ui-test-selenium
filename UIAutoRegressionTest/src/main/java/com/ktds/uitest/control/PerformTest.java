package com.ktds.uitest.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.uitest.domain.TestResult;
import com.ktds.uitest.service.KosSoTest;

@RestController
public class PerformTest {
	
	@Autowired
	private KosSoTest kosTest;
	
	@RequestMapping("/perform")
	public TestResult executeTest(TestResult result) {
		
		result = kosTest.executeKosTest(result);
		
		return result;
	}
}
