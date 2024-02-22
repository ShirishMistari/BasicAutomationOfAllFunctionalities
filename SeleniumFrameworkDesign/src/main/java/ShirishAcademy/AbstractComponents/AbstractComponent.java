package ShirishAcademy.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ShirishAcademy.pageObjectDesign.CartPage;
import ShirishAcademy.pageObjectDesign.OrderPage;

public class AbstractComponent {
	WebDriver driver;
	@FindBy(css = "[routerlink*='cart']")
	WebElement goToCart;
	
	@FindBy(css = "[routerlink*='myorders']")
	WebElement GoToOrderPage;

	public AbstractComponent(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void waitForLoadingTheProducts(By findBy) { // Here only used By locator..
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));

	}
	
	public void WaitForWebElementto(WebElement findBy) { // Here only used By locator..
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findBy));

	}

	public void waitTillInvisibilityOfProduct() throws InterruptedException { // Here driver is user, i.e. WebElement
																				// locator is used
		Thread.sleep(1000); // not By locator only
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.invisibilityOf(ele));
	}

	public CartPage clickOnCart() {
		goToCart.click();
		CartPage cartpages = new CartPage(driver);
		return cartpages;
	}
	public OrderPage ClickOnOrderLink() {
		GoToOrderPage.click();
		OrderPage orderpage = new OrderPage(driver);
		return orderpage;
	}


}
