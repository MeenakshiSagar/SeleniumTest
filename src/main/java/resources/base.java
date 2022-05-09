package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
public WebDriver driver;
public Properties prop;

public WebDriver initializeDriver() throws IOException 
{
prop=new Properties();
FileInputStream fis=new FileInputStream("D:\\Selenium Practice\\ApachePOI\\src\\main\\java\\resources\\data.properties");
prop.load(fis);
String browserName=prop.getProperty("browser");
if(browserName.equals("chrome"))	
{

System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver = new ChromeDriver();
}
else if(browserName.equals("firefox"))
{
	driver=new FirefoxDriver();
	//
}
else if(browserName.equals("IE"))
{
	//
}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
return driver;

}

}

