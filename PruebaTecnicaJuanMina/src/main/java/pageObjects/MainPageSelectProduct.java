package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageSelectProduct {
	
private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	//Web Elements
	
	public WebElement titleFirstProduct() {
		return getDriver().findElement(By.id("item_0_title_link"));
		
	}
	
	public WebElement backToProducts() {
		return getDriver().findElement(By.id("back-to-products"));
	}
	
	//Services
	
	public void clickProduct() {
		titleFirstProduct().click();
	}
	
	public boolean isDisplayedBackToProducts() {
		return backToProducts().isDisplayed();
	}

}
