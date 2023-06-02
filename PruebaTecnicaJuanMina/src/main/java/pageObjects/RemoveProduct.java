package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemoveProduct {
	
private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElements
	
	public WebElement addCartFirstProduct() {
		return getDriver().findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
	}
	
	public WebElement numberOfProducts() {
		return getDriver().findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
	}
	
	public WebElement remove() {
		return getDriver().findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
	}
	
	//Services
	
	public void clickAdd() {
		addCartFirstProduct().click();
	}
	
	public void removeProduct() {
		remove().click();
	}
}
