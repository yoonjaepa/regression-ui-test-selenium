package com.ktds.uitest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ktds.uitest.domain.TestResult;
import com.ktds.uitest.service.KosSoTest;


public class SeleniumWebTest {

	@Test
	public void test() {
		
		KosSoTest kosTest = new KosSoTest();
		
		TestResult rst = new TestResult() ;
		
		rst.setId((long) 1);
		
		kosTest.executeKosTest(rst);
		
		
		
	}

}


