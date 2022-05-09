package Academy.ApachePOI;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObject.LandingPage;

import pageObject.RandomStringGeneration;
import resources.base;

public class ValidateName extends base {
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	    driver.manage().window().maximize();
	}
	@Test
	public void basePageNavigation() throws InterruptedException
	{
		
		LandingPage var=new LandingPage(driver);
		RandomStringGeneration value=new RandomStringGeneration();
		var.getEmail().sendKeys("meestate.admin@gmail.com");
		var.getPassword().sendKeys("Shreya@9090");
		var.getGo().click();
		var.getOTP().sendKeys("227244");
		var.getClickOTP().click();
		//Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'भारतीय जनता पार्टी')]"));
		if (element.isDisplayed()) {
		    var.getSideMenu().click();
		}
		
	
	    //var.getSideMenu().click();
		var.getDataManagement().click();
		var.getKaryakarta().click();
		var.getPradeshEntry().click();
		Thread.sleep(2000);
		var.getOrgUnit().sendKeys("Core Sangathan");
		var.getClickOrgUnit().click();
		var.getOrgSubUnit().sendKeys("Office Bearer");
		var.getClickOrgsubUnit().click();
		var.getName().sendKeys(value.generateRandomPassword(21));
		var.getfatherName().sendKeys(value.generateRandomPassword(10));
		var.getDesignation().click();
	
	    List<WebElement> opt = driver.findElements(By.xpath("//div[@role='option']"));
	   Random rand = new Random();
	   int list= rand.nextInt(opt.size());
	   opt.get(list).click();
	   
	   var.getPersonHasSmartPhone().click();
	   List<WebElement> a = driver.findElements(By.xpath("//div[@role='option']"));
	   Random randa =new Random();
	   int lista =rand.nextInt(a.size());
	   a.get(lista).click();
	   var.getPhoneNumber().sendKeys(value.generationRandomNumbers(10));
	   String errorMsg="Please enter a valid input";
	   if(value.equal(errorMsg)) {
		  var.getPhoneNumber().clear();
	  }   
		   
		   
	   
	   
	   
	   
	   
	   
	   var.getAge().sendKeys(value.generationRandomNumbers(2));
	   var.getAddEntry().click();
	   
	   
	  
	   
	   
	   
	   
		
		
	
		
	}
	


	


}
