package org.testing;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Base   {

	
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
	
	
	
}
