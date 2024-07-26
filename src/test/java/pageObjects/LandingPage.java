package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage (WebDriver driver) {
		this.driver = driver;
	}
		
	By searchBox = By.id("APjFqb");
	By searchButtonBy = By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
		
	public void searchItem(String name) {
		driver.manage().window().maximize();
		driver.findElement(searchBox).sendKeys(name);
	}	
	
	public void clickSearhBtn() {
		driver.findElement(searchButtonBy).submit();
	}
	
}
