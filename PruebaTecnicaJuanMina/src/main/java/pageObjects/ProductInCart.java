package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductInCart {
	
private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	//Web Elements
	
	public WebElement shoppingCart() {
		return getDriver().findElement(By.className("shopping_cart_link"));
	}
	
	public WebElement title() {
		return getDriver().findElement(By.className("title"));
	}
		
	
	//Services

	public void clickCart() {
		shoppingCart().click();
	}
	
	public boolean titleOK() {
		return title().isDisplayed();
	}
	

}
