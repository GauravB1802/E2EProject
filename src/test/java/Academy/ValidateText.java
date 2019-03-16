package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.qaClickHomePage;
import resources.Base;

public class ValidateText extends Base {
	public static Logger log = LogManager.getLogger(ValidateText.class.getName());

	@BeforeTest
	
	public void initialize() throws IOException
	{
		
		driver=initializeDriver();
		log.info("Driver is initialized");
	}
	@Test
	public void testMethodForDevelopBranchInValidateTextClass(){
		
		System.out.println("new method added successfully");
	}
	
	@Test
	
	public void pageNavigationTest() throws IOException, InterruptedException{
		
		
		
		
		
		driver.get(prop.getProperty("URL"));
		
		log.info("URL is hit");
		
		qaClickHomePage homePage = new qaClickHomePage(driver);
		
		log.info("qaclickhomepage object is created");
	
Assert.assertEquals(homePage.getTitle().getText(), "FEATURED COURSES");
log.error("text is not verfied");


		
	}
	@AfterTest
	 public void closeBrowser(){
			
			driver.close();
			driver= null;
	}
	
	

}