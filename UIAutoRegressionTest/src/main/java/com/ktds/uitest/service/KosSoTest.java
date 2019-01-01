package com.ktds.uitest.service;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktds.uitest.domain.TestResult;

@Service
public class KosSoTest {
	
	private WebDriver driver;
	
	public KosSoTest() {
		
	}
	
	public TestResult executeKosTest(TestResult result) {
		
	
		System.setProperty("webdriver.chrome.driver", "/Users/songjungkeun/workspace/UIAutoRegressionTest/src/main/resources/chromedriver");
		
		//ChromeOptions opt = new ChromeOptions();
		
		//opt.addArguments("headless");
		
		
		driver = new ChromeDriver();
		
		
		
		driver.get("http://www.naver.com");
		
		//	로그인 버튼 찾아오
		WebElement webElement = driver.findElement(By.linkText("NAVER 로그인"));
		//	
		webElement.click();
		
		
		webElement = driver.findElement(By.id("id"));
		webElement.sendKeys("bal0601");
		
		webElement = driver.findElement(By.id("pw"));
		webElement.sendKeys("Song1231@@");
		
		webElement.submit();
		
		
		
		result.setResult(true);
		
		return result;
	}
}
