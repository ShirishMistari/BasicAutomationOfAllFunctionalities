package ShirishAcademy.pageObjectDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ShirishAcademy.AbstractComponents.AbstractComponent;

public class CheckOutPage extends AbstractComponent {
	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By results = By.cssSelector(".ta-results");

	@FindBy(className = "action__submit")
	WebElement submitButton;

	@FindBy(css = "[placeholder='Select Country']")
	WebElement Country;

	@FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
	WebElement selectCountry;

	public void selectCountry(String CountryName) throws InterruptedException {
		Actions a = new Actions(driver);
		a.sendKeys(Country, "india").build().perform();
		waitForLoadingTheProducts(results);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		selectCountry.click();
	}

	public ConfirmOrder submitOrder() {
		submitButton.click();
		return new ConfirmOrder(driver);
	}

}
