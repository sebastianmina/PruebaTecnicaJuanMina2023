package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	//LoginPage WebElements
	
	public WebElement userBox() {
		
		return getDriver().findElement(By.id("user-name"));
	}
	
	public WebElement passwordBox() {
		
		return getDriver().findElement(By.id("password"));
	}
	
	public WebElement login() {
		return getDriver().findElement(By.id("login-button"));
	}
	
	//Services
	
	public void userName(String userName) {
		
		userBox().sendKeys(userName);
	}
	
	public void password(String password) {
		
		passwordBox().sendKeys(password);
	}
	
	public void clickLogin() {
		login().click();
	}
}
