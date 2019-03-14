package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	
	public static WebDriver driver;
	
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{

	 prop= new Properties();
	
	FileInputStream file= new FileInputStream("C:\\Users\\gauravbharti\\End2EndProject\\src\\main\\java\\Resources\\browserdata.properties");
	
	prop.load(file);

	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
			
	}
	
	else if(browserName=="InternetExplorer"){
		
		
		driver= new InternetExplorerDriver();
			
	}
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
}


public void getScreenShot(String result) throws IOException{
	
	
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("E:\\ScreenShot\\"+ result+"screenshot.png"));

}
}