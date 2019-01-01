package com.ktds.uitest.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

@Component
public class ChromeBrowser {

	private WebDriver 	driver;
	private String 		url	=	"http://www.naver.com";
	private String 		pathDriver = "/Users/songjungkeun/workspace/UIAutoRegressionTest/src/main/resources/chromedriver";
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setPathDriver(String pathDriver) {
		this.pathDriver = pathDriver;
	}

	
	public ChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", pathDriver);		
	}
	
	public void openChromeBrowser() {
		
		this.openChromeBrowser(this.url);
		
	}
	
	
	public void openChromeBrowser(String url) {
		
		setUrl(url);
		driver = new ChromeDriver();
		
		driver.get(url);
	
		//this.goUrl(this.url);
		
		
	}
	
	public void goUrl(String url) {
		
		setUrl(url);
		
		this.driver.navigate().to(url);
		
	}
	
	
	
}
