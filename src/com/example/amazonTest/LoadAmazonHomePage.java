package com.example.amazonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadAmazonHomePage {

	public static void main(String[] args) {
		
		//1. create a url
		final String siteUrl="https://www.amazon.com";
		
		//2. set Properties(set selenium webdriver path and classes)
		System.setProperty("webdriver.gecko.driver","/home/nineleaps/Documents/workspace-spring-tool-suite-4-4.7.0.RELEASE/AmazonTest/driver/geckodriver");
		
		//3. instantiate obj of web driver open page
		WebDriver driver= new FirefoxDriver();
		driver.get(siteUrl);
		
		//4. search a text
		System.out.println(driver.getTitle());
		
		//5. verify test
		String expectTitleValue="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		if(expectTitleValue.equals(driver.getTitle())) {
			System.out.println("Passes");
		}else {
			System.out.println("fail");
		}
		
		//6. close a browser	
		driver.close();
	}
}
