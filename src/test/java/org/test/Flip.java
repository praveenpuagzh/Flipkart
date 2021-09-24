package org.test;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Flip extends Base{
	
	
		
		@BeforeClass
		public static void Initialzation() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

		@Before
		public void start() {

			Date d = new Date();
			
			}
		
		@Test
		public void Test1()  {
			driver.get("https://www.flipkart.com/");
			launchpage l = new launchpage();
			click(l.button);
			fillthetext(l.search, "poco");
			click(l.submit);
			run();
			click(l.secpage);
	}
		@Test
		public void Test2() throws Throwable {
		Thread.sleep(5000);	
		run();

		}
		
		@Test
		public void Test3() throws Throwable {
			launchpage l = new launchpage();
			click(l.thirdpage);
			Thread.sleep(5000);
			run();

		}
		
	
		@After
		public void End() {

			Date d = new Date();
			
		}

		@AfterClass
		public static void quit() {
			// driver.quit();
		}
		
	}













