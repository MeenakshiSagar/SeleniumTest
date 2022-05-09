/*package Academy.ApachePOI;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.base;

public class DataDrivenTesting extends base {
	

	/*@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void basePageNavigation()
	{
		
		LandingPage var=new LandingPage(driver);
		var.getEmail().sendKeys("meestate.manager@gmail.com");
		var.getPassword().sendKeys("Shreya@9090");
		var.getGo().click();
		var.getOTP().sendKeys("227244");
		var.getClickOTP().click();
		var.getSideMenu().click();
		var.getDataManagement().click();
		var.getKaryakarta().click();
		var.getPradeshEntry().click();
	}
	@Test(dataProvider="DataEntryPradesh")
	public void cdataEntry(String OrgUnit, String OrgSubUnit, String name, String fatherName, String Desig, String phn ) throws InterruptedException
	{
		LandingPage go=new LandingPage(driver);
		//driver.findElement(By.xpath("(//span[@class='ng-clear-wrapper ng-star-inserted'])[2]"));
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(5000);

		//WebElement toClear=driver.findElement(By.xpath("(//input[@role='combobox'])[2]"));
		//toClear.clear();
		go.getOrgUnit().sendKeys(OrgUnit);
		go.getClickOrgUnit().click();
		WebElement toremove=driver.findElement(By.xpath("(//input[@role='combobox'])[3]"));
		toremove.clear();
		go.getOrgSubUnit().sendKeys(OrgSubUnit);
		
		go.getClickOrgsubUnit().click();
		go.getName().sendKeys(name);
		go.getfatherName().sendKeys(fatherName);
		go.getDesignation().sendKeys(Desig);
		go.getClickDesignation().click();
		go.getPhoneNumber().sendKeys(phn);
		go.getAddEntry().click();
		
		
		
		
		
		
		
	}
	
	@DataProvider(name="DataEntryPradesh")
	public String[][] getData() throws IOException 
	{
	
		//get data from excel
				
				String path=".\\DataEntryPradesh\\DataEntryPradesh.xlsx";
				XLUtility xlutil=new XLUtility(path);
				
				int totalrows=xlutil.getRowCount("Sheet1");
				int totalcols=xlutil.getCellCount("Sheet1",1);	
						
				String dataEntryPradesh[][]=new String[totalrows][totalcols];
					
				
				for(int i=1;i<=totalrows;i++) //1
				{
					for(int j=0;j<totalcols;j++) //0
					{
						dataEntryPradesh[i-1][j]=xlutil.getCellData("Sheet1", i, j);
					}
						
				}
				
				return dataEntryPradesh;
			}*/
	
	
	
	
	
}