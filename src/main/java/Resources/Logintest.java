package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logintest {
	public WebDriver driver;
	public WebDriver driver() throws Throwable {
		
	
	Properties prop = new Properties();
	
	
	FileInputStream fis = new FileInputStream("C:\\Users\\varad\\eclipse-workspace\\EndtoEnd\\src\\main\\resources\\importingfile\\utility.properties");
	
		
			prop.load(fis);
	String browsername =	prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C://Users//varad//Downloads//chromedriver_win32 (2)//chromedriver.exe");
		driver = new ChromeDriver();

	}
	else if(browsername.equals("firefox"))
	{
		
	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	
			
			
	}
}
