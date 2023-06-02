package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * La clase MainPage contiene los elementos que se encuentran en esta página
 * y lo que se puede realizar en ella.
 * @author Mina
 *
 */
public class MainPage {
	
private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	//Web Elements
	
	/**
	 * Retorna el título del primer producto
	 * @return
	 */
	public WebElement titleFirstProduct() {
		return getDriver().findElement(By.id("item_0_title_link"));
		
	}
	
	/**
	 * Retorna el elemento que nos permite volver a todos los productos
	 * @return
	 */
	public WebElement backToProducts() {
		return getDriver().findElement(By.id("back-to-products"));
	}
	
	/**
	 * Retorna el elemento que nos permite añadir el primer producto
	 * al carrito
	 * @return
	 */
	public WebElement addFirst() {
		return getDriver().findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
	}
	
	/**
	 * Retorna el elemento que nos permite añadir el segundo producto
	 * al carrito
	 * @return
	 */
	public WebElement addSecond() {
		return getDriver().findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light"));
	}
	
	/**
	 * Retorna el elemento que nos permite añadir el tercer producto
	 * al carrito
	 * @return
	 */
	public WebElement addThird() {
		return getDriver().findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt"));
	}
	
	/**
	 * Retorna el elemento que nos permite ver cuántos productos hay en
	 * el carrito
	 * @return
	 */
	public WebElement numberOfProducts() {
		return getDriver().findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
	}
	
	/**
	 * Retorna el elemento que nos permite remover el primer producto
	 * del carrito
	 * @return
	 */
	public WebElement remove() {
		return getDriver().findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
	}
	
	/**
	 * Retorna el elemento del carrito de compras
	 * @return
	 */
	public WebElement shoppingCart() {
		return getDriver().findElement(By.className("shopping_cart_link"));
	}
	
	/**
	 * Retorna el título de la página cuando seleccionamos
	 * el carrito de compras
	 * @return
	 */
	public WebElement titleShoppingCartPage() {
		return getDriver().findElement(By.className("title"));
	}
	
	//Services Select Product
	
	/**
	 * Click al primer producto
	 */
	public void clickProduct() {
		titleFirstProduct().click();
	}
	
	/**
	 * Verifica si se ve el número en el carrito de compras
	 * @return
	 */
	public boolean isDisplayedBackToProducts() {
		return backToProducts().isDisplayed();
	}
	
	//Services Add Products
	
	/**
	 * Añade productos al carrito de compras
	 * @throws InterruptedException
	 */
	public void clickProducts() throws InterruptedException {
		
		addFirst().click();
		Thread.sleep(2000);
		addSecond().click();
		Thread.sleep(2000);
		addThird().click();
	}
	
	//Services Remove Products
	
	/**
	 * Añade el producto al carrito de compras
	 */
	public void clickAdd() {
		addFirst().click();
	}
	
	/**
	 * Selecciona el botón de remover producto
	 */
	public void removeProduct() {
		remove().click();
	}
	
	//Services Check Cart
	
	/**
	 * Selecciona el carrito de compras
	 */
	public void clickCart() {
		shoppingCart().click();
	}
	
	/**
	 * Verifica si se ve el título
	 * @return
	 */
	public boolean titleOK() {
		return titleShoppingCartPage().isDisplayed();
	}

}
