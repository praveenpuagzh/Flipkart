package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Base   {

	public static WebDriver driver;

	public static void click(WebElement ref) {
		ref.click();
	}
	
	public void selectbyvalue(WebElement ref, String value) {
		Select s = new Select(ref);
		s.selectByValue(value);
		}
		
	public void fillthetext(WebElement ref , String Text) {
	ref.sendKeys(Text);

	}
	
	public void run() {
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (int i = 0; i < products.size(); i++) {
			 String text = products.get(i).getText();
			 System.out.println(text);
			 
		}

		for (int j = 0; j < price.size(); j++) {
			String cost = price.get(j).getText();
			String c = cost.substring(1);
				if (c.contains(",")) {
				String r = c.replace(",", "");
				System.out.println(r);
			}
		}

	}
	
	
	
}
