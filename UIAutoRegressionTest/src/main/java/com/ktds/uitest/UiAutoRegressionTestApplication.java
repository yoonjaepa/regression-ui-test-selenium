package com.ktds.uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class UiAutoRegressionTestApplication {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(UiAutoRegressionTestApplication.class, args);
		
		openInitPage();
		
	}
	
	private static void openInitPage() {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/Users/songjungkeun/workspace/UIAutoRegressionTest/src/main/resources/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("http://localhost:8001/test.html");
	
	}
	
}
