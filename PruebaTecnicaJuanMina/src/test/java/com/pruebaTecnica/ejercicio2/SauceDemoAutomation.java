package com.pruebaTecnica.ejercicio2;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.*;

public class SauceDemoAutomation {
	
	private WebDriver driver;
	
	private LoginPage loginPage;
	private MainPageSelectProduct mainPage;
	private RemoveProduct removeProduct;
	private AddProducts addProduct;
	private CheckCart cartProduct;
	
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
		
		mainPage = new MainPageSelectProduct();
		mainPage.setDriver(driver);
		mainPage.getDriver().get(url);
		
		removeProduct = new RemoveProduct();
		removeProduct.setDriver(driver);
		removeProduct.getDriver().get(url);
		
		addProduct = new AddProducts();
		addProduct.setDriver(driver);
		addProduct.getDriver().get(url);
		
		cartProduct = new CheckCart();
		cartProduct.setDriver(driver);
		cartProduct.getDriver().get(url);
			
	}
	
	@Test
	public void logInWithStandardUser() throws InterruptedException {
		
		Thread.sleep(2000);
		loginPage.finalLogin("standard_user", "secret_sauce");
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void selectProduct() throws InterruptedException {
		
		Thread.sleep(2000);
		logInWithStandardUser();
		
		mainPage.clickProduct();
		Thread.sleep(2000);
		
		assertEquals(mainPage.isDisplayedBackToProducts(), true);
		driver.quit();
	}
	
	@Test
	public void AddProductsToCart() throws InterruptedException {
		
		Thread.sleep(2000);
		logInWithStandardUser();
		addProduct.clickProducts();
		
		assertEquals(Integer.parseInt(addProduct.numberOfProducts().getText()),3);
		Thread.sleep(2000);
		
		driver.quit();
		
	}
	
	@Test
	public void removeOneProductFromCart() throws InterruptedException{
		
		Thread.sleep(2000);
		logInWithStandardUser();
		
		Thread.sleep(2000);
		removeProduct.clickAdd();
		
		Thread.sleep(2000);
		if(removeProduct.numberOfProducts().isDisplayed()) {
			removeProduct.removeProduct();
		}
		
		assertEquals(removeProduct.addCartFirstProduct().isDisplayed(), true);
		Thread.sleep(2000);
		driver.quit();
	
	}
	
	@Test
	public void productsInCart() throws InterruptedException {
		
		Thread.sleep(2000);
		logInWithStandardUser();
		
		
		Thread.sleep(2000);
		cartProduct.clickCart();
		
		Thread.sleep(2000);
		assertEquals(cartProduct.titleOK(), true);

		
		Thread.sleep(1000);
		driver.quit();
		
	}


	

}
