package ShirishAcademy.pageObjectDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShirishAcademy.AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {
	WebDriver driver;

	// WebElement userEmails = driver.findElement(By.id("userEmail"));
	// PageFactory
	public CartPage(WebDriver driver) {
		super(driver); // Sending child class driver to parent...
		this.driver = driver;
		// pageFactory
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='cartSection']/h3") // How these methods nows where is driver and how it will run??
	private List<WebElement> productTitles;

	@FindBy(css = ".totalRow button")
	WebElement checkOutCart;

	By products1 = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-Type");
	By waitForToastContainer = By.cssSelector("#toast-container");

	public Boolean verifyProductDisplay(String ProductsNames) {
		Boolean match = productTitles.stream().anyMatch(proctsss -> proctsss.getText().equalsIgnoreCase(ProductsNames));
		return match;
	}

	public CheckOutPage gotoCartCheckOut() {
		checkOutCart.click();
		return new CheckOutPage(driver);
	}

}
