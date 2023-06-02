package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProducts {
	
private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElements
	
	public WebElement addFirst() {
		return getDriver().findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
	}
	
	public WebElement addSecond() {
		return getDriver().findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light"));
	}
	
	public WebElement addThird() {
		return getDriver().findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt"));
	}
	
	public WebElement numberOfProducts() {
		return getDriver().findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
	}
	
	//Services
	
	public void clickProducts() throws InterruptedException {
		
		addFirst().click();
		Thread.sleep(2000);
		addSecond().click();
		Thread.sleep(2000);
		addThird().click();
	}
	

}
