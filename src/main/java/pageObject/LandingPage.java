package pageObject;



import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public WebDriver driver;
public Properties prop;
	
	//By Url=By.xpath("https://zila-staging.ccdms.in/");
	By Email=By.name("email");
	By Password=By.name("password");
	By Go=By.className("mat-button-wrapper");
	By OTP=By.xpath("//input[@placeholder='OTP']");
	By ClickOTP=By.xpath("//span[contains(text(),'Log In')]");
	By SideMenu=By.xpath("//mat-icon[@Class='sidenav-icon mat-icon notranslate mat-icon-no-color']");
	By DataManagement=By.cssSelector("span.full-width.ng-star-inserted");
	By Karyakarta=By.xpath("//a[normalize-space()='Karyakarta Data Entry']");
	By PradeshEntry=By.cssSelector("mat-sidenav-container.app-container.mat-drawer-container.mat-sidenav-container.ng-star-inserted.mat-drawer-transition:nth-child(3) mat-sidenav-content.app-content-container.mat-drawer-content.mat-sidenav-content:nth-child(5) div.app-content-top-margin app-dashboard-card.ng-star-inserted div.container.ng-star-inserted div.ng-star-inserted:nth-child(1) mat-card.card-custom.mat-card.ng-star-inserted mat-card-content.mat-card-content div.row div.col-md-10 div.row div.col > button.button-border.left-space.mat-ripple.mat-stroked-button.mat-button-base.mat-primary.ng-star-inserted");
	By OrgUnit=By.xpath("(//input[@role='combobox'])[2]");
	By ClickOrgUnit=By.xpath("//div[@class='ng-option ng-option-marked ng-star-inserted']");
	By OrgSubUnit=By.xpath("(//input[@role='combobox'])[3]");
	By ClickOrgSubUnit=By.xpath("//div[@role='option']");
	By Name=By.xpath("//input[@placeholder='Name']");
	By fatherName=By.xpath("//input[@placeholder=\"Father's/Husband's Name\"]");
	By Designation=By.xpath("(//input[@role='combobox'])[4]");
	By DesignationSize=By.xpath("//div[@role='option']");
	By ClickDesignation=By.xpath("//span[@class='ng-option-label ng-star-inserted']");// designation dropdown total values.
	By PersonHasSmartPhone=By.xpath("(//input[@role='combobox'])[5]");
	By PhoneNumber=By.xpath("//input[@placeholder='Phone Number']");
	By Age=By.xpath("//input[@placeholder='Age']");
	By AddEntry=By.xpath("//button[@type='submit']//span[@class='mat-button-wrapper']");
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


//public WebElement getURL()
//{
	//return driver.findElement(Url);
	
//}
public WebElement getEmail() {
	return driver.findElement(Email);
}
public WebElement getPassword() {
	return driver.findElement(Password);
}
public WebElement getGo() {
	return driver.findElement(Go);
}
public WebElement getOTP() {
	return driver.findElement(OTP);
}
public WebElement getClickOTP() {
	return driver.findElement(ClickOTP);
}
public WebElement getSideMenu() {
	return driver.findElement(SideMenu);
}
public WebElement getDataManagement() {
	return driver.findElement(DataManagement);
}
public WebElement getKaryakarta() {
	return driver.findElement(Karyakarta);
}
public WebElement getPradeshEntry() {
	return driver.findElement(PradeshEntry);
}
public WebElement getOrgUnit() {
	return driver.findElement(OrgUnit);
}
public WebElement getClickOrgUnit() {
	return driver.findElement(ClickOrgUnit);
}
public WebElement getOrgSubUnit() {
	return driver.findElement(OrgSubUnit);
}
public WebElement getClickOrgsubUnit() {
	return driver.findElement(ClickOrgSubUnit);
}
public WebElement getName() {
	return driver.findElement(Name);

}
public WebElement getfatherName() {
	return driver.findElement(fatherName);
}
public WebElement getDesignation() {
	return driver.findElement(Designation);
}
public WebElement getDesignationSize() {
	return driver.findElement(DesignationSize);
}
public WebElement getClickDesignation() {
	return driver.findElement(ClickDesignation);
}
public WebElement getPersonHasSmartPhone() {
	return driver.findElement(PersonHasSmartPhone);
}

public WebElement getPhoneNumber() {
	return driver.findElement(PhoneNumber);
}
public WebElement getAge() {
	return driver.findElement(Age);
}
public WebElement getAddEntry() {
	return driver.findElement(AddEntry);
}

}
