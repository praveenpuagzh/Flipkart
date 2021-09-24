package org.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class launchpage extends Flip {

	public launchpage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")public WebElement button; 
	@FindBy(xpath="//input[@type='text']")public WebElement search;
	@FindBy(xpath="//button[@type='submit']")public WebElement submit;
	@FindBy(xpath="(//div[@class='_2MImiq']//nav[@class='yFHi8N']//a[@class='ge-49M'])[1]") public WebElement secpage;
	@FindBy(xpath="(//div[@class='_2MImiq']//nav[@class='yFHi8N']//a[@class='ge-49M'])[2]") public WebElement thirdpage;

}
