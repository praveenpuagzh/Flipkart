package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ecclipseworkspace\\Maven\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}
}
