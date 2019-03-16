package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.qaClickHomePage;
import resources.Base;

public class HomePage extends Base {
	
	public static Logger log=LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	
	public void initialize() throws IOException
	{
		
		driver=initializeDriver();
	
		log.info("Driver is the one who is  initialized");}
	
	 

	
	

	@Test(dataProvider="getData")
	
	public void pageNavigationTest(String userName, String password) throws IOException, InterruptedException{
		

		
		driver.get(prop.getProperty("URL"));
		
		qaClickHomePage homePage = new qaClickHomePage(driver);
		
		log.info("qaclickhomepage is clicked");
		
		
		homePage.getLogin().click();
		log.info("login link is clicked");
		
		LoginPage logPage= new LoginPage(driver);
		
		logPage.getEmailId().sendKeys(userName);
		log.info("username is typed in email id field");
		
		
		logPage.getPassword().sendKeys(password);
		log.info("password is typed in password field");
		logPage.getGoButton().click();
		log.info("Login button is clicked");
	
		log.info("this line is added");
		log.info("test case is passed");
		
		log.info("new line added in git space to be added in E2E project master");
		
		System.out.println("branch code");
		
		
	
	}
	@Test
	public void testMethodForDevelopBranch(){
		
		System.out.println("new method added successfully");
	}
		
		
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data= new Object[2][2];
			
			data[0][0]= "testuser1";
			data[0][1]= "testpassword";
			
			data[1][0]= "testuser2";
			data[1][1]= "testpassword2";			
			
			return data;
			
		
		}
		
		@AfterTest
	 public void closeBrowser(){
			
			driver.close();
			driver= null;
		}
	

		
	}
	
	

