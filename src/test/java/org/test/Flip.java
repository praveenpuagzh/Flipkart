package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ecclipseworkspace\\Maven\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("poco");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	List<WebElement> products = driver.findElements(By.xpath("//div[@class='_1AtVbE col-12-12']//div[@class='_13oc-S']//div[@class='_4rR01T']"));
	List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	
	
		 for(int i=0; i < products.size();i++){
			
			 String mobs = products.get(i).getText();
			 System.out.println(mobs);
		}
		
		for(int j=0;j<price.size();j++){
			String cost = price.get(j).getText();
			System.out.println(cost);
			
		}
					
	
	
	
	}
}

		
		
	

