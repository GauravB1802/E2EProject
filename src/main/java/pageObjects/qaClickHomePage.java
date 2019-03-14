package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qaClickHomePage {

	
	public WebDriver driver;
	
	public qaClickHomePage(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
By loginLink =By.cssSelector("a[href*='sign_in']");

By titleText = By.className("text-center");

public WebElement getLogin(){
	
	
	return driver.findElement(loginLink);
}
public WebElement getTitle(){
	
	
	return driver.findElement(titleText);
}

}