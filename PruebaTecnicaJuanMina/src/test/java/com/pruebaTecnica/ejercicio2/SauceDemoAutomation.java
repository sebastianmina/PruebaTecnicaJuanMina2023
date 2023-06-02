package com.pruebaTecnica.ejercicio2;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;

public class SauceDemoAutomation {
	
	private WebDriver driver;
	private LoginPage loginPage;
	@Before
	/**
	 * Esta clase prepara todo lo que debe estar listo antes
	 * de la prueba, en este caso configuramos el WebDriver.
	 */
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mina\\Desktop\\PruebaTecnicaJuanMina2023\\PruebaTecnicaJuanMina\\src\\test\\resources\\driver\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com");
		String url = "https://www.saucedemo.com";
		
		loginPage = new LoginPage();
		loginPage.setDriver(driver);
		loginPage.getDriver().get(url);
	}
	
	@Test
	public void logInWithStandardUser() throws InterruptedException {
		
		Thread.sleep(2000);
		
		loginPage.userBox().sendKeys("standard_user");
		Thread.sleep(1000);
		loginPage.passwordBox().sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginPage.clickLogin();
		
		Thread.sleep(2000);
		
		/*WebElement userBox = driver.findElement(By.id("user-name"));
		userBox.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement passwordBox = driver.findElement(By.id("password"));
		passwordBox.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();*/

		
	}
	
	/*@Test
	public void mainPageObjects() throws InterruptedException {
		
		Thread.sleep(2000);
		logInWithStandardUser();
		
		WebElement shoppingCar = driver.findElement(By.className("shopping_cart_link"));
		WebElement menu = driver.findElement(By.id("menu_button_container"));
		WebElement selectContainer = driver.findElement(By.className("select_container"));
		WebElement inventory = driver.findElement(By.className("inventory_list"));
		
		assertEquals(shoppingCar.isDisplayed(),true);
		assertEquals(menu.isDisplayed(),true);
		assertEquals(selectContainer.isDisplayed(),true);
		assertEquals(inventory.isDisplayed(),true);
		
		driver.quit();
	}
	
	@Test
	public void selectProduct() throws InterruptedException {
		
		Thread.sleep(2000);
		logInWithStandardUser();
		WebElement titleFirstProduct = driver.findElement(By.id("item_0_title_link"));
		
		if(titleFirstProduct.isDisplayed()) {
			Thread.sleep(3000);
			titleFirstProduct.click();
			Thread.sleep(3000);
			WebElement backToProducts = driver.findElement(By.id("back-to-products"));
			assertEquals(backToProducts.isDisplayed(),true);
			Thread.sleep(2000);
		}
		
		driver.quit();
	}
	
	@Test
	public void AddProductsToCart() throws InterruptedException {
		
		Thread.sleep(2000);
		logInWithStandardUser();
		
		WebElement titleFirstProduct = driver.findElement(By.id("item_0_title_link"));
		WebElement titleSecondProduct = driver.findElement(By.id("item_0_title_link"));
		WebElement titleThirdProduct = driver.findElement(By.id("item_1_title_link"));
		WebElement titleFourthProduct = driver.findElement(By.id("item_5_title_link"));
		WebElement titleFifthProduct = driver.findElement(By.id("item_2_title_link"));
		WebElement titleSixthProduct = driver.findElement(By.id("item_3_title_link"));
		
		WebElement addCartOne = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
		WebElement addCartTwo = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light"));
		WebElement addCartThree = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt"));
		WebElement addCartFour = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
		WebElement addCartFive = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-onesie"));
		WebElement addCartSix = driver.findElement(By.cssSelector("#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)"));
		
		addCartOne.click();
		Thread.sleep(2000);
		addCartTwo.click();
		Thread.sleep(2000);
		addCartThree.click();
		Thread.sleep(2000);
		addCartFour.click();
		Thread.sleep(2000);
		addCartFive.click();
		Thread.sleep(2000);
		addCartSix.click();
		Thread.sleep(2000);
		
		WebElement numberOfProducts = driver.findElement(By.cssSelector("#shopping_cart_container > a > span"));
		assertEquals(Integer.parseInt(numberOfProducts.getText()),6);
		
		driver.quit();
		
	}
	
	@Test
	public void removeOneProductFromCart() throws InterruptedException{
		
		Thread.sleep(2000);
		logInWithStandardUser();
		
		WebElement addCartOne = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		
		addCartOne.click();
		Thread.sleep(2000);
		
		WebElement numberOfProducts = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
		WebElement remove = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
		
		if(Integer.parseInt(numberOfProducts.getText())== 1 && remove.isDisplayed()) {
			remove.click();
			Thread.sleep(2000);
			WebElement addCartOneA = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
			assertEquals(addCartOneA.isDisplayed(),true);
		}
		
		driver.quit();
	}*/

}
