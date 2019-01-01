package com.ktds.uitest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.ktds.uitest.service.ChromeBrowser;

public class ChromeBrowserTest {



	@Test
	public void ExistObjectTest() {
		
		ChromeBrowser 	chrome	=	new ChromeBrowser();
		
		assertNotNull(chrome);
		
	}
	
	@Test 
	public void test_OpenChromeBrowser() {
		
		ChromeBrowser 	chrome	=	new ChromeBrowser();
		
		chrome.openChromeBrowser();
		
		String expectedUrl = "https://www.naver.com/";
		
		assertEquals("기대했던 URL로 브라우져가 열리지 않음.", expectedUrl, chrome.getDriver().getCurrentUrl());
		
		chrome.getDriver().quit();
		
	}
	
	
}
